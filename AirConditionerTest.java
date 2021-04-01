
public class AirConditionerTest {
    public static void main(String... args){

        AirConditioner airConditioner = new AirConditioner(true,"Thermal air condition", 15);

        airConditioner.getTemperature();
        airConditioner.isOn();
        airConditioner.getTemperature();

        System.out.println("the temperature is: " + airConditioner.getTemperature());
        System.out.printf("%s%n","the air condition is on: " + airConditioner.getTemperature());
        System.out.println("the temperature is: " + airConditioner.getTemperature());
    }
}
