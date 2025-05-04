package at.fhj.msd;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] strings = {"apple", "Banana", "cherry", "Apple", "banana", "Cherry"};
        StringIgnoreCaseComparator sicc = new StringIgnoreCaseComparator();
        Arrays.sort(strings,sicc );
        System.out.println(Arrays.toString(strings));
        Character[] chars = {'b', '2', 'M', 'n', '4', 'B', 'N', 'm'};
        CharacterUpperAfterLowerComparator cualc = new CharacterUpperAfterLowerComparator();
        Arrays.sort(chars, cualc );
        System.out.println(Arrays.toString(chars));
    }
}
