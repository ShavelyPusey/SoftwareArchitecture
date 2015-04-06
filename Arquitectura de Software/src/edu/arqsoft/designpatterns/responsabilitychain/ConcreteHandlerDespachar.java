// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConcreteHandlerDespachar.java

package edu.arqsoft.designpatterns.responsabilitychain;


// Referenced classes of package DesignPatterns.CadenaResponsabilidad:
//            HandlerRequest

public class ConcreteHandlerDespachar
{

    public ConcreteHandlerDespachar() {}


    public boolean despacharSolicitud(HandlerRequest solicitud)
    {
        System.out.println("La solicitud ha sido despachada");
        System.out.println("");
        return true;
    }
}