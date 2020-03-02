package tarea2;

import javax.swing.JOptionPane;

public class Rutina {

    public int demeNum(String msj) {
        String s = JOptionPane.showInputDialog(msj);
        int n = Integer.parseInt(s);
        return n;
    }//fin demenum

    ////////////////////////////////////////////////////////////////////////////
    public void fibonacci(int x) {
        int num = x;
        System.out.println("La sucesión hasta la posición " + num + " es:");
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + "  ");
        }//fin del for para la impresion de los numeros
        System.out.println("");
    }//fin de la sucesion de fibonacci

    private int fib(int num) {
        if (num == 0) {
            return num;
        }//fin del if del caso base
        if (num == 1) {
            return num;
        }//fin del if para n = 1
        else {
            return fib(num - 1) + fib(num - 2);
        }//fin del else
    }//fin del metodo recursivo de fibonacci

    ////////////////////////////////////////////////////////////////////////////
    public void restaSucesiva(int n, int m) {
        int dividendo = n;
        int divisor = m;
        int contador = 1;
        System.out.println(n + " dividido entre " + m + " es: " + restaSuc(dividendo, divisor, contador));
    }//fin de la resta sucesiva

    private int restaSuc(int dividendo, int divisor, int cont) {
        if ((dividendo - divisor) == 0) {
            return cont;
        }//fin del if 1
        else {
            return restaSuc((dividendo - divisor), divisor, cont + 1);
        }//fin del else
    }//fin de la resta sucesiva

    ////////////////////////////////////////////////////////////////////////////
    public void numerosHastaN(int x) {
        //uno inicia de atras para adelante
        int uno = 1;
        System.out.println(numHasta(x, uno));
    }//fin de los numeros hasta

    private int numHasta(int n, int uno) {
        if (uno == n) {
            return n;
        }//fin del caso base
        else {
            //impresion del 1 en adelante antes del aumento de la variable uno
            System.out.print(uno + ", ");
            //llamado recursivo a uno + 1
            return numHasta(n, uno + 1);
        }//fin del else
    }//fin del metodo recursivo

    ////////////////////////////////////////////////////////////////////////////
    public void torresHanoi(int x) {
        //Cargamos el metodo con 4 parametros, la cantidad de discos = x, y el orden
        //de las torres origen = 1, auxiliar = 2 y destino = 3
        torres(x, 1, 2, 3);
    }//fin de las torres de hanoi

    private void torres(int x, int orig, int aux, int dest) {
        if (x == 1) {
            //Segun la presentacion, basta con observar que si sólo hay un disco (caso base), 
            //entonces se lleva directamente de la varilla origen a la varilla destino.
            System.out.println("De la torre " + orig + " a la torre " + dest);
        }//fin del if para caso base       
        //Si hay que llevar n>1 (caso general) discos desde origen a destino entonces:
        else {
            //Se llevan x-1 discos de la varilla origen a la auxiliar, en este caso
            //el origen es el mismo y el destino es el auxiliar.
            torres(x - 1, orig, dest, aux);
            //------------------------------------------------------------------
            //Se lleva un solo disco (el que queda) de la varilla origen a la destino
            System.out.println("De la torre " + orig + " a la torre " + dest);
            //------------------------------------------------------------------
            //Se traen los x-1 discos de la varilla auxiliar a la destino, en este 
            //caso el origen sera el auxiliar y el destino es el mismo.
            torres(x - 1, aux, orig, dest);
            //------------------------------------------------------------------
        }//fin del caso general
    }//fin de las torres
    ////////////////////////////////////////////////////////////////////////////
}//fin dela clase rutina
