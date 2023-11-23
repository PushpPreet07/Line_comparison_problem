import java.util.Objects;

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    /*
     * @desc- checks if 2 lines are equal
     * @params-coordinates of both lines
     * @return-bool yes or no
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line otherLine = (Line) obj;
        return Objects.equals(startPoint, otherLine.startPoint) &&
               Objects.equals(endPoint, otherLine.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }
}

class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point otherPoint = (Point) obj;
        return Double.compare(otherPoint.x, x) == 0 &&
               Double.compare(otherPoint.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class lineComp {
    public static void main(String[] args) {
        Point startPoint1 = new Point(1.0, 2.0);
        Point endPoint1 = new Point(3.0, 4.0);
        Line line1 = new Line(startPoint1, endPoint1);
        
        Point startPoint2 = new Point(1.0, 2.0);
        Point endPoint2 = new Point(3.0, 4.0);
        Line line2 = new Line(startPoint2, endPoint2);
        System.out.println("Length of LINE 1");
        System.out.println("The distance of line between P1 and P2 is " + calculateLength(startPoint1, endPoint1, startPoint2, endPoint2));
        Point startPoint3 = new Point(1.0, 2.0);

        Point endPoint3 = new Point(5.0, 6.0);
        Line line3 = new Line(startPoint3, endPoint3);

        System.out.println("Line 1 equals Line 2: " + line1.equals(line2));  // true
        System.out.println("Line 1 equals Line 3: " + line1.equals(line3));  // false
    }
    /*
     * @desc- calculates the length of a line between 2 points
     * @params-coordinates of both points
     * @return-length of the line
     */
    public static double calculateLength(Point x1, Point y1, Point x2, Point y2) {
        return Math.sqrt(Math.pow(x2.x - x1.x, 2) + Math.pow(y2.y - y1.y, 2));
    }
}
