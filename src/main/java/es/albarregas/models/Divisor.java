/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.models;

import es.albarregas.exceptions.DivisionPorCero;

/**
 *
 * @author Carlos
 */
public class Divisor {
    public int dividir(int num1,int num2)
    {
        int resultado=0;
        try{
            resultado= division(num1, num2);
        }
        catch(DivisionPorCero d)
        {
            
        }
        
        return resultado;
    }
    public int division(int num1,int num2) throws DivisionPorCero
    {
        if(num2==0)
        {
            throw new DivisionPorCero("No se puede dividir entre cero");
        }
        else{
            return num1/num2;
        }
    }
}
