/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class Main {

    public static void operativa_cuenta(String[] args) {
        CCuenta cuenta1;//para cambiar el nombre a una variable la selecionas, haces click derecho
        //selecionas la opcion refactor, dentro de esta, dento rename y cambias el nombre
        double saldoActual;
        operativaCuenta();//para crear el metodo, tienes que selecionar el codigo, darle
        //click derecho irte a la parte de de refactor , extract method, le pones un nombre y 
        //te genera el metodo
    }
//cambip necesatop para subir al  repositorio 
	private static void operativaCuenta() {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
