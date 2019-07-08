package 设计模式.中介者模式;

public class Main {
    public static void main(String[] args){
        MarriageAgency agency = new MarriageAgencyImpl();
        Person p1 = new Man(agency,"张三",20,Sex.MALE,18);
        Person p2 = new Man(agency,"李四",22,Sex.MALE,25);
        Person p3 = new Woman(agency,"王五",20,Sex.FEMALE,21);
        Person p4 = new Woman(agency,"赵六",20,Sex.FEMALE,23);

        p1.find();
        p3.find();
    }
}
