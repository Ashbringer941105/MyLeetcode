package 设计模式.享元模式;

public class Main {
    public static void main(String[] args){
        IPrize p1 = PrizeFactor.getPrizeInstance("法拉利");
        p1.LuckDraw(0.1);
        IPrize p2 = PrizeFactor.getPrizeInstance("法拉利");
        p2.LuckDraw(0.15);

        IPrize p3 = PrizeFactor.getPrizeInstance("大米");
        p3.LuckDraw(0.1);
        IPrize p4 = PrizeFactor.getPrizeInstance("大米");
        p4.LuckDraw(0.15);


    }
}
