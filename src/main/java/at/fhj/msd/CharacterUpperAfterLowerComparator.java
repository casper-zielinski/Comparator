package at.fhj.msd;

import java.util.Comparator;

public class CharacterUpperAfterLowerComparator implements Comparator<Character> {

      @Override
      public int compare(Character o1, Character o2) {
            if (Character.isDigit(o1) || Character.isDigit(o2))
            {
                  if (Character.isDigit(o1) && !(Character.isDigit(o2)))
                  {
                  return 1;
                  }
                  if (Character.isDigit(o2) && !(Character.isDigit(o1)))
                  {
                  return -1;
                  }
                  else{
                        if (o1 > o2) return 1;
                        if (o1 < o2) return -1;
                        else return 0;
                  }
            }
            else if   (Character.isLowerCase(o1) || Character.isLowerCase(o2))
            {
                  if (Character.isLowerCase(o1) && !(Character.isLowerCase(o2)))
                  {
                  return -1;
                  }
                  if (Character.isLowerCase(o2) && !(Character.isLowerCase(o1)))
                  {
                  return 1;
                  }
                  else{
                        if (o1 > o2) return 1;
                        if (o1 < o2) return -1;
                        else return 0;
                  }
            }
            else
            {
                  if (o1 > o2) return 1;
                  if (o1 < o2) return -1;
                  else return 0;
            }
            
      }

}
