package com.example.justcoffeev2;

public class Order {
    private int _id;
    private String _custName;
    private int _saleAmount;

    // Constuctor

    public Order(String _custName, int _saleAmount) {

        this._custName = _custName;
        this._saleAmount = _saleAmount;
    }

    //2nd constuctor



    //Get method (getters

    public int get_id() {
        return _id;
    }

    public String get_custName() {
        return _custName;
    }

    public int get_saleAmount() {
        return _saleAmount;
    }


    //set methods (setters
    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_custName(String _custName) {
        this._custName = _custName;
    }

    public void set_saleAmount(int _saleAmount) {
        this._saleAmount = _saleAmount;
    }
}
