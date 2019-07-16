package e.pranaykumarreddy.euphoriaaa;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String phone;
    private String rollno;
    private String price;
    private String userid;

    public User(String name, String phone, String rollno, String price, String userid) {
        this.name = name;
        this.phone = phone;
        this.rollno = rollno;
        this.price = price;
        this.userid = userid;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}