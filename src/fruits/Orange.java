package fruits;

public class Orange extends Fruit {
    @Override
    public String getColor() {
        return "orange";
    }

    public Orange() {
        super(1.5f);
    }
}
