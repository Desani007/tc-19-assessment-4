package rocks.zipcode.io.assessment4.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    LabStatus labStatus;
    String labName;
    public Lab() {
        this.labStatus=LabStatus.PENDING;


    }

    public Lab(String labName) {
        this.labName =labName;
        this.labStatus=LabStatus.PENDING;

    }

    public String getName() {

        return this.labName;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus=labStatus;
    }

    public LabStatus getStatus() {
        return this.labStatus;
    }
}
