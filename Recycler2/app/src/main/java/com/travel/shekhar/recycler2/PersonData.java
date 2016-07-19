package com.travel.shekhar.recycler2;

/**
 * Created by shekh on 19-Jul-16.
 */
public class PersonData {


    String shop;
    String amount;
    String order;
    String date;

    int id_;

    public PersonData(String shop, String amount, String order, String date , int id_) {
        this.shop=shop;
        this.amount=amount;
        this.order=order;
        this.date=date;
        this.id_ = id_;
    }


    public String getShop() {
        return shop;
    }


    public String getAmount() {
        return amount;
    }


    public String getOrder() {
        return order;
    }

    public String getDate() {return date;}

    public int getId() {
        return id_;
    }
}