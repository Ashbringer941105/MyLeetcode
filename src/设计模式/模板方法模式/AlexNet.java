package 设计模式.模板方法模式;

public class AlexNet extends AbstractModel {
    @Override
    protected void getData() {
        System.out.println("getData");
    }

    @Override
    protected void foword() {
        System.out.println("foword");

    }

    @Override
    protected void loss() {
        System.out.println("loss");

    }

    @Override
    protected void backword() {
        System.out.println("backword");

    }
}
