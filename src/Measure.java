public abstract class Measure implements Calculator {
    protected int weight;
    protected int height;
    protected int age;

    public Measure(int weight, int height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
