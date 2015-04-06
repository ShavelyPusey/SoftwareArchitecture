// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Cliente.java

package edu.arqsoft.designpatterns.factory;


// Referenced classes of package DesignPatterns.Factory:
//            Factory

public class Cliente
{

    public Cliente() { }

    public static void main(String args[])
        {
            Factory factory = new Factory();
            IProduct product1 = factory.hacerFabrica(1);
            IProduct product2 = factory.hacerFabrica(2);
        }
}