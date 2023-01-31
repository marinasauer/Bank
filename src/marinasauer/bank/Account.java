package marinasauer.bank;

public class Account {
    private String name;
    private String cc;
    private String ag;
    private double balance;
    private static final int  MAX_LENGTH =12;

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

    public void withDraw(double value){
        balance=-value;
        System.out.println("Valor do saque: " + value + ".\n" + "Valor total na conta: " + balance + ".");
    }

}
