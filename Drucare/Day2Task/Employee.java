package Drucare.Day2Task;

public class Employee extends member {


member mem;
    String specialization;

    String    department;

    public Employee(member mem, String specialization, String department) {
       super(mem.Name, mem.Age, mem.phoneNumber, mem.address, mem.Salary);
        this.specialization = specialization;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public member getMem() {
        return mem;
    }
}
