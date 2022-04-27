package Sealed;

/**
 * Java 15 密封类可以控制哪些模型、类等可以实现或扩展该类/接口
 * 以下定义表示仅允许MySealedSon继承此类
 * @author WarmCongee
 * @date 2021/12/19 0:06
 */
public sealed class MySealed permits MySealedSon{

}
