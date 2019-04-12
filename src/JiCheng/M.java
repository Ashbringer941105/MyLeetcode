package JiCheng;

/**
 * @Author 宋宗垚
 * @Date 2019/4/12 11:27
 * @Description TODO
 */
public class M {
    public static void main(String[] args){
        Father f = new Father();
        Child1 c1 = new Child1();
//        f.p();
//        c1.p();
//
//        f = c1;
//        f.p();
        f(c1);
    }
    public static void f(Father father){
        father.p();
    }
}
