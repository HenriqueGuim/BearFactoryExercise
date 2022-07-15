public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop();

        Bear[] arr = new Bear[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = shop1.produceBear(30, 30);
        }

        arr[0].speak();
        arr[0].speak();
        arr[0].speak();
        arr[0].speak();
        System.out.println(" ");
        arr[1].speak();
        arr[1].speak();
        arr[1].speak();
        arr[1].speak();
        arr[1].speak();
        arr[1].speak();
        System.out.println();
        arr[2].speak();
        arr[2].speak();
        arr[2].speak();
        arr[2].speak();
        arr[2].speak();
        System.out.println();
        arr[4].speak();
        arr[4].speak();
        arr[4].speak();
        arr[4].speak();
        arr[4].speak();


    }
}
