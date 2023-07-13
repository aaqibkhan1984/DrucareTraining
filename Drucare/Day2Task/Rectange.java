package Drucare.Day2Task;

public class Rectange {
    //	Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//	respectively by creating a class named 'Rectangle' with a method named 'Area' which
//	returns the area and length and breadth passed as parameters to its constructor.

    private int length;
    private int breadth;



    public Rectange(int length, int breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }


    public int Area()
    {
        int Area = length*breadth;
        System.out.println("Area of rectangle :"+Area);

        return Area;
    }
    public static void main(String[] args)
    {

        Rectange r1 = new Rectange(4,5);
        r1.Area();
        Rectange r2 = new Rectange(5,8);
        r2.Area();

    }
}
