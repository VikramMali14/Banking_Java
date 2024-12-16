import java.util.HashMap;

public class Banking{
    protected static HashMap<String,String> val=new HashMap<>();
    protected static HashMap<String,Integer> Ac_No=new HashMap<>();
    protected static boolean islogin=false;
    public boolean login(String user,String pass){
    if(val.containsKey(user)){
        if(val.get(user).equals(pass)){
            islogin=true;
            System.out.println("successfully login");
            return true;
        }
        else {
            System.out.println("Incorrect pass");
            return false;

        }
    }
    else {
        return false;
    }
    }
    public boolean register(String user,String pass,int a){
        if(val.containsKey(user)){
            return false;
        }
        val.put(user,pass);
        Ac_No.put(user,a);
        return true;
    }
    public boolean RemoveUser(String user,String pass,int acno){
        if(Ac_No.containsValue(acno)){
            if(val.get(user).equals(pass)&& Ac_No.get(user)==acno){
                Ac_No.remove(user);
                val.remove(user);
                return true;
            }
        }
        System.out.println("Some Error Occure");
        return false;
    }
    public void SignOut(){
        islogin=false;
    }
    public boolean login(){
        return islogin;
    }
}
