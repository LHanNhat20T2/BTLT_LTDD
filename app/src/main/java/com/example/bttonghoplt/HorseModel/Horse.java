package com.example.bttonghoplt.HorseModel;

public class Horse {

    String nameOrder, descOrder, princeOrder;
    int imgOrder;

    public Horse(String nameOrder, String descOrder, String princeOrder, int imgOrder) {
        this.nameOrder = nameOrder;
        this.descOrder = descOrder;
        this.princeOrder = princeOrder;
        this.imgOrder = imgOrder;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getDescOrder() {
        return descOrder;
    }

    public void setDescOrder(String descOrder) {
        this.descOrder = descOrder;
    }

    public String getPrinceOrder() {
        return princeOrder;
    }

    public void setPrinceOrder(String princeOrder) {
        this.princeOrder = princeOrder;
    }

    public int getImgOrder() {
        return imgOrder;
    }

    public void setImgOrder(int imgOrder) {
        this.imgOrder = imgOrder;
    }
}

