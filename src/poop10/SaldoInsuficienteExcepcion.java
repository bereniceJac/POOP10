/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase que epresenta una excepción que se lanza cuando se intenta retirar una cantidad de dinero 
 * que excede el saldo de una cuenta bancaria.
 * Hereda de la clase padre de todas las excepciones
 * @author Jacinto Robledo Valeria Berenice
 */
public class SaldoInsuficienteExcepcion extends Exception{
    /**
     * Método constructor que inicializa  el mensaje de error de la excepción a "Saldo insuficiente"
     */
    public SaldoInsuficienteExcepcion() {
        super("Saldo insuficiente");
    }
    
    
}