package at.fhj.msd;

import java.util.Comparator;

public class StringIgnoreCaseComparator implements Comparator<String> {

      @Override
      public int compare(String o1, String o2) {
            if (o1.compareToIgnoreCase(o2) >= 1) return 1;
            if (o1.compareToIgnoreCase(o2) <= -1) return -1;
            else return 0;
      }
      

}
