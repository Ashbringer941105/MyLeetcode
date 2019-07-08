package 设计模式.责任链模式;

public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if (getSuccessor()!=null){
            System.out.println("传递请求至"+getSuccessor());
            getSuccessor().handleRequest();
        }else {
            System.out.println("请求处理");
        }
    }
}
