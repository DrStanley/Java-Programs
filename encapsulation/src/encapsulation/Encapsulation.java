/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation; 
class EncapTest {
    private String name;
    private String month;
    private int year;
    private int rent;
    private int expire;
   public int getRent() {
      return rent;
   }
 public int getExpire() {
      return expire;
   }
   public String getName() {
      return name;
   }
    public String getMonth() {
      return month;
   }

   public int getYear() {
      return year;
   }

   void setRent( int newRent) {
      rent = newRent;
   }
  void setExpire( int newExpire) {
      expire = newExpire;
   }
   public void setName(String newName) {
      name = newName;
   }
 public void setMonth(String newMonth) {
      month = newMonth;
   }
   public void setYear( int newYear) {
      year = newYear;
   }
}
    
public class Encapsulation {

    public static void main(String[] args) {
      EncapTest encap = new EncapTest();
      encap.setName("ozoezi stanley");
      encap.setYear(2017);
      encap.setMonth("february");
      encap.setExpire(encap.getYear()+1);
      System.out.println("Name : " + encap.getName()  );
        System.out.println("Amount paid : " + encap.getRent());
        System.out.println("Year paid: "+encap.getYear()+" ,"+encap.getMonth());
        System.out.println("Year expiring: "+encap.getExpire()+" ,"+encap.getMonth());
  }  
    } 
    

