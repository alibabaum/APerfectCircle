import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double diameter = 0.0;
        Double radius;
        Scanner doubleScanner = new Scanner(System.in);
        System.out.println("Input your radius:");
        radius = doubleScanner.nextDouble();
        System.out.println("Your diameter is " + getDiameter(radius) +
                ". Your area is " + getArea(radius) +
                ". Your circumference is " + getCircumference(radius));
        //you always call the method with the thing that you sent and are taking back.
    }

    public static double getDiameter (Double radius) {
        //radius is the variable you're passing in from above so that's why it's in the parentheses.
        double diameterAnswer = radius*2;
        return diameterAnswer;
    }

    public static double getCircumference (Double radius) {
        double circumferenceAnswer = 2 * Math.PI * radius;
        return circumferenceAnswer;
        //no void so you can return something
    }

    public static double getArea (Double radius) {
        double areaAnswer = Math.PI * radius * radius;
        return areaAnswer;
    }
}