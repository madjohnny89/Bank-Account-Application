package main;

import java.util.Random;

public class Checking extends Account {
    private String  debitCardId;
    private String debitCardKey;

    public Checking (String name,String ssN,double balance){
        super(name,ssN,balance);
        accountNumber="2"+accountNumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate= getBaseRate() * .15;
    }

    public void setDebitCard(){
        Random random = new Random();
        int i=1;
        debitCardId= String.valueOf(random.nextInt(10));
        debitCardKey= String.valueOf(random.nextInt(10));
       while (i!=12){
           debitCardId=debitCardId+random.nextInt(10);
           i++;
       }
       i=1;
        while (i!=4){
            debitCardKey=debitCardKey+random.nextInt(10);
            i++;
        }
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Checking Account Information "+
                "\nDebit Card ID : "+debitCardId+
                "\nDebit Card PIN : "+debitCardKey);

    }
}
