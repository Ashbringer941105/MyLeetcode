package 设计模式.建造者模式;

public class CellPhoneDirector {
    private CellPhoneBuilder cellPhoneBuilder;
    public CellPhone getMate7(){
        cellPhoneBuilder = new Mate7Builder();
        cellPhoneBuilder.setBattery();
        // 省略
        return cellPhoneBuilder.getPhone();
    }

    public CellPhone getMx4Pro(){
        cellPhoneBuilder = new Mx4ProBuilder();
        cellPhoneBuilder.setBattery();
        // 省略
        return cellPhoneBuilder.getPhone();
    }
}
