// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Factory.java

package edu.arqsoft.designpatterns.factory;

import java.io.PrintStream;
import java.util.Scanner;

// Referenced classes of package DesignPatterns.Factory:
//            ConcreteProduct1, ConcreteProduct2, Product

public class Factory
{

    public Factory() {}

    public IProduct hacerFabrica(int tipo)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite numero de producto a crear: ");
        tipo = Integer.parseInt(reader.nextLine());
        
        if(tipo == 1)
            {
                IProduct pro = new ConcreteProduct1();
                pro.crearProducto();
            } 
        else if(tipo == 2)
            {
                IProduct pro = new ConcreteProduct2();
                pro.crearProducto();
            } 
        else
            {
                System.out.println("No existe producto");
            }
        return null;
    }
}
