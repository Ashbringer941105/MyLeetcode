package 设计模式.代理模式;

public class Main {
    public static void main(String[] args){
        IBuyTicket buyer = new TicketBuyer("song");
        TicketProxy proxy = new TicketProxy(buyer);
        proxy.login();
        proxy.station("a","b");
        proxy.validate();
        proxy.pay();
    }
}
