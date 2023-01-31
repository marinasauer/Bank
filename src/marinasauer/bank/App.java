package marinasauer.bank;

public class App {
    public static void main(String[] args) {
       Account account = new Account("Leoncio Martins","001","12345");

       account.withDraw(200.00);
    }
}