package at.fhj.msd;

import java.util.Comparator;

public class ByLastWordComparator implements Comparator<String>{

      @Override
      public int compare(String o1, String o2) {
            String[] a1 = o1.split(" ");
            String[] a2 = o2.split(" ");
            
            if (a1[a1.length - 1].compareTo(a2[a2.length -1]) == 0)
            {
                  if (a1.length > a2.length)
                  {
                        return 1;
                  }
                  if (a1.length < a2.length)
                  {
                        return -1;
                  }
                  else return 0;
            }
            return switch (a1[a1.length - 1].compareTo(a2[a2.length -1])) {
                  case 1 -> 1;
                  case -1 -> -1;
                  default -> 0;
            };
      }

}
