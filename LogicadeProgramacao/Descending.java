package LogicadeProgramacao;

import java.util.Arrays;
import java.util.Collections;


public class Descending {
    public static void main(String[] args) {
        Integer[] descending = {1,3,4,6,2};
        Arrays.sort(descending, Collections.reverseOrder());
        System.out.println(Arrays.toString(descending));
        System.out.println(descending.getClass().getSimpleName());
    }
}
