package 设计模式.组合模式;

public class Leaf implements Company {
    private String name;
    private String position;

    public Leaf(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getInfo() {
       return "姓名："+this.name + "\t职位:"+this.position+"\t我是职工";
    }
}
