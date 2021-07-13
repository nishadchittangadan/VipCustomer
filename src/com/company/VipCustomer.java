package com.company;

public class VipCustomer {
    private String name;
    private Double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Defualt Name",5000.00,"Defualt@gmail.com");
    }
    public VipCustomer(String name, Double creditLimit) {
        this(name,creditLimit,"unknow@mail.com");
    }

    public VipCustomer(String name, Double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
