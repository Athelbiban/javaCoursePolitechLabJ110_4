package j110_4;

public interface CustomArray {

    int size = 64;

    boolean getByIndex(int index);
    void revers(int index);
    void setTrue(int index);
    void setBool(int index, boolean value);
    void setFalse(int index);
    int countInTrue();
}
