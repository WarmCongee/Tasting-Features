package IO;
import java.util.*;
/**
 * @author WarmCongee
 * For OJ Input
 * @date 2022/5/11 16:08
 */
public class Input {
    public static Vector<Integer> InputInt(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        Vector<Integer> re = new Vector<>();
        re.add(m);
        re.add(n);
        scanner.close();
        return re;
    }

    public static Vector<Character> InputStringByLetter(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Vector<Character> re = new Vector<>();
        for (int i = 0; i < s.length(); i++){
            re.add(s.charAt(i));
        }
        scanner.close();
        return re;
    }

    public static Vector<String> InputStringByWord(){
        Scanner scanner = new Scanner(System.in);
        Vector<String> re = new Vector<>();
        String s;
        while(scanner.hasNext()){
            s = scanner.next();
            re.add(s);
        }
        scanner.close();
        return re;
    }

    public static Vector<String> InputStringByLine(){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Vector<String> re = new Vector<>();
        re.add(s1);
        re.add(s2);
        scanner.close();
        return re;
    }

    public static Vector<String> InputStringBySplit(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.trim().split(" ");
        List<String> list = new ArrayList<String>(Arrays.asList(strings));
        Vector<String> re = new Vector<>(list);
        scanner.close();
        return re;
    }

    public static void main(String[] args){
        Hashtable<String,Integer> test = new Hashtable<>();
        test.put("haha",1);

        test.containsKey("sa");
        test.containsValue(1);
        test.get("haha");
        //System.out.println(InputInt());
        //System.out.println(InputStringByLetter());
        //System.out.println(InputStringByWord());
        //System.out.println(InputStringByLine());
        //System.out.println(InputStringBySplit());
    }

}
