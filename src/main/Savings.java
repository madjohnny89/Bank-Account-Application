package main;

import java.util.Random;

public class Savings extends Account {
    private String safetyDipositeboxId;
    private String getSafetyDipositeboxKey;


    public Savings (String name,String ssN,double balance){
        super(name,ssN,balance);
        accountNumber="1"+accountNumber;
        setSafetyDipositebox();

    }

    @Override
    public void setRate() {
      rate = getBaseRate() - .25 ;
    }

    public void setSafetyDipositebox(){
        Random random= new Random();
        safetyDipositeboxId= String.valueOf(random.nextInt(10));
        getSafetyDipositeboxKey= String.valueOf(random.nextInt(10));
        int q=1;
        while (q!=3){
            safetyDipositeboxId= safetyDipositeboxId+random.nextInt(10);
            q++;
        }
        q=1;
        while (q!=4){
            getSafetyDipositeboxKey= getSafetyDipositeboxKey + random.nextInt(10);
            q++;
        }

    }


    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Savings Account Information "+
                "\nSafety Deposit Box ID: "+safetyDipositeboxId+
                "\nSafety Deposit Box Key: "+getSafetyDipositeboxKey);

    }

}
