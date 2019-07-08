package 设计模式.代理模式;

public interface IBuyTicket {
    void login();
    void station(String start, String end);
    void validate();
    void pay();

}
