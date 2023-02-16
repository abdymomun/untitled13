public class Wolf extends Animal{
    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void eating() {
        System.out.println(" eating meat");
    }

    @Override
    public void liveplace() {
        System.out.println("life in forest");
    }
}
