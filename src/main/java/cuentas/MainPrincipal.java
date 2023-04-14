package cuentas;

/**
 * @date 27 mar. 2023 14:52:11
 * @author 1DAW15
 * 2. Domingo Bermúdez Díaz
 * @version 1.0
 */
public class MainPrincipal { //Inicio de la clase.

    public static void main(String[] args) {
        //Método operativa_cuenta.
        operativa_cuenta("Cuenta personal", 5);
        
    } //Fin del main.

    private static void operativa_cuenta(String cantidad, float tipo) { //Inicio del main.
        //Atributos.
        CCuenta cuenta1;
        double saldoActual;

        //Ejemplo de una cuenta.
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("Nombre de la cantidad: " + cantidad + " y su tipo: " + tipo);   //Imprime los valores introducidos como parámetros.
        System.out.println("El saldo actual es: " + saldoActual);
        
        System.out.println("");

        //Retirada.
        try {
            System.out.println("Retirada en cuenta.");
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar.");
        }
        
        System.out.println("");
        
        //Ingreso.
        try {
            System.out.println("Ingreso en cuenta.");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar.");
        }
    }

} //Fin de la clase.
