// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Cliente.java

package edu.arqsoft.designpatterns.responsabilitychain;

import java.util.Scanner;

// Referenced classes of package DesignPatterns.CadenaResponsabilidad:
//            HandlerRequest, ConcreteHandlerRegistrar, ConcreteHandlerAprobar, ConcreteHandlerDespachar

public class Cliente
{

    public Cliente() {}


    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Generar solicitud de compra: ");
        System.out.println("Digite a nombre de quien se genera la solicitud: ");
        String name = reader.nextLine();
        
        System.out.println("Digite producto a solicitar: ");
        String product = reader.nextLine();
        
        System.out.println("Digite costo del producto: ");
        int cost = Integer.parseInt(reader.nextLine());
        System.out.println("");
        
        HandlerRequest sucessor = new HandlerRequest(name, product, cost, true);
        ConcreteHandlerRegistrar registrar = new ConcreteHandlerRegistrar();
        registrar.registrarSolicitud(sucessor);
        
        ConcreteHandlerAprobar aprobar = new ConcreteHandlerAprobar();
        aprobar.aprobarSolicitud(sucessor);
        
        ConcreteHandlerDespachar despachar = new ConcreteHandlerDespachar();
        despachar.despacharSolicitud(sucessor);
    }
}
