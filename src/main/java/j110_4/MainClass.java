package j110_4;

public class MainClass {
    public static void main(String[] args) {
        CustomArray array = new IntegerArray();

        System.out.println(array);
        array.setBool(2, true);
        System.out.println(array);
        array.setBool(2, true);
        System.out.println(array);
        array.setBool(2, false);
        System.out.println(array);
        array.setBool(2, false);
        System.out.println(array);
    }
}
