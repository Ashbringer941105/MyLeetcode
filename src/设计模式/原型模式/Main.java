package 设计模式.原型模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ConcretePrototype c = new ConcretePrototype();
        c.data = 10;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        c.array = array;
        ConcretePrototype clone = c.clone();
        clone.data = 11;
        clone.array.add(3);
    }

}
