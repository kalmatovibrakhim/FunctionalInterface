import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(30));

    }
   /*
    public static UnaryOperator<Double> sqrt(double x){
        UnaryOperator<Double>unaryOperator=(a)->Math.sqrt(a);
        System.out.println(unaryOperator.apply(x));
        return unaryOperator;

    };

    */
    public static double sqrt(double x){
        UnaryOperator<Double>unaryOperator= Math::sqrt;
        return unaryOperator.apply(x);

    };
}