/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentasbancarias;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class CuentasBancarias {

    public static void main(String[] args) {
      
    Cuentas cuenta1 = new Cuentas();
    Cuentas cuenta2 = new Cuentas();
   while (true){
       Scanner qw = new Scanner(System.in);
       System.out.println("*************************");
       System.out.println("/     Menu principal    /");
       System.out.println("/ 1.Mostrar             /");
       System.out.println("/ 2.Abonar              /");
       System.out.println("/ 3.Retirar             /");
       System.out.println("/ 4.Cerrar              /");
       System.out.println("*************************");
       int respuesta = qw.nextInt();
       
   switch (respuesta){
       case 1:
           System.out.println(cuenta1.getcuenta());
           System.out.println(cuenta2.getcuenta());
           break;
       case 2:
           Scanner gw = new Scanner(System.in);
           System.out.println("¿Que cuenta desea abonar?");
           int respuestaCuenta = gw.nextInt();
          
           if (respuestaCuenta == 1){
               System.out.println("Ingrese la cantidad a abonar");
               int abono = cuenta1.getcuenta()+gw.nextInt();
               cuenta1.setCuenta1(abono);
               System.out.println(abono);
               System.out.println("Su saldo ha cambiado a:"+abono);
            }else if (respuestaCuenta == 2) {  
                System.out.println("Ingrese la cantidad a abonar");
               int abono1 = cuenta2.getcuenta()+gw.nextInt();
               cuenta2.setCuenta1(abono1);
               System.out.println("Su saldo ha cambiado a:"+abono1);
             }else{
                System.out.println("Cuenta invalida");
           }
           break;
       case 3:
         Scanner ew = new Scanner(System.in);
           System.out.println("¿De que cuenta desea retirar?");
           int respuestaCuenta2 = ew.nextInt();
          
           if (respuestaCuenta2 == 1){
               System.out.println("Ingrese la cantidad a retirar");
               int retiro = cuenta1.getcuenta()-ew.nextInt();
               cuenta1.setCuenta1(retiro);
               System.out.println(retiro);
               System.out.println("Su saldo ha cambiado a:"+retiro);
            }else if (respuestaCuenta2 == 2) {  
                System.out.println("Ingrese la cantidad a retirar");
               int retiro1 = cuenta2.getcuenta()-ew.nextInt();
               cuenta2.setCuenta1(retiro1);
               System.out.println("Su saldo ha cambiado a:"+retiro1);
             }else{
                System.out.println("Cuenta invalida");
           }
           break;
       case 4:
           System.out.println("Vuelva pronto");
           System.exit(0);
           break;
   }   
   } 
    }
    }
    

