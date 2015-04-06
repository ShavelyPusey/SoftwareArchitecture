// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConcreteHandlerAprobar.java

package edu.arqsoft.designpatterns.responsabilitychain;


// Referenced classes of package DesignPatterns.CadenaResponsabilidad:
//            HandlerRequest

public class ConcreteHandlerAprobar
{

    public ConcreteHandlerAprobar() {}


    public boolean aprobarSolicitud(HandlerRequest solicitud)
    {
        System.out.println("La solicitud ha sido aprobada");
        return true;
    }
}
