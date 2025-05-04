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
        ByLastWordComparator blwc = new ByLastWordComparator();
        String[] fruits = { "banana", "apple", "green apple", "cherry", "yellow banana", "red cherry" };
        String[] fruits2 = { "apple", "green apple", "yellow banana", "red cherry", "cherry", "banana" };

        Arrays.sort(fruits, blwc);
        Arrays.sort(fruits2, blwc);

        System.out.println(Arrays.toString(fruits));
        System.out.println(Arrays.toString(fruits2));
    }
}
