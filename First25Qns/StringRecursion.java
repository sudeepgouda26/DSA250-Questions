public class StringRecursion {
    static void PrinReverse(String str){
        if(str.length() == 0) {
            return;
        }
        PrinReverse(str.substring(1));
        System.out.print(str.charAt(0));
    }
    
    // Method to calculate circumference of a circle
    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    
    // Method to calculate area of a circle
    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        String input ="hello";
        PrinReverse(input);
        System.out.println(); // Add newline after reverse string
        
        // Test circumference calculation
        double radius = 5.0;
        double circumference = calculateCircumference(radius);
        System.out.println("Circumference of circle with radius " + radius + " is: " + circumference);
        
        // Test area calculation
        double area = calculateArea(radius);
        System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}