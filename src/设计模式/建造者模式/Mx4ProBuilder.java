package 设计模式.建造者模式;

public class Mx4ProBuilder implements CellPhoneBuilder {
    CellPhone mx4Pro = new Mx4Pro();
    @Override
    public void setCpu() {
        // 省略
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
        return mx4Pro;
    }
}
