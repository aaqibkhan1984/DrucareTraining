package Drucare.Day2Task;

public class DemoMain {
    public static void main(String[] args) {



        Employee emp1 = new Employee(new member("aaqib",22,87,"Chandrapur",1200),"it","drucare");


        System.out.println(emp1.getSpecialization());
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getPhoneNumber());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getSalary());

        Manager  m =new Manager("it","drucare",new member1("aa",23,8898,"chandrapur",8880));
        System.out.println(m.getSpecialization());
        System.out.println(m.getName());
        System.out.println(m.getAge());
        System.out.println(m.getPhoneNumber());
        System.out.println(m.getAddress());
        System.out.println(m.getSalary());


    }
}