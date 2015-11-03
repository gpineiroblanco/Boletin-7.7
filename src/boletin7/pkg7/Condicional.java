/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class Condicional {
    
    private double superficie;
    private double lado;
    private double base;
    private double altura;
    private double radio;
    static final double PI = 3.14;

    public Condicional() {

    }

    public void Comparar() {
        String opcion;
        opcion = JOptionPane.showInputDialog("***MENU***\n 1 -> Cuadrado.\n 2 -> Triángulo.\n 3 -> Círculo.");
        switch (opcion) {
            case "1":
                String dato = JOptionPane.showInputDialog("Introducir Lado");
                double l = Double.parseDouble(dato);
                JOptionPane.showMessageDialog(null, "Area del Cuadrado= " + (l * l));
                break;
            case "2":
                String dato1 = JOptionPane.showInputDialog("Introducir Base");
                double b = Double.parseDouble(dato1);
                String dato2 = JOptionPane.showInputDialog("Introducir Altura");
                double a = Double.parseDouble(dato2);
                JOptionPane.showMessageDialog(null, "Area del Triángulo= " + (b * a)/2);
                break;
            case "3":
                String dato3 = JOptionPane.showInputDialog("Introducir Radio");
                double r = Double.parseDouble(dato3);
                JOptionPane.showMessageDialog(null, "Area del Círculo= " + (PI * (r * r)));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción NO válida.");

        }
    }
}
