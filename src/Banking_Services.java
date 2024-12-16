public abstract class Banking_Services {
    abstract boolean withdraw(int a);

    abstract boolean deposite(int a);

    abstract int balance();
    abstract boolean account_closing(String user,String pass,int acno);

}
