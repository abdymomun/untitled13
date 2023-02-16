public class Main {
    public static void main(String[] args) {
Cow cow = new Cow("Cow ",10);
        Fish fish = new Fish("Shark ",400);
        Wolf wolf = new Wolf("black wolf ",14);
        System.out.println("name "+cow.getName()+"age "+cow.getAge());cow.eating();cow.liveplace();
        System.out.println("name "+fish.getName()+"age "+fish.getAge());fish.eating();fish.liveplace();
        System.out.println("name "+wolf.getName()+"age "+wolf.getAge());wolf.eating();wolf.liveplace();
    }
}