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
 */
public class Impressora extends Produto {

    /* descrição=Velocidade de Impressão (ex. 6 ppm).     */
    private String descricao;

    public Impressora() {
    }

    public Impressora(String descricao, String nrSerie, String tipo, boolean ligado) {
        super(nrSerie, tipo, ligado);
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "[" + "Velo: " + getDescricao() + ""
                + " | Serie: " + getNrSerie() + " | "
                + "Tipo: " + getTipo() + " | "
                + "Ligado?: " + isLigado() + ']';
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void ligar() {
        this.setLigado(true);
        JOptionPane.showMessageDialog(null, "A impressora está pronta para receber documentos...");
    }

    public void desligar() {
        JOptionPane.showMessageDialog(null, "A impressora não está disponível para imprimir...");
        this.setLigado(false);
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null, "A impressora está imprimindo...");
    }
}
