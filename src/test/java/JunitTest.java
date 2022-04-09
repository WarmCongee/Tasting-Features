import lambda.MyLambdaTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author WarmCongee
 * @date 2022/4/9 10:56
 */
public class JunitTest {
    public static final Logger logger = LoggerFactory.getLogger("InfoLogger");

    @Test
    public void lambdaTest(){
        logger.info("10 + 5 = " + MyLambdaTest.lambda.test(10, 5));

        MyLambdaTest.MathOperation mul = (int a, int b) -> a * b;
        logger.info("10 * 5 = " + mul.operation(10, 5));
    }

    @Test
    public void recordsTest(){

    }

    @Test
    public void sealedTest(){

    }

}
