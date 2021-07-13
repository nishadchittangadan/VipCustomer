package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("nishad",5000.000);
        System.out.println(customer2.getName()+"  "+customer2.getCreditLimit()+"  "+customer2.getEmailAddress());

        VipCustomer customer3 = new VipCustomer("ancel",7000.00,"ancel@gmail.com");
        System.out.println(customer3.getEmailAddress());

    }
}
