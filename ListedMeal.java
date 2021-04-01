

public class ListedMeal {
    public static double calculateTotalMeal(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
       return result;
    }
    public static void main(String... args){
        double getGropPayment = calculateTotalMeal(15, 4, .09);
        System.out.println(getGropPayment);

        double individualPayment = getGropPayment/23;
        System.out.println(individualPayment);
    }
}
