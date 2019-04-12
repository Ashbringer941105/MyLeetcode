package tencent._20190405_;

import java.util.Scanner;

/**
 * @Author 宋宗垚
 * @Date 2019/4/5 20:35
 * @Description TODO
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 怪兽的只数
        int[] wuli = new int[n];
        int[] jinbi = new int[n];
        int[] goumai = new int[n];
        int sum = 0;
        int tempWuLi = 0;
        int lastIndex = 0;
        for(int i = 0; i < n; i++){
            wuli[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            jinbi[i] = sc.nextInt();
        }

        for (int i = 0;i<n;i++){
            if (i==0){
                sum = sum + jinbi[i];
                tempWuLi = tempWuLi + wuli[i];
                lastIndex = 0;
                goumai[i] = 1;
            }else {
                if (tempWuLi>wuli[i]){
                    goumai[i] = 0;
                    continue;
                }else {
                    // 如果打不过了
                    int dangQianWuLi = wuli[i];
                    int tw = tempWuLi;
                    int tj = 0;
                    int last = lastIndex;

                    int maxXunHuanNumber = i-lastIndex;
                    int xxx = 0;
                    while (tw<dangQianWuLi && xxx<=maxXunHuanNumber ){
                        xxx++;
                        int maxWuLi = 0;
                        int temp_index = lastIndex+1;

                        for (int j = lastIndex+1;j<i;j++){
                            // 找到这段中没买并且武力值最大的怪物，买下来
                            if (goumai[j]!=1 && maxWuLi<wuli[j]){
                                temp_index = j;
                                maxWuLi = wuli[j];

                            }

                        }

                        if (last<temp_index){
                            last = temp_index;
                        }
                        tw = tw+ maxWuLi;
                        tj = tj + jinbi[temp_index];
                        goumai[temp_index] = 1;
                    }
                    if (tj>=jinbi[i]){
                        // 如果买前面多个不如买这一个，就买这一个
                        goumai[i]=1;
                        sum = sum + jinbi[i];
                        tempWuLi = tempWuLi + wuli[i];
                        lastIndex = i;
                    }else {
                        // 如果前面买多个比这个省钱，
                        sum = sum + tj;
                        tempWuLi = tempWuLi + tw;
                        lastIndex = last;
                    }


                }


            }
        }
        System.out.println(sum);


    }
}
