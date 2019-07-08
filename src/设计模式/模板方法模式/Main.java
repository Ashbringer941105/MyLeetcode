package 设计模式.模板方法模式;

public class Main {
    public static void main(String[] args){
        AbstractModel model = new AlexNet();
        model.train();
    }

}
