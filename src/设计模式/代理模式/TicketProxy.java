package 设计模式.代理模式;

public class TicketProxy implements IBuyTicket {
    private IBuyTicket buyer;

    public TicketProxy(IBuyTicket buyer) {
        this.buyer = buyer;
    }

    @Override
    public void login() {
        this.buyer.login();
    }

    @Override
    public void station(String start, String end) {
        this.buyer.station(start,end);
    }

    @Override
    public void validate() {
        this.buyer.validate();
    }

    @Override
    public void pay() {
        this.buyer.pay();
    }
}
