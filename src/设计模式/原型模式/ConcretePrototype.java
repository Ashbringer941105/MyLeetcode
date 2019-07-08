package 设计模式.原型模式;

import java.util.ArrayList;

public class ConcretePrototype implements Cloneable {
    public int data;
    public ArrayList<Integer> array;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
