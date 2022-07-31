import java.util.*;
public class Main
{
  public static void main (String[] args)
  {
    Scanner console = new Scanner(System.in);
    int radius;
    double area;
    System.out.println("Please Enter Radius: ");
    radius = console.nextInt();
    area = 3.14 * radius * radius;
    System.out.print("The circle area is " + area);
  }
}
