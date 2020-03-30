package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Lab lab;
    List<Lab> labs;

    public Student() {
        this(new ArrayList());


    }

    public Student(List<Lab> labs) {
        this.labs=labs;
    }

    public Lab getLab(String labName) {
     return this.lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
     lab.setStatus(labStatus);



    }

    public void forkLab(Lab lab) {
        this.lab =lab;
    }

    public LabStatus getLabStatus(String labName) {
        return lab.getStatus();
    }
}
