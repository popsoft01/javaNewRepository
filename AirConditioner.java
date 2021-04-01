
public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;

    public AirConditioner(boolean isOn, String productName, int temperature){
        this.isOn = isOn;
        this.productName = productName;
        this.temperature = temperature;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    public boolean isOn() {
        if (isOn = true)
            temperature = 16;
        return isOn;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductName() {
        return productName;
    }

    public void decreaseTemprature(){
        this.temperature = temperature;
    }

    public void increaseTemperature(){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void decreaseTemperature(int temperature) {
        temperature =-- temperature;
    }
    public void increaseTemperature(int temperature) {
        temperature =++ temperature;
    }

}
