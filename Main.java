public class Main {
   public static void main(String[] args) {
      
      Vehicle v1 = new Vehicle("Ford", "Mustang", 1993);
      Vehicle v2 = new Vehicle("Toyota", "Camry", 1885);         
      Vehicle v3 = new Vehicle("Tesla", "Model Y", 2027);
      
      v1.setYear(2000);
           
      System.out.println("\nVEHICLE 1");     
      v1.displayInfo();
      System.out.println("Age:" + v1.calculateAge());
      System.out.println("Vintage:" + v1.isVintage());
      
      v1.setYear(1885);
      
      System.out.println("\nVEHICLE 1");     
      v1.displayInfo();
      System.out.println("Age:" + v1.calculateAge());
      System.out.println("Vintage:" + v1.isVintage());
      
      v1.setYear(2027);
      
      System.out.println("\nVEHICLE 1");     
      v1.displayInfo();
      System.out.println("Age:" + v1.calculateAge());
      System.out.println("Vintage:" + v1.isVintage());                           
      
      System.out.println("\nVEHICLE 2");   
      v2.displayInfo();
      System.out.println("Age:" + v2.calculateAge());
      System.out.println("Vintage:" + v2.isVintage());

      System.out.println("\nVEHICLE 3");   
      v3.displayInfo();
      System.out.println("Age:" + v3.calculateAge());
      System.out.println("Vintage:" + v3.isVintage());
      

   }
}