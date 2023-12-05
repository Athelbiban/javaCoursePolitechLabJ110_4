package j110_4;

public class IntegerArray implements CustomArray{
    private final int[] ARRAY = new int[size/32];

    // проверка элемента с заданным индексом
    @Override
    public boolean getByIndex(int index) {
        dataVerification(index);
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = ARRAY[indexArray];
        return (mask & element) == mask;
    }

    // инвертирование элемента с заданным индексом
    @Override
    public void revers(int index) {
        dataVerification(index);
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = ARRAY[indexArray];
        ARRAY[indexArray] = mask ^ element;
    }

    // установка в true элемента с заданным индексом
    @Override
    public void setTrue(int index) {
        dataVerification(index);
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = ARRAY[indexArray];
        ARRAY[indexArray] = mask | element;
    }

    // установка элемента с заданным индексом заданным логическим значением
    @Override
    public void setBool(int index, boolean value) {
        if (value) {
            this.setTrue(index);
        }
        else {
            this.setFalse(index);
        }
    }

    // сброс в false элемента с заданным индексом
    @Override
    public void setFalse(int index) {
        dataVerification(index);
        int indexArray = index / 32;
        int bit = index % 32;
        int mask = 1 << bit;
        int element = ARRAY[indexArray];
        ARRAY[indexArray] = (mask | element) ^ mask;
    }

    // метод, возвращающий количество элементов в true
    @Override
    public int countInTrue() {
        int indexArray = 0, count = 0;
        while (indexArray < size) {
            count += getByIndex(indexArray) ? 1 : 0;
            indexArray++;
        }
        return count;
    }

    // метод toString()
    @Override
    public String toString() {
        String[] str = new String[size];
        for (int i=0 ; i < size ; i++) {
            str[i] = getByIndex(i) ? "1" : "0";
        }
        return "[" + String.join(", ", str) + "]";
    }

    private static void dataVerification(int data) {
        if (data < 0 || data >= size) throw new IllegalArgumentException(
                "IllegalArgumentException: number must be >= 0 and < 1024"
        );
    }
}
