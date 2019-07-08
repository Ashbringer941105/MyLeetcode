package 设计模式.建造者模式;

public class Mate7Builder implements CellPhoneBuilder {
    CellPhone mate7 = new Mate7();
    @Override
    public void setCpu() {
        mate7.setCpu("");
    }

    @Override
    public void setRam() {
        // 省略
    }

    @Override
    public void setScreen() {
        // 省略
    }

    @Override
    public void setBattery() {
        // 省略
    }

    @Override
    public CellPhone getPhone() {
        return mate7;
    }
}
