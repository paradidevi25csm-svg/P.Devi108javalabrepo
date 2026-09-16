import static java.lang.Math.*;
import static java.lang.System.out;

public class MathDemo {
    public static void main(String[] args) {
        // Without static import: Math.sqrt(16), System.out.println
        out.println(sqrt(16));   // 4.0
        out.println(pow(2, 10)); // 1024.0
        out.println(PI);         // 3.141592653589793
    }
}