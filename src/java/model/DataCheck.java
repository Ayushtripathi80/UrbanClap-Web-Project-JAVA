package model;

import java.sql.*;
import utility.DBConnect;

public class DataCheck {

    String name;
    String email;
    String pass;
    String utype;
    String mobile;
    String city;
    String address;
    String photo;
    String experience;

    @Override
    public String toString() {
        return "DataCheck{" + "name=" + name + ", email=" + email + ", password=" + pass + ","
                + " utype=" + utype + ", mobile=" + mobile + ", city=" + city + ", "
                + "address=" + address + ", photo=" + photo + ", experience=" + experience + '}';
    }

    public DataCheck(String name, String email, String pass, String utype,
            String mobile, String city, String address, String photo, String experience) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.utype = utype;
        this.mobile = mobile;
        this.city = city;
        this.address = address;
        this.photo = photo;
        this.experience = experience;
    }

    public DataCheck(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public DataCheck(String name, String email, String pass,String utype,
            String mobile, String city, String address, String photo) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.utype=utype;
        this.mobile = mobile;
        this.city = city;
        this.address = address;
        this.photo = photo;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public boolean CreateUser() throws Exception {
        String sql = "insert into registration1 values(' " + name + " ',' " + email + " ',' " + pass + " ',"
+ "' " + utype + " ',' " + mobile + " ',' " + city + " ',' " + address + " ',' " + photo + " ',' " + experience + " ')";
        DBConnect x = new DBConnect();
        x.queryExecuter(sql);
        return true;
    }

    public boolean LoginCheck() throws Exception {
        String sql = "select * from registration1 where email=' " + email + " '  and password=' " + pass + " ' ";
        DBConnect x = new DBConnect();
        ResultSet rs = x.queryReturner(sql);
        if (rs.next()) {
            this.name = rs.getString(1);
            this.utype = rs.getString(4);
             this.mobile = rs.getString(5);
              this.city = rs.getString(6);
              this.photo = rs.getString(8);

            return true;
        } else {
            return false;
        }
    }

    public boolean updateCheck() throws Exception {
        String sql = "update registration1 set name='" + name + "',password='" + pass + "',mobile='" + mobile +
                "',city='" + city + "',address='" + address + "',"
                + "photo='" + photo +"' where email='" + email + "'";
        DBConnect x = new DBConnect();
        x.queryExecuter(sql);

        
        return true;

    }
    public boolean updateCheck1() throws Exception {
        String sql = "update registration1 set name='" + name + "',password='" + pass + "',mobile='" + mobile +
                "',city='" + city + "',address='" + address + "',"
                +"photo='" + photo +" ',experience='"+experience+"' where email='" + email + "'";
        DBConnect x = new DBConnect();
        x.queryExecuter(sql);

        
        return true;

    }
}
