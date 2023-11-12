package j110_4;

public class BooleanArray implements CustomArray {
    private final boolean[] ARRAY = new boolean[size];

    @Override
    public boolean getByIndex(int index) {
        dataVerification(index);
        return ARRAY[index];
    }

    @Override
    public void revers(int index) {
        dataVerification(index);
        ARRAY[index] = !ARRAY[index];
    }

    @Override
    public void setTrue(int index) {
        dataVerification(index);
        ARRAY[index] = true;
    }

    @Override
    public void setBool(int index, boolean value) {
        dataVerification(index);
        ARRAY[index] = value;
    }

    @Override
    public void setFalse(int index) {
        dataVerification(index);
        ARRAY[index] = false;
    }

    @Override
    public int countInTrue() {
        int index = 0, count = 0;
        while (index < size) {
            count += getByIndex(index) ? 1 : 0;
            index++;
        }
        return count;
    }

    @Override
    public String toString() {
        String[] str = new String[size];
        for (int i=0 ; i < size ; i++) {
            str[i] = getByIndex(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }

    private static void dataVerification(int data) {
        if (data < 0 || data >= size) throw new IllegalArgumentException(
                "IllegalArgumentException: number must be >= 0 and < 1024"
        );
    }
}
