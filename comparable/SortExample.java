package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
        public static void main(String[] args) {
            ArrayList<Emp> emps = new ArrayList<>();
            emps.add(new Emp("athena", "8272837383", 2)); 
            emps.add(new Emp("mamba", "7272835433", 1));
            emps.add(new Emp("levinho", "9272837383", 3));

            System.out.println(emps);

            Collections.sort(emps);

            System.out.println(emps + " after sorting");


        }
}

// Output
- 1  (sorting based on ID's)
- 2
- 3
