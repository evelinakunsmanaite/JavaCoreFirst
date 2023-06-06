public class FillingStation {
   private static int fuelType = 95; //тип топлива
   private static int amount = 50; //количество топлива

   private static double fuel95price = 3.37;
   private static double fuel92price = 4.23;

   public static double countPrice(){
      double price = 0;
      if (fuelType == 95) {
         price = fuel95price * amount;
      } else if (fuelType == 92) {
         price = fuel92price * amount;
      }
      return price;
   }
}

