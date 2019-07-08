package 设计模式.享元模式;

import java.util.HashMap;
import java.util.Map;

public class PrizeFactor {
    private static Map<String,IPrize> pool = new HashMap<>();
    private PrizeFactor(){

    }

    public static IPrize getPrizeInstance(String name){
        IPrize prize = pool.get(name);
        if (prize==null){
            prize = new PrizFlyweight(name);
            pool.put(name,prize);
        }
        return prize;
    }

}
