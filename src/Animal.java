import java.util.List;


public class Animal {
    public static void main(String[] args) {

        List<String> animals = List.of("dog", "cat", "bird", "lamb", "boar");
        animals.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}