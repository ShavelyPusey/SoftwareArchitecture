// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConcreteProduct1.java

package edu.arqsoft.designpatterns.factory;


// Referenced classes of package DesignPatterns.Factory:
//            Product

public class ConcreteProduct1 implements IProduct
{

    public ConcreteProduct1() {}


    public IProduct crearProducto()
        {
            System.out.println("ConcreteProduct1");
            return new ConcreteProduct1();
        }
}