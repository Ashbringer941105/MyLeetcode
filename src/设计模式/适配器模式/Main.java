package 设计模式.适配器模式;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Adapter adapter = new Adapter();
        String data = adapter.getStringData();
        System.out.println(data.getClass());
        ArrayList<ReturnInt> a = new ArrayList<>();
        a.add(adapter);
        a.add(new ReturnInt());
        a.remove(adapter);
        a.remove(new ReturnInt());
        int x =1;
    }
}
