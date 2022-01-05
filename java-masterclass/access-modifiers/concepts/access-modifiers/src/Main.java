public class Main {
    public static void main(String[] args) {
        Account andysAccount = new Account("Andy");
        andysAccount.deposit(1000);
        andysAccount.withdraw(500);
        andysAccount.withdraw(-200);
        andysAccount.deposit(-20);
        andysAccount.calculateBalance();

        // Since we have access to public, we open it to flaws
        // such as editing someone's balance which is bad
        // andysAccount.balance = 5000;

        System.out.println("Balance on account is " + andysAccount.getBalance());
    }
}
