/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Beans;

import Pojos.Estudiante;
import Services.IEstudiante;

/**
 *
 * @author user
 */
public class Acceso implements IEstudiante{
    @Override
    public int Acceso(Estudiante es){
    if(es.getUser().equals("Alex")&& es.getPasswork().equals("123") ){
       return 0;
    
    }else{
        return 1;
    
    }
  
}
}