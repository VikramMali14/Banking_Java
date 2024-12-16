public class Use_Bank {
    public static void main(String[] args) {

        SBI_Bank a=new SBI_Bank("anamika gupta","anamika8",98754321);
        a.login("anamika gupta","anamika8");
        a.deposite(100000);
        a.balance();
        a.withdraw(105000);

    }
}
