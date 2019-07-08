package 设计模式.观察者模式;

import java.util.ArrayList;
import java.util.List;

public class ConcreteTalkSubject implements ITalkSubject {
    private List<ITalkObserver> observers = new ArrayList<>();
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserver();
    }

    @Override
    public void registerObserver(ITalkObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(ITalkObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (ITalkObserver observer : this.observers){
            observer.updateTalk(this.msg);
        }
    }
}
