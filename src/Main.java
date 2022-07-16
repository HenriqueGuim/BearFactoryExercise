public class Main {
    public static void main(String[] args) {
        Shop shop1 = new Shop("Frank's Bears");

        Bear[] arr = new Bear[5];
        Util.generateBears(arr, shop1, 30, 30);

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

        Shop shop2 = new Shop("Lincoln Bear Shop");
        Bear[] arr2 = new Bear[20];

        Util.generateBears(arr2, shop2, 30, 25);

        System.out.println("Shop 2 ----------");
        arr2[1].speak();
        arr2[1].speak();
        arr2[1].speak();
        arr2[1].speak();
        arr2[1].speak();
        System.out.println("=============");
        arr2[0].speak();
        arr2[0].speak();
        arr2[0].speak();
        arr2[0].speak();
        arr2[0].speak();
        arr2[0].speak();

        System.out.println(shop2.bestShop(shop1,shop2));
    }
}
