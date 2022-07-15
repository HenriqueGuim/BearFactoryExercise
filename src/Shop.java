public class Shop {
    private int numberOfBear =1;


    public Bear produceBear(int minLevel, int consumingLevel){
        if(this.numberOfBear%5 == 0){
            numberOfBear++;
             Bear crankyBear = new CrankyBear(consumingLevel);

             return crankyBear;
        }
        if(this.numberOfBear%2 == 0){
            numberOfBear++;
             Bear simpleBear = new SimpleBear(minLevel, consumingLevel);
             return simpleBear;
        }
        numberOfBear++;
        Bear drunkBear = new DrunkBear();
        return drunkBear;
    }
}
