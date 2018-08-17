/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author Matsinhe
 *
 * Esta classe implementa todas classes
 *
 * @see Computador
 * @see Impressora
 */
public abstract class Aplicativo extends Simulacao {

    /**
     *
     * @param args
     *
     * Executa todas implementacoes
     */
    public static void main(String[] args) {
        Computador comp = new Computador("512MB", "PC-209", "Corporativo", false);
        Impressora imp = new Impressora("9ppm", "Imp-209", "Pessoal", false);
        boolean cont = true;
        do {
            String op = JOptionPane.showInputDialog("Escolhe um equipamento!"
                    + "\n1. Computador\n2. Impressora");
            switch (op) {

                case "1": {
                    if (comp.isLigado() == false) {
                        switch (JOptionPane.showConfirmDialog(null, "Deseja ligar o PC?")) {
                            case 0: {
                                comp.ligar();
                                comp.processar();
                                JOptionPane.showMessageDialog(null, comp.toString());
                            }
                        }
                    } else {
                        switch (JOptionPane.showConfirmDialog(null, "Deseja desligar o PC?")) {
                            case 0: {
                                comp.desligar();
                            }
                        }
                    }
                }
                break;

                case "2": {
                    if (imp.isLigado() == false) {
                        switch (JOptionPane.showConfirmDialog(null, "Deseja ligar a impressora?")) {
                            case 0: {
                                JOptionPane.showMessageDialog(null, "A impressora esta sendo ligada...");
                                imp.ligar();
                                imp.imprimir();
                                JOptionPane.showMessageDialog(null, imp.toString());
                            }
                        }
                    } else {
                        switch (JOptionPane.showConfirmDialog(null, "Deseja desligar a impressora?")) {
                            case 0: {
                                imp.desligar();
                            }
                        }
                    }
                }
                break;
                default:
            }
        } while (cont == true);
    }
}
