package Main;

/**
 * @author Sorokin Aleksei on 20.05.2022
 **/
public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    public void add (String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
}
