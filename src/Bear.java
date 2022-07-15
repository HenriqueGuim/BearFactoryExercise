public class Bear {
    private String makeNoise = "I Love You!";
    private int batteryLevel = 100;
    private int minLevel;
    private int consumingLevel;

    Bear(){

    }


    Bear(int consumingLevel){
        this.consumingLevel = consumingLevel;
    }
    Bear(int minLevel, int consumingLevel){
        this.minLevel = minLevel;
        this.consumingLevel = consumingLevel;
    }

    public void consumingBattery(int consumingLevel){
        batteryLevel -= consumingLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void speak(){
        if(batteryLevel>consumingLevel-1)System.out.println(this.makeNoise);
        this.batteryLevel -= consumingLevel;
    }

}
