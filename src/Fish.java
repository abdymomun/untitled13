public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println("eating smow fish");
    }

    @Override
    public void liveplace() {
        System.out.println("life in ocean");
    }
}
