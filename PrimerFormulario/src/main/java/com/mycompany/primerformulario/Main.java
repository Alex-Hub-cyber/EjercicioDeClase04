/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerformulario;

import Beans.Acceso;
import Pojos.Estudiante;

/**
 *
 * @author user
 */
public class Main {
    

public static void main(String[] args){
  Estudiante es = new Estudiante();
   
  Acceso ac = new Acceso();
  //Scanner sc = new Scanner(System.in);
  
  es.setUser("Alex");
  es.setPasswork("123");
  
  var logica = ac.Acceso(es);
  
  if(logica ==0){
      System.out.println("Inicio Correcto");
  
  
  }else{
  
      System.out.println("Incorrecto");
  
  }
  
  }
}