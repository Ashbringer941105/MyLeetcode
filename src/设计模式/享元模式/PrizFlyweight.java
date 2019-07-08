package 设计模式.享元模式;

public class PrizFlyweight implements IPrize {
    private String name;

    public PrizFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void LuckDraw(double number) {
        if (number>0.1 && number <0.3){
            System.out.println("中奖，奖品为 "+this.name);
        }else {
            System.out.println("没中奖");
        }
    }
}
