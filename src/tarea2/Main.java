package tarea2;
//author Mario Sanchez

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Rutina rut = new Rutina();
        int opc;
        boolean salir = false;
        do {
            try {
                opc = rut.demeNum("1- Sucesión de Fibonacci\n2- Dividir por medio de restas sucesivas\n"
                        + "3- Imprimir los dígitos de un número particular\n4- Torres de Hanoi\n5- Salir");
                switch (opc) {
                    case 1:
                        int numSu = rut.demeNum("Digite el numero hasta el que desea llegar la sucesión");
                        rut.fibonacci(numSu);
                        break;
                    case 2:
                        int divisor = rut.demeNum("Digite el divisor");
                        int dividendo = rut.demeNum("Digite el dividendo");
                        rut.restaSucesiva(divisor, dividendo);
                        break;
                    case 3:
                        int numHas = rut.demeNum("Digite el número hasta el que desea llegar");
                        rut.numerosHastaN(numHas);
                        break;
                    case 4:
                        int cantDiscos = rut.demeNum("Digite la cantidad de discos");
                        rut.torresHanoi(cantDiscos);
                        break;
                    case 5:
                        salir = true;
                        JOptionPane.showMessageDialog(null, "Hasta luego!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }//fin del switch 
            } catch (java.lang.StackOverflowError | NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Hay algún error al ejecutar esa tarea");
            }//fin del try catch
        } while (!salir);
    }//fin del main
}//fin de la clase
