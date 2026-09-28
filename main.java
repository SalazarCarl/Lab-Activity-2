public class Main {
   public static void main(String[] args) {
      
      Vehicle v1 = new Vehicle("Ford", "Mustang", 1993);
      Vehicle v2 = new Vehicle("Toyota", "Camry", 2026);         
      Vehicle v3 = new Vehicle("Tesla", "Model Y", 2026);
         
      
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
      System.out.println("Age:" + v2.calculateAge());
      System.out.println("Vintage:" + v2.isVintage());

   }
}