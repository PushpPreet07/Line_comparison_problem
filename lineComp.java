import java.util.*;
public class lineComp{
    public static void main(String[] args) {
        System.out.println("welcome to line comparison program");
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2;
        System.out.println("Enter coordinated for point P1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter coordinated for point P2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("The distance of line between P1 and P2 is " + calculateLength(x1,y1,x2,y2));
    }
    public static double calculateLength(int x1,int y1,int x2,int y2) {
        return (double)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}