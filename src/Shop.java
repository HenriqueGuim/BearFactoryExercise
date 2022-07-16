public class Shop {
    private int numberOfBear =1;
    private String name;

    public Shop (String name){
        this.name = name;

    }
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

    public String bestShop(Shop shop1, Shop shop2){
        Shop winnerShop  = shop1.numberOfBear < shop2.numberOfBear? shop2 : shop1;
        return "Best shop is " + winnerShop.getName() + " with " + winnerShop.getNumberOfBear() + " bears made!";
    }

    private int getNumberOfBear() {
        return this.numberOfBear;
    }


    public String getName() {
        return this.name;
    }
}
