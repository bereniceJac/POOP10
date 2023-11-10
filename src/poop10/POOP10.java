/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Práctica 10. Excepciones y errores.
 * @author Jacinto Robledo Valeria Berenice
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hola mundo");
        /**
         * Se crea un arreglo de mensajes
         * Si el índice del arreglo está fuera de los límites del arreglo, se lanza una excepción ArrayIndexOutOfBoundsException 
         * El código atrapa esta excepción e imprime un mensaje de error 
         * con el método getMessage(), returna un mensaje que describe la excepción
         */
        String[] mensajes = {"Primero","Segundo","Tercero"};
        try {
            for (int i = 0; i <=3; i++) {
            System.out.println("Mensaje: " + mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
            System.out.println();
            }
        
        System.out.println("hola mundo 2");
        
        /**
         * Se intenta dividir cero entre cero, por lo cual
         * se lanza una excepción ArithmeticException
         * El código atrapa esta excepción e imprime un mensaje de error
         */
        try {
            double x;
            x=0/0; //entero sobre entero, se hace un casteo:) f indica que es flotante 
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        /**
         * Se intenta dividir cero entre cero, por lo cual
         * si se produce una excepción ArithmeticException, el mensaje de la excepción se imprime
         * si se produce una excepción ArrayIndexOutOfBoundsException, el mensaje de la excepción también se imprime 
         */
        try {
            double x;
            x=0/0; 
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        
       /**
        * Se intenta dividir cero entre cero, por lo cual
        * si se produce una excepción ArithmeticException, el mensaje de la excepción se imprime
        * además, con el método printStackTrace() imprime la pila de llamadas de la excepción
        */ 
       try {
            double x;
            x=0/0;  
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }
       
        System.out.println("hola mundo 3");
        
        /**
         * se utiliza para manejar la excepción UnsupportedOperationException
         * Si el método metodoDivision() lanza esta excepción, 
         * el bloque catch se ejecuta y se imprime el mensaje de error "Error: Operación no soportada".
         */
        try {
            double division=metodoDivision(4f,6.0);
        }catch (UnsupportedOperationException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        /**
         * Se crea una instancia de la clase CuentaBancaria 
         * y luego realiza una serie de operaciones con la cuenta.
         * Se deposita, retira y se obtiene el saldo de la cuenta, 
         * hasta que el saldo de la cuenta es insuficiente, 
         * por lo que se lanza una excepción de saldo insuficiente.
         */
        CuentaBancaria cuenta = new CuentaBancaria();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        }catch(SaldoInsuficienteExcepcion e){
            e.printStackTrace();
        }
        
    }
    
    //todos los metodos que estan en el main deben de ser estaticos por definicion
    /**
     * Lanza una excepción UnsupportedOperationException con el mensaje "Operación no soportada"
     * @param f cualquier numero tipo flotante
     * @param d cualquier numero tipo double
     * @return una excepción con el mensaje "Operación no soportada"
     * @throws UnsupportedOperationException 
     */
    private static double metodoDivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operación no soportada"); 
    }
    
    
}