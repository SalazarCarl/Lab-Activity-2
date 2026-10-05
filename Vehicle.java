public class Vehicle {

   private String brand;
   private String model;
   private int year;
   
   Vehicle(String brand, String model, int year) {
   this.brand = brand;
   this.model = model;
      if(year >= 1886 && year <= 2026) {
         this.year = year;
      }else {
         this.year = 2026;
      }     
   }
               
    void displayInfo() {
      System.out.println(getBrand() + ", " + getModel() + ", " + getYear());
   }   

   int calculateAge() {
      return 2026-getYear();
      
   }
   
   boolean isVintage() {
      return calculateAge()>25;  
   }
   
   public String getBrand() {
      return brand;
   }
   
   public String getModel() {
      return model;
   }
   
   public int getYear() {
      return year;
   }
   
   public boolean setYear(int year){
      if(year >= 1886 && year <= 2026) {
      this.year = year;
      return true;
      }else {
      return false;      
      }
   }
      
   
}
