package at.fhj.msd;

import java.util.Comparator;

public class ByLastWordComparator implements Comparator<String>{

      @Override
      public int compare(String o1, String o2) {
            String[] a1 = o1.split(" ");
            String[] a2 = o2.split(" ");
            
            if (a1[a1.length - 1].compareTo(a2[a2.length -1]) == 1)
            {
                  return 1;
            }
            else if(a1[a1.length - 1].compareTo(a2[a2.length -1]) == -1)
            {
                  return -1;
            }
            else return 0;
      }

}
