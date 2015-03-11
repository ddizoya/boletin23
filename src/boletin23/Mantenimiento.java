/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ddizoya
 */
public class Mantenimiento {

    ArrayList<FicheroLibreria> lista = new ArrayList<>();
    Scanner sc;
    ObjectOutputStream oos;
    PrintWriter pw;
    
    public void anadir(String nombrefichero, FicheroLibreria obj) {
        try {
            oos = new ObjectOutputStream(new FileOutputStream (nombrefichero));
            pw = new PrintWriter(new FileWriter(nombrefichero, true));
            pw.println(obj.getAutor() + "," + obj.getNombreLibro() + "," + obj.getPrecio() + "," + obj.getUnidades() + "#");
        } catch (IOException e) {
            System.err.println(e.toString());
        } finally {
            pw.close();
        }
    }

    public void consultar(String nombrefichero) {
        try {
            sc = new Scanner(new File(nombrefichero));
            
            
            String resp = JOptionPane.showInputDialog("Introduce el nombre del autor: ").toLowerCase();
            JOptionPane.showMessageDialog(null, sc.findInLine(resp2)); //Continuar.
            
           
        } catch (Exception ex) {
            System.err.println(ex.toString());
        } finally {
            sc.close();
        }

    }

}
