package ua.ho.tolkachov.SquareRoot;

public class SquareRoot {

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;

        String roots;
        
        roots = quadraticEquation(a, b, c);
        System.out.println(roots);        
    }

    static String quadraticEquation(double a, double b, double c){
        double discriminant = b * b - 4 * a * c;
        Double x1;
        Double x2;
        
        StringBuilder rootsBuilder = new StringBuilder();

        if (a == 0) {
            if (b == 0) {
                x1 = null;
                x2 = null;
            } else {
                x1 = -c / b;
                x2 = x1;
            }
        } else if (discriminant == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else if (discriminant < 0) {
            x1 = null;
            x2 = null;
        } else {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }

        rootsBuilder.append("x1=");
        rootsBuilder.append(makeStringFromDouble(x1));
        rootsBuilder.append("\n");
        rootsBuilder.append("x2=");
        rootsBuilder.append(makeStringFromDouble(x2));

        return rootsBuilder.toString();
        
    }
    
    private static String makeStringFromDouble(Double input) {
        if ((input == null)||Double.isNaN(input)) {
            return "";
        } else {
            input = input + 0.0;
            return input.toString();
        }
    }
}