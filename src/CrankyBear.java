public class CrankyBear extends Bear{
    private int consumingLevel;
    boolean batteryLevelLow = false;
    CrankyBear(int consumingLevel){
        super(consumingLevel);
        this.consumingLevel = consumingLevel;
    }

    @Override
    public void speak() {
        if(getBatteryLevel() >= 50){
            System.out.println("I Love You!");
            consumingBattery(this.consumingLevel);
        }
        if(this.getBatteryLevel() < 50 && !batteryLevelLow){
            batteryLevelLow = true;
            System.out.println("I'm dying for you!");
        }
    }
}
