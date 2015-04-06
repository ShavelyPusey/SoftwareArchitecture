// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HandlerRequest.java

package edu.arqsoft.designpatterns.responsabilitychain;


public class HandlerRequest
{

    public HandlerRequest(String name, String product, int cost, boolean state)
    {
        this.name = name;
        this.product = product;
        this.cost = cost;
        this.state = state;
    }

    public String getName()
    {
        return name;
    }

    public String setName()
    {
        return name;
    }

    public String getProduct()
    {
        return product;
    }

    public String setProduct()
    {
        return product;
    }

    public int getCost()
    {
        return cost;
    }

    public int setCost()
    {
        return cost;
    }

    public boolean getState()
    {
        return state;
    }

    public boolean setState()
    {
        return state;
    }

    String name;
    String product;
    int cost;
    boolean state;
}
