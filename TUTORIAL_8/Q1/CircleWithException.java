package Q1;
import java.text.DecimalFormat;
import java.util.Scanner;


public class CircleWithException{

    double radius;

    public CircleWithException(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius > 0){
            this.radius = radius;
        }
        else{
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public double getArea() throws Exception {


        double area = Math.PI * getRadius() * getRadius();

        if (area > 1000){
            throw new Exception("area cannot be bigger than 2000");
        }
        else{
            return area;
        }
    }

    public double getDiameter() {
        return  2 * Math.PI * radius;
    }
    
    public static void main(String[] args) {
        
        try{
            double randian;
            System.out.println("Radius: ");
            Scanner sc = new Scanner(System.in);
            randian = sc.nextDouble();

            final DecimalFormat df = new DecimalFormat("0.00");
            CircleWithException c1 = new CircleWithException(randian);
            c1.setRadius(randian);
            System.out.println(df.format(c1.getArea()));
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }
}