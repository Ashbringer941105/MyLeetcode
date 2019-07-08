package 设计模式.观察者模式;

public class Main {
    public static void main(String[] args){
        ConcreteTalkSubject talkSubject = new ConcreteTalkSubject();
        ITalkObserver o1 = new ConcreteTalkObserver("观察者1");
        ITalkObserver o2 = new ConcreteTalkObserver("观察者2");
        talkSubject.registerObserver(o1);
        talkSubject.registerObserver(o2);
        talkSubject.setMsg("我发了一个朋友圈");
    }
}
