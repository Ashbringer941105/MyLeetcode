package 设计模式.建造者模式;

public interface CellPhoneBuilder {

    void setCpu();
    void setRam();
    void setScreen();
    void setBattery();
    CellPhone getPhone();
}
