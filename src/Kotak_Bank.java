public class Kotak_Bank extends Banking_Services {
    Banking a=new Banking();
    protected static int b=0;
    public boolean login(String name, String pass){
        return a.login(name,pass);
    }
    public boolean register(String name,String pass,int acno){
        a.SignOut();
        return a.register(name,pass,acno);
    }
    public Kotak_Bank(String name,String pass,int acno){
        a.register(name,pass,acno);
    }

    @Override
    boolean withdraw(int a1) {
        if (a.login()) {
            if (a1 > b) {
                System.out.println("Insufficient fund");
                return false;
            } else {
                b -= a1;
                System.out.println(b);
                return true;
            }}
        else{
            System.out.println("You are Logout");
            return false;
        }

    }
    @Override
    boolean deposite(int a1) {
        if(a.login()){   b += a1;
            System.out.println(b);
            return true;
        }
        else {
            System.out.println("You are Logout");
            return false;
        }
    }

    @Override
    int balance() {
        if(a.login()){   System.out.println(b);
            return b;
        }
        else {
            System.out.println("You are Logout");
            return 0;
        }
    }

    @Override
    boolean account_closing(String user,String pass,int acno) {
        if(a.RemoveUser(user,pass,acno)){
            System.out.println("user Removed;");
            a.SignOut();
            b=0;
            return true;
        }
        return false;
    }
}
