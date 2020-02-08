package com.example.resellerappnewmessho.Model;

public class ProductModelR {
    private String image1;
    private String image2;
    private String image3;
    private String productname;
    private String startingPrice;
    private String shippingcost;
    public ProductModelR(String image1, String image2, String image3, String productname, String startingPrice, String shippingcost) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.productname = productname;
        this.startingPrice = startingPrice;
        this.shippingcost = shippingcost;
    }
    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getShippingcost() {
        return shippingcost;
    }

    public void setShippingcost(String shippingcost) {
        this.shippingcost = shippingcost;
    }



}
