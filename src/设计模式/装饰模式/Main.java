package 设计模式.装饰模式;

public class Main {
    public static void main(String[] args){
        Component component = new FaDianJi();
        component = new ConcreteDecorator(component);
        component.showInfo();
    }
}
