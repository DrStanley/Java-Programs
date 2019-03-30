/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author jekwu
 */
import java.util.*;
class cAccount{
        double Ballance = 500000.0;
        private String Sname;
        private String Mname;
        private String Lname;
        private String Accname;
        private String Nofkin;
        private String StateofOrigin;
        private String LGA;
        int age;
     public String getSname() {
      return Sname;
   }  
     public String getMname() {
      return Mname;
   }
      public String getLname() {
      return Lname;
   }  
      public String getName() {
      return Accname;
   }
         public String get() {
      return Sname;
   }  
         public String getStateofOrigin() {
      return StateofOrigin;
   }  
         public String getLGA() {
      return LGA;
   }
            public String getNofkin() {
      return Nofkin;
   }
            
         public int getAge(){
    return age;
    }
      void setALLname(String newSname,String newMname,String newLname) {
      Mname = newMname;
      Sname = newSname;
      Lname = newLname;
   }
    
      void setName() {
          System.out.println("Account Created!!!");
      Accname ="Account name: "+Sname+" "+Mname+" "+Lname;
   }
       void setNofkin(String newNofkin) {
      Nofkin = newNofkin;
   }
        void setLga(String newLga) {
      LGA = newLga;
   }
         void setStateofOrigin(String newStateofOrigin) {
      StateofOrigin = newStateofOrigin;
   }
   
      void setAge(int newAge) {
      age = newAge;
   }
        void AccNum() {
       System.out.println(getName());
     int Accnum ;
     Accnum = 1000001010+(age*2);
            System.out.println("Acount number: "+Accnum);
   }
 void Date(){
 
 }     
    
    public void Withdraw(double amount){
        System.out.println("withdrew: "+amount+" from: "+Ballance);
       if (Ballance<amount){
           System.out.println("Insuficient Fund");
       }
       else  {
        Ballance-= amount;
        }
                System.out.println("Ballance = "+Ballance);

    }
     public void Deposit(int amount){
                 System.out.println("Deposited: "+amount+" to: "+Ballance);

        Ballance+= amount;
         System.out.println("Ballance = "+Ballance);
    }
    }
public class AccountCWD {
        public static void main(String[] args) {
            char ans,proceed;
            String sn,mn,ln,sog,nok,lga,err; int ag,a;
            Scanner input = new Scanner(System.in);
            cAccount obj = new cAccount();
            System.out.println("Do you have an account (Y/N)");
            ans = input.next().charAt(0);
            if (ans == 'N'){
                System.out.println("\t\t\t*****Welcome pls fill the form carefully*****");
                  System.out.println("Creating.........");
           //err =input.nextLine();
                System.out.println("Enter your surname");
            sn=input.nextLine();
            System.out.println("Enter your middlename");
            mn=input.nextLine();
            System.out.println("Enter your lastname");
            ln=input.nextLine();
            System.out.println("Enter your state of origin");
            sog=input.nextLine();
            System.out.println("Enter your next of kin");
            nok=input.nextLine();
            System.out.println("Enter your LGA");
            lga=input.nextLine();
            System.out.println("Enter your Age");
            ag=input.nextInt();
           obj.setALLname(sn, mn, ln);
            obj.setNofkin(nok);
            obj.setStateofOrigin(sog);
            obj.setLga(lga);
            obj.setAge(ag);
            obj.setName();
            obj.AccNum();
                }
            else if(ans=='Y'){
                System.out.println("Do you want to deposit(D)or Withdral(W)");
             proceed = input.next().charAt(0);
                if(proceed=='D'){
                    System.out.println("Enter amount");
                    a=input.nextInt();
                            obj.Deposit(a);

                }
                else{ 
                        System.out.println("Enter Amount");
                        a=input.nextInt();
                            obj.Withdraw(a);
                }
                
            
            }
}
}
