package 设计模式.中介者模式;

import java.util.ArrayList;
import java.util.List;

public class MarriageAgencyImpl implements MarriageAgency {
    List<Man> manList = new ArrayList<>();
    List<Woman> womanList = new ArrayList<>();

    @Override
    public void register(Person person) {
        if (person.getSex() == Sex.MALE){
            manList.add((Man) person);
        }else {
            womanList.add((Woman)person);
        }
    }

    @Override
    public void pair(Person person) {
        if (person.getSex() == Sex.MALE){
            for (Woman woman : womanList){
                if (woman.getAge()<person.getRequestAge()){
                    System.out.println(person.getName()+" 和 "+woman.getName() +" 配对成功 ");
                    return;
                }
            }
        }else {
            for (Man man : manList){
                if (man.getAge() < person.getRequestAge()){
                    System.out.println(man.getName() + " 和 "+person.getName()+" 配对成功 ");
                    return;
                }
            }
        }

        System.out.println("没有找到合适的对象");

    }
}
