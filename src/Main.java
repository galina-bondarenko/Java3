import fruits.Apple;
import fruits.Box;
import fruits.Fruit;
import fruits.Orange;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static <T> T[] swap(T[] array, int a, int b) {
        T v = array[a];
        array[a] = array[b];
        array[b] = v;
        return array;
    }

    public static <T> ArrayList<T> toArrayList(T[] array) {
        ArrayList<T> ts = new ArrayList<>();
        Collections.addAll(ts, array);
        return ts;
    }

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[]{new Orange(), new Apple()};
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getColor());
        }
        for (Fruit fruit : toArrayList(swap(fruits, 0, 1))) {
            System.out.println(fruit.getColor());
        }
        Box<Orange> oranges = new Box<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        System.out.println(oranges.getWeight());

        Box<Orange> oranges2 = new Box<>();
        oranges2.add(new Orange());
        oranges2.add(new Orange());
        oranges2.add(new Orange());
        oranges2.add(new Orange());
        System.out.println(oranges2.getWeight());
        System.out.println(oranges.compare(oranges2));
        oranges2.sendTo(oranges);
        System.out.println(oranges.getWeight());
        System.out.println(oranges.compare(oranges2));

        Box<Apple> apples = new Box<>();
        for (int i = 0; i < 12; i++) {
            apples.add(new Apple());
        }
        System.out.println(apples.getWeight());
        System.out.println(apples.compare(oranges));
    }
}
