package main;


import java.util.LinkedList;
import java.util.List;

public class BankApplication_Main {

    public static void main(String[] args) {
        List<Account>accounts = new LinkedList<>();
        String file = "C:\\Users\\User.DESKTOP-R0RMATH\\Desktop\\NewBankAccounts.csv";
        List <String []> customerList= FileeReader.read(file);
       for (String[] customer :customerList ){
          String name = customer[0];
          String ssn = customer[1];
          String accountType = customer [2];
          double diposit = Double.parseDouble(customer[3]);
          if (accountType.equals("Savings")){
           accounts.add(new Savings(name,ssn,diposit));
          }
          else if (accountType.equals("Checking")){
              accounts.add(new Checking (name,ssn,diposit));
          }
          else
              System.out.println("File type error!");
       }


       for (Account acc :accounts){

           acc.showInfo();
           System.out.println("****************************************************************" +
                   "\n****************************************************************");
       }





    }
}
