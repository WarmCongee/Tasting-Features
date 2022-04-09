package Records;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Menber {
    public String name;

    public int age;

    public Menber(){
        name = "weng";
        age = 20;
    }
    //MyRecord记录类等价于一下写法
    public String a=
"""
public final class MyRecords extends Record {
    private final String name;
    private final int id;
    private final int age;

    public MyRecords(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int name() {
        return this.name;
    }

    public int id() {
        return this.id;
    }
    
    public int age() {
        return this.age;
    }

    public String toString() {
        return String.format("Point[name=%s, id=%s, age=%s]", name, id, age);
    }

    public boolean equals(Object o) {
        ...
    }
    public int hashCode() {
        ...
    }
}
""";


    public record Student(String name, int id, int age) {}

}
