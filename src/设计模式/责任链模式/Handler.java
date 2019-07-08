package 设计模式.责任链模式;

public abstract class Handler {
    private Handler successor;
    public abstract void handleRequest();
    public Handler getSuccessor(){
        return successor;
    }
    public void setSuccessor(Handler successor){
        this.successor = successor;
    }
}
