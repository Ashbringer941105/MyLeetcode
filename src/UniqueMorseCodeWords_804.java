import java.util.HashMap;
import java.util.Map;

/*
国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。

为了方便，所有26个英文字母对应摩尔斯密码表如下：

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-.-....-"，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。

返回我们可以获得所有词不同单词翻译的数量。

例如:
输入: words = ["gin", "zen", "gig", "msg"]
输出: 2
解释:
各单词翻译如下:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."
共有 2 种不同翻译, "--...-." 和 "--...--.".

注意:
单词列表words 的长度不会超过 100。
每个单词 words[i]的长度范围为 [1, 12]。
每个单词 words[i]只包含小写字母。
 */
public class UniqueMorseCodeWords_804 {
    public static void main(String[] args){
        String[] x = {"gin", "zen", "gig", "msg"};
        int a = uniqueMorseRepresentations(x);
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] char_dicts = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
                                "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-",
                                "-.--","--.."};
        Map<String,String> map = new HashMap<String,String>();
        for(String word:words){
            String morse_word = "";
            for(int i = 0;i<word.length();i++){
                char temp = word.charAt(i);
                String temp_morse_code = char_dicts[(int)temp-97];
                morse_word = morse_word + temp_morse_code;
            }
            map.put(morse_word,"");
        }
        return map.size();
    }
}
