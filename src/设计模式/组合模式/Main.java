package 设计模式.组合模式;

public class Main {
    public static void main(String[] args){
        // CEO
        ConcreteCompany root = new ConcreteCompany("CEO","CEO");
        // 经理
        ConcreteCompany manger1 = new ConcreteCompany("JL1","JL");
        ConcreteCompany manger2 = new ConcreteCompany("JL2","JL");
        root.add(manger1);
        root.add(manger2);
        // 员工
        Leaf e1 = new Leaf("员工1","员工");
        Leaf e2 = new Leaf("员工2","员工");
        Leaf e3 = new Leaf("员工3","员工");
        Leaf e4 = new Leaf("员工4","员工");
        manger1.add(e1);
        manger1.add(e2);
        manger2.add(e3);
        manger2.add(e4);
        display(root);


    }

    public static void display(ConcreteCompany root){
        for (Company c :root.getChild()){
            if (c instanceof Leaf){
                System.out.println(c.getInfo());
            }else {
                System.out.println(c.getInfo());
                display((ConcreteCompany)c);
            }
        }
    }

}
