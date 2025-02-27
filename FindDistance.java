import java.util.Scanner;

public class FindDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for coordinates
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        // Compute distance
        double distance = getDistance(x1, y1, x2, y2);
        String classification = classifyDistance(distance);
        
        // Output result
        System.out.printf("Distance: %.2f (%s)\n", distance, classification);
        
        scanner.close();
    }
    
    // Method to compute Euclidean distance
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Method to classify the distance
    public static String classifyDistance(double distance) {
        if (distance < 5) {
            return "Short";
        } else if (distance >= 5 && distance <= 15) {
            return "Medium";
        } else {
            return "Long";
        }
    }
}
