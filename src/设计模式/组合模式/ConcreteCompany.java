package 设计模式.组合模式;



import java.util.ArrayList;

public class ConcreteCompany implements Company {

    private ArrayList<Company> companyArrayList = new ArrayList<>();
    private String name;
    private String position;

    public ConcreteCompany(String name ,String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getInfo() {
        return "姓名："+this.name + "\t职位:"+this.position + "\t我是领导";
    }

    public void add(Company company){
        this.companyArrayList.add(company);
    }

    public void remove(Company company){
        this.companyArrayList.remove(company);
    }

    public ArrayList<Company> getChild(){
        return this.companyArrayList;
    }


}
