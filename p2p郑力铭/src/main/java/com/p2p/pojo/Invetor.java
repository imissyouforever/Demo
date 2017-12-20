package com.p2p.pojo;

public class Invetor {
    private String id;

    private String username;

    private String phone;

    private String email;

    private String password;

    private String password2;

    private String yanzheng;

    private Long accountmoney;

    private Long prueprofit;

    private String realname;

    private String idcard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2 == null ? null : password2.trim();
    }

    public String getYanzheng() {
        return yanzheng;
    }

    public void setYanzheng(String yanzheng) {
        this.yanzheng = yanzheng == null ? null : yanzheng.trim();
    }

    public Long getAccountmoney() {
        return accountmoney;
    }

    public void setAccountmoney(Long accountmoney) {
        this.accountmoney = accountmoney;
    }

    public Long getPrueprofit() {
        return prueprofit;
    }

    public void setPrueprofit(Long prueprofit) {
        this.prueprofit = prueprofit;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }
}