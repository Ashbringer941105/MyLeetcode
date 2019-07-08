package 设计模式.中介者模式;

enum Sex{
    MALE,FEMALE;
}

public abstract class Person {
    private MarriageAgency agency;

    private String name;
    private int age;
    private Sex sex;
    private int requestAge;

    public Person(MarriageAgency agency, String name, int age, Sex sex, int requestAge) {
        this.agency = agency;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.agency.register(this);
    }

    public void find(){
        this.agency.pair(this);
    }

    public MarriageAgency getAgency() {
        return agency;
    }

    public void setAgency(MarriageAgency agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getRequestAge() {
        return requestAge;
    }

    public void setRequestAge(int requestAge) {
        this.requestAge = requestAge;
    }
}
