package bishiti.bytedance._20190414_;

import java.util.ArrayList;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> data1 = new ArrayList<>();
        ArrayList<ArrayList<String>> data2 = new ArrayList<>();
        int count_cojl = 0;
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String input = in.nextLine();
            if (input.equals("")){
                break;
            }
            String[] hang = input.split(" ");
            ArrayList<String> hang_data = new ArrayList<>();
            for(String s : hang){
                if (s.equals("1")){
                    // 记录产品经理的数量
                    count_cojl++;
                }
                hang_data.add(s);
            }
            data1.add(hang_data);
            data2.add(hang_data);

        }

        // 输入完成之后，进行迭代
//        System.out.println(count_cojl);
        int count_min = 0;
        boolean flag = true;
        while (flag){
            flag = false;
            count_min++;
            ArrayList<ArrayList<String>> temp = new ArrayList<>();
            ArrayList<ArrayList<String>> another = new ArrayList<>();
            if (count_min%2==0){
                temp = data1;
                another = data2;
            }else {
                temp = data2;
                another = data1;
            }
            for (int i = 0;i<temp.size();i++){
                for (int j = 0;j<temp.get(0).size();j++){
                    if (temp.get(i).get(j).equals("1")){
                        if (i!=0){
                            // 如果不是在第一行，则判断上面的
                            if (temp.get(i-1).get(j).equals("2")){
                                another.get(i).set(j,"2");
                                count_cojl--;
                                flag = true;
                                continue;
                            }
                        }
                        if (i!=temp.size()-1){
                            if (temp.get(i+1).get(j).equals("2")){
                                another.get(i).set(j,"2");
                                count_cojl--;
                                flag = true;
                                continue;
                            }
                        }
                        if (j!=0){
                            if (temp.get(i).get(j-1).equals("2")){
                                another.get(i).set(j,"2");
                                count_cojl--;
                                flag = true;
                                continue;
                            }
                        }
                        if (j!=temp.get(0).size()-1){
                            if (temp.get(i).get(j+1).equals("2")){
                                another.get(i).set(j,"2");
                                count_cojl--;
                                flag = true;
                                continue;
                            }
                        }
                    }
                }
            }

        }
        if (count_cojl==0){
            System.out.println(count_min +1);
        }else {
            System.out.println(-1);
        }


    }

//    public boolean isYaoBian(ArrayList<ArrayList<String>> data,int i,int j){
//        if (i==0 && j==0){
//            if (data.get(i).get(j).equals())
//        }
//    }
}
