import java.util.*;

public class Reverse {
    String word;
    char[] ar;
    int le;

    public Reverse(String word) {
        this.word = word;
        char[] arr = word.toCharArray();
        int length = word.length();
        this.ar = arr;
        this.le = length;
    }

    void reverse() {
        for (char i : ar) {
            System.out.print(ar[le - 1]);
            le = le - 1;
        }

    }


}
