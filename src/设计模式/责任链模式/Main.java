package 设计模式.责任链模式;

public class Main {
    public static void main(String[] args){
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setSuccessor(h2);
        h1.handleRequest();

    }
}
