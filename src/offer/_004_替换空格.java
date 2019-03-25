package offer;

/**
 * @Author 宋宗垚
 * @Date 2019/3/25 19:12
 * @Description TODO
 */
public class _004_替换空格 {
    public String replaceSpace(StringBuffer str) {
        int index = str.indexOf(" ");
        while (index != -1){
            str.replace(index,index+1,"%20");
            index = str.indexOf(" ");
        }
        return str.toString();
    }
}
