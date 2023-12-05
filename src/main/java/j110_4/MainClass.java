package j110_4;

public class MainClass {
    public static void main(String[] args) {
        CustomArray intArr = new IntegerArray();
        CustomArray boolArr = new BooleanArray();

        // Проверка для IntegerArray
        System.out.println(intArr);
        System.out.println();
        intArr.setTrue(1);
        intArr.setTrue(3);
        intArr.setTrue(5);
        intArr.setTrue(7);
        intArr.setTrue(9);
        System.out.println(intArr);
        System.out.println(intArr.countInTrue());

        System.out.println();
        intArr.setBool(1, false);
        System.out.println(intArr);
        System.out.println(intArr.countInTrue());

        // Проверка для BooleanArray
//        System.out.println(boolArr);
//        System.out.println();
//        boolArr.setTrue(1);
//        boolArr.setTrue(3);
//        boolArr.setTrue(5);
//        boolArr.setTrue(7);
//        System.out.println(boolArr);
//        System.out.println(boolArr.countInTrue());
    }
}
