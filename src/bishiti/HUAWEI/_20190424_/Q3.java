package bishiti.HUAWEI._20190424_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        map.put("zero","0");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
//        String result = f(input,map);
    }
//    public static String f(String s, Map map){
//        s = s.toLowerCase();
//        Set<String> set = map.keySet();
//        String temp = "";
//        for (int i = 0;i<s.length();i++){
//            if (set.contains(temp)){
//
//            }
//        }
//    }
public static String englishToNumber(String arr){
    Map<String,String> map = new HashMap<String,String>();
    map.put("zero", "0");
    map.put("one", "1");
    map.put("two", "2");
    map.put("three", "3");
    map.put("four", "4");
    map.put("five", "5");
    map.put("six", "6");
    map.put("seven", "7");
    map.put("eight", "8");
    map.put("nine", "9");
    String message = "";

    while(!"".equals(arr)){
        if (arr.startsWith("on") || arr.startsWith("tw") || arr.startsWith("si")) {
            message += map.get(arr.substring(0, 3));
            arr = arr.substring(3,arr.length());
        }
        if (arr.startsWith("ze") || arr.startsWith("fo") || arr.startsWith("fi") || arr.startsWith("ni")){
            message += map.get(arr.substring(0, 4));
            arr = arr.substring(4,arr.length());
        }
        if (arr.startsWith("th") || arr.startsWith("se") || arr.startsWith("ei")) {
            message += map.get(arr.substring(0, 5));
            arr = arr.substring(5,arr.length());
        }
    }
    return message;
}

//    @Test
//    public void test(){
//        assert("1230".equals(One.englishToNumber("onetwothreezero")));
//        assert("5684".equals(One.englishToNumber("fivesixeightfour")));
//        assert("158465".equals(One.englishToNumber("onefiveeightfoursixfive")));
//    }

}
