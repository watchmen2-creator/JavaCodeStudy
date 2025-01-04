package chapter08.com.hspedu.houserent.domain;

public class House {
    private int id;//编号
    private String host;//房主
    private int tel;//电话
    private String address;//地址
    private double monthlyRent;//月租
    private String state;//状态
    //无参构造起
    public House() {
    }

    public House(int id, String host, int tel, String address, double monthlyRent, String state) {
        this.id = id;
        this.host = host;
        this.tel = tel;
        this.address = address;
        this.monthlyRent = monthlyRent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
