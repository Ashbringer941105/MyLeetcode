package 设计模式.Single;
/**
 * 双锁的单例模式的实现
 */
public class SingleDC {
    // 需要用volatile修饰
    private static volatile SingleDC instance;
    // 私有的构造函数
    private SingleDC(){

    }
    public static SingleDC getInstance(){
        if (instance==null){
            // 只在判断instance为空的时候进行加锁，而不是对函数加锁，减少阻塞对性能的损失
            synchronized (SingleDC.class){
                if (instance==null){
                    instance = new SingleDC();
                }
            }
        }
        return instance;
    }
}
