package ComparablePractice;

public class Emp implements Comparable<Emp> {
    public String name;
    public String phone;
    public int empId;

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }


//    public String getName(){   // write this due to Comparable interface for String, float or Double not for int or long
//        return name;
//    }

    @Override
    public int compareTo(Emp o) {
       // return Double.compare(o.empId, this.empId);  // similarly for Float as well (for Descending order)
        return this.empId - o.empId;  // for int (for Descending order)
    }


//    @Override
//    public int compareTo(Emp o) {
//        return o.name.compareTo(this.name);  // for String (for Descending order)
//    }

    @Override
    public String toString(){
        return "\n name:- " + name + "\n phone:- " + phone + "\n empId:- " + empId;
    }
}
