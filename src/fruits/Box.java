package fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {
    private final List<F> fruits = new ArrayList<>();

    public void add(F fruit) {
        fruits.add(fruit);
    }

    public void sendTo(Box<F> to) {
        for (F fruit : fruits) {
            to.add(fruit);
        }
        fruits.clear();
    }

    public float getWeight() {
        float weight = 0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> other) {
        return getWeight() == other.getWeight();
    }
}
