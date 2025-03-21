package ComparablePractice;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("athena", "8272837383", 2));
        emps.add(new Emp("levinho", "8474840191", 1));
        emps.add(new Emp("mamba", "6293729383", 4));
        emps.add(new Emp("mortal", "029389202", 3));

       // System.out.println("emps sorted are " + emps);

        Collections.sort(emps);

        System.out.println("emps details after sorting are " + emps);
    }
}

// Output 

- based on ID (for Descending order)
