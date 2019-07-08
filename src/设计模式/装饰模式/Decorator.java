package 设计模式.装饰模式;

public abstract class Decorator implements Component {
    private Component faDianJi = null;
    public Decorator(Component faDianJi){
        this.faDianJi = faDianJi;
    }

    public void showInfo(){
        this.faDianJi.showInfo();
    }

    public Component getComponent(){
        return this.faDianJi;
    }
}
