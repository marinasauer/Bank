package marinasauer.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account("Leoncio Martins","001","12345");

        while (true){
            System.out.println("Digite D para depósito, S para saque e E para sair");
            String op = input.nextLine();
            if (op.equalsIgnoreCase("d")){
                System.out.println("Insira o valor que deseja depositar");
                double value= input.nextDouble();
                account.deposit(value);
            }else if(op.equalsIgnoreCase("s")){
                System.out.println("Insira o valor que deseja sacar");
                double value = input.nextDouble();
                account.withDraw(value);
                }else if(op.equalsIgnoreCase("e")){
                System.out.println(account.toString());
                break;

            }else{
                System.out.println("Comando inválido");
            }
            input = new Scanner(System.in);
            }
        }



    }
