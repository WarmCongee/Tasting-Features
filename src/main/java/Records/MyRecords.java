package Records;

/**
 * java 14
 * Record 成员变量全部为final
 * @author WarmCongee
 * @date 2021/12/19 0:02
 */
public record MyRecords(String name, int id, int age) {
    /** 构造函数没有小括号，只有大括号，这种构造函数叫做Compact constructor
     * 无法在record中定义正常的构造函数，否则会得到一个编译错误。
     * */
    public MyRecords{
        if (id < 0 || age < 0) {
            throw new IllegalArgumentException("illegal");
        }
    }

    public int test(){
        return id+age;
    }
}

