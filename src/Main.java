import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(46d));

    }

    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double>unaryOperator=(a)->Math.sqrt(a);
//        System.out.println(unaryOperator.apply(x));
        return unaryOperator;

    };


//    public static double sqrt(double x){
//        UnaryOperator<Double>unaryOperator= Math::sqrt; // (a)->Math.sqrt(a);
//        UnaryOperator<Double>unaryOperator1 = new UnaryOperator<Double>() {
//            @Override
//            public Double apply(Double aDouble) {
//                return null;
//            }
//        };
//
//        return x;
//    };
}