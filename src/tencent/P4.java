package tencent;

import java.util.*;

/**
 * @Author 宋宗垚
 * @Date 2019/3/9 20:17
 * @Description TODO
 */
public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 打n枪
        int m = sc.nextInt(); // m种颜色的个数
        int result = -1;

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0;i<n;i++){//注意while处理多个case
            int ka = sc.nextInt(); //
            list.add(ka);
        }
        for (int i = 0;i<=n-m;i++){
            Map<Integer,Integer> map = new HashMap<>();
            for (int j = i;j<n;j++){
                if (list.get(j)!=0){
                    map.put(list.get(j),1);
                }
                if (map.size()==m){
                    if (result==-1){
                        result = j-i+1;
                    }else {
                        result = Math.min(result,j-i+1);
                    }
                    break;
                }
            }

        }
        System.out.println(result);

    }
}
