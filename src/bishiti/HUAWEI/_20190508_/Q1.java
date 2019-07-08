package bishiti.HUAWEI._20190508_;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        // 接收输入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();
        for (int i = 0;i<n;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0;j<n;j++){
                int input = sc.nextInt();
                temp.add(input);
            }
            data.add(temp);
        }
        int m = sc.nextInt();
        m = m % 4;
        for (int i = 0;i<m;i++){
            data = turn(data);
        }

        // 输出矩阵
        printMartx(data);

    }

    public static void printMartx(ArrayList<ArrayList<Integer>> data){
        for (ArrayList<Integer> arrayList : data){
            for (int i = 0;i<arrayList.size();i++){
                System.out.print(arrayList.get(i));
                if (i!=arrayList.size()-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static ArrayList<ArrayList<Integer>> turn(ArrayList<ArrayList<Integer>> data){
        data = reverse(data);
        data = exchange(data);

        return data;
    }
    //将矩阵转置
    public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> temp ){
        for(int i=0;i<temp.size();i++){
            for(int j=i;j<temp.get(i).size();j++){
                int k=temp.get(i).get(j);
                temp.get(i).set(j,temp.get(j).get(i));
                temp.get(j).set(i,k);
            }
        }
        return temp;
    }
    //将转置后的矩阵的列交换（第一列跟最后一列交换，第二列跟倒数第二列交换）
    public static ArrayList<ArrayList<Integer>> exchange(ArrayList<ArrayList<Integer>> temp){
        int a=0;
        int b=temp.size()-1;
        for(int i=0;i < (temp.size())/2;i++){
            for(int j=0;j<temp.size();j++){
                int k=temp.get(j).get(a);
                temp.get(j).set(a,temp.get(j).get(b));//[j][a]=temp[j][b];
                temp.get(j).set(b,k);//[j][b]=k;
            }
            a++;
            b--;
        }
        return temp;
    }

}
