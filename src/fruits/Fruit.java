package fruits;

public abstract class Fruit {
    private float weight;

    protected Fruit(float weight) {
        this.weight = weight;
    }

    public abstract String getColor();

    public float getWeight() {
        return weight;
    }
}
