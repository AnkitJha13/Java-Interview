package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortExample {
        public static void main(String[] args) {
            ArrayList<Emp> emps = new ArrayList<>();
            emps.add(new Emp("athena", "8272837383", 2)); 
            emps.add(new Emp("mamba", "7272835433", 1));
            emps.add(new Emp("levinho", "9272837383", 3));

            System.out.println(emps);

            Collections.sort(emps, new IdComparator());

            System.out.println(emps + " after sorting based on ID");   // here the first output will be sorted based on id 


            ArrayList<Emp> emp1 = new ArrayList<>(emps);

            Collections.sort(emp1, new NameComparator());

            System.out.println(emp1 + " after sorting based on name");  // after that this will be printed based on name
 

        }
}
