package leetcode;

import java.util.ArrayList;

/*
给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。

示例：

输入: ["Hello", "Alaska", "Dad", "Peace"]
输出: ["Alaska", "Dad"]
 */
public class KeyboardRow_500 {
    public String[] findWords(String[] words) {
        ArrayList<Character> line1 = new ArrayList<>();
        ArrayList<Character> line2 = new ArrayList<>();
        ArrayList<Character> line3 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        char[] l1 = {'q','w','e','r','t','y','u','i','o','p'};
        char[] l2 = {'a','s','d','f','g','h','j','k','l'};
        char[] l3 = {'z','x','c','v','b','n','m'};
        for (char c : l1){
            line1.add(c);
        }
        for(char c :l2){
            line2.add(c);
        }
        for(char c:l3){
            line3.add(c);
        }

        for(String str : words){
            boolean flag = true;
            String locase = str.toLowerCase();
            char temp = locase.charAt(0);
            //先看第一个字母在哪一行
            int l = 0;
            if(line1.contains(temp)){
                l = 1;
            }else if(line2.contains(temp)){
                l = 2;
            }else if(line3.contains(temp)) {
                l = 3;
            }
            for(int i =1;i<locase.length();i++){
                //然后看剩下的字母在哪一行，如果不和第一个字母在一行则break
                temp = locase.charAt(i);
                if(line1.contains(temp) && l!=1){
                    flag=false;
                    break;
                }else if(line2.contains(temp) && l!=2){
                    flag=false;
                    break;
                }else if(line3.contains(temp) &&l !=3){
                    flag = false;
                    break;
                }

            }
            if(flag){
                result.add(str);
            }
        }
        String[] result_str = new String[result.size()];
        for(int i = 0;i<result.size();i++){
            result_str[i] = result.get(i);
        }
        return result_str;


    }
}
