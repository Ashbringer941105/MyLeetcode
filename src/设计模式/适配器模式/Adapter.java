package 设计模式.适配器模式;

public class Adapter extends ReturnInt implements ReturnString {
    @Override
    public String getStringData() {
        Integer result = super.getIntData();
        return result.toString();
    }
}
