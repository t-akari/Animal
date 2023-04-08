import java.util.ArrayList;
import java.util.List;


public class Animal {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("犬");
        animals.add("猫");
        animals.add("鳥");
        animals.add("羊");

        System.out.println(animals.size());
        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.get(2));
        System.out.println(animals.get(3));
    }
}