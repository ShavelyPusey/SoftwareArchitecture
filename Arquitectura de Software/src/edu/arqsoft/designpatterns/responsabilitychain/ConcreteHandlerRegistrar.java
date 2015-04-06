// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConcreteHandlerRegistrar.java

package edu.arqsoft.designpatterns.responsabilitychain;


// Referenced classes of package DesignPatterns.CadenaResponsabilidad:
//            HandlerRequest

public class ConcreteHandlerRegistrar
{

    public ConcreteHandlerRegistrar() {}

    public HandlerRequest registrarSolicitud(HandlerRequest solicitud)
    {
        System.out.println("La solicitud de compra ha sido registrada");
        System.out.println("Descripci\363n de la solicitud: ");
        System.out.println(solicitud.getName());
        System.out.println(solicitud.getProduct());
        System.out.println(solicitud.getCost());
        System.out.println("");
        return solicitud;
    }
}
