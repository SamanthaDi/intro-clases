package com.company;

class Persona
{
    //variables del objeto + atributos -> estado de un objeto
    //tipos primitivos numericos se inicializan a cero
    private int edad;
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void cumplirAnios()
    {
        edad++;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }
}

//debuguear -> corre pasoa  paso utilizando el IDE

public class Main {
    public static void main(String[] args){
        Persona juan = new Persona();
        Persona lupe = new Persona();
        int i;
        juan.setName("juan");
        lupe.setName("lupe");

        for(i=0;i<2;i++)
            lupe.cumplirAnios();

        for(i=0;i<4;i++)
            juan.cumplirAnios();

        System.out.println(juan.getName() + " tiene " + juan.getEdad() + " años");
        System.out.println(lupe.getName() + " tiene " + lupe.getEdad() + " años");
    }
}