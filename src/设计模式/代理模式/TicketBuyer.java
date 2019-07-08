package 设计模式.代理模式;

public class TicketBuyer implements IBuyTicket{
    private String name;

    public TicketBuyer(String name) {
        this.name = name;
    }


    @Override
    public void login() {
        System.out.println(this.name+" login ");
    }

    @Override
    public void station(String start, String end) {
        System.out.println(this.name+" from "+start+" to "+end);
    }

    @Override
    public void validate() {
        System.out.println(this.name+" validate");
    }

    @Override
    public void pay() {
        System.out.println(this.name+" pay");
    }
}
