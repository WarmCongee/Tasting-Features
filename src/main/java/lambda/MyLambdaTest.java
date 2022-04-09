package lambda;

/**
 * @author WarmCongee
 * @date 2021/12/19 0:11
 */
public class MyLambdaTest {

    public interface MathOperation{
        int operation(int a, int b);
    }

    public static Lambda lambda = (int x, int y) -> {return x+y;};


}
