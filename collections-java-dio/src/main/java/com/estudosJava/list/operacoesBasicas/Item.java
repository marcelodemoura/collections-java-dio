package com.estudosJava.list.operacoesBasicas;

public class Item {

    private String dsItem;

    public Item(String dsItem){
        this.dsItem = dsItem;
    }
    public String getDsItem(){
        return dsItem;
    }

    @Override
    public String toString() {
        return dsItem;
    }
}
