package Drucare.Day2Task;

public class Manager extends  member1{


    String specialization;

    String department;


    member1 mem1;


    public Manager(String specialization, String department, member1 mem1) {
        super(mem1.Name, mem1.Age, mem1.phoneNumber, mem1.address, mem1.Salary);
        this.specialization=specialization;
        this.department = department;
        this.mem1 = mem1;
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

    public member1 getMem1() {
        return mem1;
    }

    public void setMem1(member1 mem1) {
        this.mem1 = mem1;
    }
}