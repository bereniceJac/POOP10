/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase que representa una cuenta bancaria
 * Almacena el saldo de la cuenta y proporciona métodos para depositar y retirar dinero
 * @author Jacinto Robledo Valeria Berenice
 */
public class CuentaBancaria {
    /**
     * Atributo: saldo que representa el saldo actual de la cuenta
     */
    private double saldo;
    
    /**
     * Constructor que inicializa el saldo con cero
     */
    public CuentaBancaria() {
        saldo=0;
    }
    
    /**
     * Constructor lleno
     * @param saldo saldo de la cuenta
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Método getSaldo()
     * @return returna el saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * Método que depositva una cantidad de dinero en la cuenta
     * @param monto monto a depositar en la cuenta
     */
    public void depositar(double monto){
        System.out.println("Depositando "+monto);
        saldo +=monto;
    }
    
    /**
     * Método que retira una cantidad de dinero de la cuenta
     * @param monto monto a retirar de la cuenta
     * @throws SaldoInsuficienteExcepcion lanzada cuando se intenta retirar una cantidad de dinero 
     * que excede al saldo de la cuenta
     */
    public void retirar(double monto) 
            throws SaldoInsuficienteExcepcion{
        System.out.println("Retirando "+monto);
        if (saldo<monto)
            throw new SaldoInsuficienteExcepcion();
        else
            saldo -= monto;
    }
    
}