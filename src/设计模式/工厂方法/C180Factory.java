package 设计模式.工厂方法;

public class C180Factory implements BenzFactory {
    @Override
    public Benz getCar() {
        return new BenzC180();
    }
}
