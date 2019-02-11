package main;

public abstract class Account implements IBaseRate {
   private String name;
  private    String ssN;
   private double balance;

   private static  int unique = 10000 ;
    protected String accountNumber;
   protected double rate;
   private double accuredInterest;
   private double originalBalance;


    public Account (String name,String ssN,double balance){
        this.name=name;
        this.ssN=ssN;
        this.balance=balance;
        this.originalBalance=balance;
        this.accountNumber=setAccountNumber();
        unique++;
        setRate();
        this.accuredInterest=compound();

    }

    public abstract void setRate();
    public void deposit(double balanc){
        balance=balance+balanc;


    }
    public void transfer(String where,double balanc){
        balance=balance-balanc;
        System.out.println(balanc+" $ is Transferred to "+where);

    }
    public void withdraw(double balanc){
        balance=balance-balanc;

    }
    public double compound(){
        double lastinterest= balance* (rate/100);
        balance = balance+lastinterest;
        return lastinterest;
    }


    private String setAccountNumber(){
      String lastTwo= ssN.substring(ssN.length()-2,ssN.length());
      int uni= unique;
      int ran = (int) (Math.random()*Math.pow(10,3));
      lastTwo=lastTwo+uni+ran;
      return lastTwo;
    }
    protected void showInfo(){
        System.out.println("Name: "+name+
                        "\nAccount Number: "+accountNumber+
                        "\nSSN: "+ssN+
                        "\nOriginal Balance: "+originalBalance+
                        "$\nRate: "+rate+"%"+
                        "\nAccured Interest: "+accuredInterest+
                        "$\nTotal Balance: "+balance+
                        "$\n"
                        );
    }

}
