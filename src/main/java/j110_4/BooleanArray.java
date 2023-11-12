package j110_4;

public class BooleanArray implements CustomArray {
    private int[] array = new int[size/32];
    @Override
    public boolean getByIndex(int index) {
        return false;
    }

    @Override
    public void revers(int index) {
    }

    @Override
    public void setTrue(int index) {

    }

    @Override
    public void setBool(int index, boolean value) {

    }

    @Override
    public String toString() {
        String[] str = new String[size];
        for (int i=0 ; i < size ; i++) {
            str[i] = getByIndex(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }
}
