public class  Cow extends Animal {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("eating grass");
    }


    @Override
    public void liveplace() {
        System.out.println("life in born");
    }
}
