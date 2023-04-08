import java.util.ArrayList;
import java.util.List;


public class Animal {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("犬");
        animals.add("猫");
        animals.add("鳥");
        animals.add("羊");

        for (String name : animals) {
            System.out.println(name);
        }
    }
}