package 设计模式.迭代器模式;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        Iterator iterator = data.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
