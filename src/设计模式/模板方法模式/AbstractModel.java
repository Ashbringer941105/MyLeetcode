package 设计模式.模板方法模式;

public abstract class AbstractModel {
    protected abstract void getData();
    protected abstract void foword();
    protected abstract void loss();
    protected abstract void backword();

    public void train(){
        this.getData();
        this.foword();
        this.loss();
        this.backword();
    }
}
