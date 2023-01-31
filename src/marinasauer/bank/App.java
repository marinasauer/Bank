package marinasauer.bank;

public class App {
    public static void main(String[] args) {
       Account account = new Account("Leoncio Martins","001","12345");


       account.withDraw(200.00);
       account.deposit(500.00);

       account.deposit(1024.65);

       System.out.println(account);

    }
}