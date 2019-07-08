package 设计模式.观察者模式;

public class ConcreteTalkObserver implements ITalkObserver {
    private String name;

    public ConcreteTalkObserver(String name) {
        this.name = name;
    }

    @Override
    public void updateTalk(String msg) {
        System.out.println(this.name+" 收到了一条消息 "+msg);
    }
}
