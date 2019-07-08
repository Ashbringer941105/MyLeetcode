package 设计模式.装饰模式;



public class ConcreteDecorator extends Decorator{
    private String add;
    public ConcreteDecorator(Component faDianJi) {
        super(faDianJi);
        this.add = "附加信息";
    }


    @Override
    public void showInfo() {
        System.out.println("额外的属性"+add);
        super.showInfo();
    }

}
