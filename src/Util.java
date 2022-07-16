import java.lang.reflect.Array;

public class Util {

    public static void generateBears(Bear[] arr, Shop shop, int minLevel, int consumingLevel){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = shop.produceBear(minLevel, consumingLevel);
        }
    }
}
