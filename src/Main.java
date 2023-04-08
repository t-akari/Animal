public class Main {
    public static void main(String[] args) {
        String[] names = {"犬", "猫", "鳥", "羊"};
        int index = 4;
        try {

            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲を超えています。");
        }
    }
}