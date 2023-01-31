package marinasauer.bank;

public class Account {
    private static final int  MAX_LENGTH =12;
    private String name;
    private String cc;
    private String ag;
    private double balance;

    Log logger = new Log();

    public Account(String name,String ag, String cc){
        setName(name);
        this.ag=ag;
        this.cc=cc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>MAX_LENGTH){
            this.name=name.substring(0,MAX_LENGTH);
        }else{
            this.name = name;
        }
        System.out.println(this.name);

    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public String getCc(){
        return cc;
    }

    public void setCc(String cc){
        this.cc=cc;
    }

    public boolean withDraw(double value){
        if(value>balance){
            System.out.println("Você não possui saldo para este valor de saque.");
            return false;
        }else{
            balance-= value;
            logger.out("SAQUE: R$ " + value + " Saldo atual: R$ " + balance);
            return true;
        }
    }

    public  void deposit(double value){
        balance+=value;
        logger.out("DEPÓSITO: R$ " + value + " Saldo atual: R$ " + balance);
    }

}
