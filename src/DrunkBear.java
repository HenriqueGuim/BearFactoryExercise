public class DrunkBear extends Bear {

    DrunkBear() {
        super();
    }

    private int random(){
        return (int) (Math.random() * 10 + 1);
    }
    @Override
    public void speak() {
        if (random() > 2) {
            System.out.println("I Love You!");
            return;
        }
        System.out.println("ZZZZZZZZZZZZZZZ");
    }
}
