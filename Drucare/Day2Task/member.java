package Drucare.Day2Task;

public class member {
   String Name;

int Age;


int phoneNumber;

String address;

int Salary;




    public  void printSAlary(){
    System.out.println("Salary of a Employee");
}




    public member(String name, int age, int phoneNumber, String address, int salary) {
        Name = name;
        Age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "member{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
