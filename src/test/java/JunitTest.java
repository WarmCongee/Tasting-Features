import Records.MyRecords;
import lambda.MyLambdaTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * @author WarmCongee
 * @date 2022/4/9 10:56
 */
public class JunitTest {
    public static final Logger logger = LoggerFactory.getLogger("InfoLogger");

    /**
     * lambda表达式测试
     * @author WarmCongee
     * @date 2022/4/27 23:46
     */
    @Test
    public void lambdaTest(){
        logger.info("10 + 5 = " + MyLambdaTest.lambda.test(10, 5));

        MyLambdaTest.MathOperation mul = (int a, int b) -> a * b;
        logger.info("10 * 5 = " + mul.operation(10, 5));
    }

    @Test
    public void recordsTest(){
        MyRecords myRecords = new MyRecords("warmcongee", 1, 20);
        logger.info(String.valueOf(myRecords.test()));
    }

    @Test
    public void sealedTest(){

    }

}
