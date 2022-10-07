/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad01.jdguncay.nacabrera;

/**
 *
 * @author David
 */
public class Unidad01jguncayncabreradsamaniego {

    public static void main(String[] args) {
        System.out.println("Vamos a crear tres objetos por cada clase y los  mostreremos en pantalla: ");
        
        var perro1 = new Perro();
        perro1.dueño="Jose Jimenes";
        perro1.edad=5;
        perro1.nombre="Fufi";
        perro1.raza="Labrador retriever";
        System.out.println("El perro se llama "+perro1.nombre+" su dueño es "+perro1.dueño+" y tiene una edad de "+perro1.edad+" ademas es de raza "+perro1.raza+".");
        var perro2 = new Perro();
        perro2.dueño="Juan Ordoñes";
        perro2.edad=2;
        perro2.nombre="Pachi";
        perro2.raza="Bulldog francés";
        System.out.println("El perro se llama "+perro2.nombre+" su dueño es "+perro2.dueño+" y tiene una edad de "+perro2.edad+" ademas es de raza "+perro2.raza+".");
        var perro3 = new Perro();
        perro3.dueño="Pedro Calderon";
        perro3.edad=10;
        perro3.nombre="Chato";
        perro3.raza="Caniche";
        System.out.println("El perro se llama "+perro3.nombre+" su dueño es "+perro3.dueño+" y tiene una edad de "+perro3.edad+" ademas es de raza "+perro3.raza+".");
        
        var automovil1= new Automovil();
        automovil1.año=1990;
        automovil1.marca="Toyota";
        automovil1.placa="ABI6611";
        automovil1.propietario="Pedro Suares";
        System.out.println("La marca de carro es "+automovil1.marca+" con el numero de placa "+automovil1.placa+" del año "+automovil1.año+" del sr/sra "+automovil1.propietario);
        var automovil2= new Automovil();
        automovil2.año=2000;
        automovil2.marca="Hiundai";
        automovil2.placa="ACB3698";
        automovil2.propietario="Marco Antonio";
        System.out.println("La marca de carro es "+automovil2.marca+" con el numero de placa "+automovil2.placa+" del año "+automovil2.año+" del sr/sra "+automovil2.propietario);
        var automovil3= new Automovil();
        automovil3.año=2013;
        automovil3.marca="KIA";
        automovil3.placa="AOE3578";
        automovil3.propietario="Juan Peralta";
        System.out.println("La marca de carro es "+automovil3.marca+" con el numero de placa "+automovil3.placa+" del año "+automovil3.año+" del sr/sra "+automovil3.propietario);
        
        var camisa1=new Camisa();
        camisa1.color="Negro";
        camisa1.marca="Puma";
        camisa1.modelo="Clasico";
        camisa1.talla=32;
        System.out.println("La camisa es de marca "+camisa1.marca+" de un color "+camisa1.color+" es de un modelo "+camisa1.modelo+" de talla "+camisa1.talla);
        var camisa2=new Camisa();
        camisa2.color="Blanco";
        camisa2.marca="Nike";
        camisa2.modelo="Elegante";
        camisa2.talla=34;
        System.out.println("La camisa es de marca "+camisa2.marca+" de un color "+camisa2.color+" es de un modelo "+camisa2.modelo+" de talla "+camisa2.talla);
        var camisa3=new Camisa();
        camisa3.color="Amarillo";
        camisa3.marca="Addidas";
        camisa3.modelo="Deportivo";
        camisa3.talla=34;
        System.out.println("La camisa es de marca "+camisa3.marca+" de un color "+camisa3.color+" es de un modelo "+camisa3.modelo+" de talla "+camisa3.talla);
        
        var computadora1=new Computadora();
        computadora1.garantia= 10;
        computadora1.marca="Hp";
        computadora1.modelo="Hp pro";
        computadora1.numSerie=2536874;
        System.out.println("La coputadora es una "+computadora1.marca+" que es de un modelo "+computadora1.modelo+" con una garantia de "+computadora1.garantia+" años y su numero de serie es "+computadora1.numSerie);
        var computadora2=new Computadora();
        computadora2.garantia= 0;
        computadora2.marca="Toshiba";
        computadora2.modelo="laptop";
        computadora2.numSerie=9734854;
        System.out.println("La coputadora es una "+computadora2.marca+" que es de un modelo "+computadora2.modelo+" con una garantia de "+computadora2.garantia+" años y su numero de serie es "+computadora2.numSerie);
        var computadora3=new Computadora();
        computadora3.garantia= 3;
        computadora3.marca="Apple";
        computadora3.modelo="Mac Air";
        computadora3.numSerie=10059632;
        System.out.println("La coputadora es una "+computadora3.marca+" que es de un modelo "+computadora3.modelo+" con una garantia de "+computadora3.garantia+" años y su numero de serie es "+computadora3.numSerie);
        
        var persona1=new Persona();
        persona1.altura= 1.6 ;
        persona1.cedula="0100365845";
        persona1.edad=15;
        persona1.nombre="Juan Guncay";
        System.out.println("La persona "+persona1.nombre+" de edad de "+persona1.edad+" años de numeor de cedula "+persona1.cedula+" tiene una estatura de "+persona1.altura+"m");
        var persona2=new Persona();
        persona2.altura= 1.8 ;
        persona2.cedula="0100548751";
        persona2.edad=20;
        persona2.nombre="Pedro Orellana";
        System.out.println("La persona "+persona2.nombre+" de edad de "+persona2.edad+" años de numeor de cedula "+persona2.cedula+" tiene una estatura de "+persona2.altura+"m");
        var persona3=new Persona();
        persona3.altura= 1.4 ;
        persona3.cedula="010098541";
        persona3.edad=35;
        persona3.nombre="Josue Guncay";
        System.out.println("La persona "+persona3.nombre+" de edad de "+persona3.edad+" años de numeor de cedula "+persona3.cedula+" tiene una estatura de "+persona3.altura+"m");
        
        var zapato1=new Zapato();
        zapato1.color="Azul";
        zapato1.marca="Addidas";
        zapato1.modelo="Deportivos";
        zapato1.talla=9;
        System.out.println("Los zapatos son de marca "+zapato1.marca+" Y de color "+zapato1.color+" ademas son de un modelo "+zapato1.modelo+" y de talla "+zapato1.talla);
        var zapato2=new Zapato();
        zapato2.color="Negro";
        zapato2.marca="Puma";
        zapato2.modelo="Deportivos";
        zapato2.talla=8;
        System.out.println("Los zapatos son de marca "+zapato2.marca+" Y de color "+zapato2.color+" ademas son de un modelo "+zapato2.modelo+" y de talla "+zapato2.talla);
        var zapato3=new Zapato();
        zapato3.color="Cafes";
        zapato3.marca="GUUCCI";
        zapato3.modelo="Casual ";
        zapato3.talla=7;
        System.out.println("Los zapatos son de marca "+zapato3.marca+" Y de color "+zapato3.color+" ademas son de un modelo "+zapato3.modelo+" y de talla "+zapato3.talla);
        
        
        
        
        
        
        
        
        System.out.println("FIN!!!!");
    }
}
