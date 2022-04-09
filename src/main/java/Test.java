import Records.Menber;
import Records.MyRecords;

/**
 * @author WarmCongee
 * @date 2021/12/18 23:35
 */
public class Test {

    public static void main(String args[]) {
        System.out.println("test");
        Menber menber = new Menber();
        System.out.println(menber.toString());
        System.out.print(menber.a);


        MyRecords myRecords = new MyRecords("weng", 1, 20);
        System.out.print(myRecords.name());
    }



}
