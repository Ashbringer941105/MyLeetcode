package 设计模式.观察者模式;

public interface ITalkSubject {
    void registerObserver(ITalkObserver observer);
    void removeObserver(ITalkObserver observer);
    void notifyObserver();
}
