/**
 *
 */
package Modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author Matsinhe
 */
public class Computador extends Produto {

    /**
     * Velocidade de Processamento (ex. 3GHz).
     */
    private String processamento;

    public Computador() {
    }

    /**
     *
     * @param processamento
     * @param nrSerie
     * @param tipo
     * @param ligado
     *
     * Construtor com todos atributos da classe e herdados
     */
    public Computador(String processamento, String nrSerie, String tipo, boolean ligado) {
        super(nrSerie, tipo, ligado);
        this.processamento = processamento;
    }

    public String getProcessamento() {
        return processamento;
    }

    public void setProcessamento(String processamento) {
        this.processamento = processamento;
    }

    /**
     * além de ligar deve exibir a mensagem que: "O computador está sendo
     * ligado...".
     */
    public void ligar() {
        JOptionPane.showMessageDialog(null, "O PC esta sendo ligado...");
        this.setLigado(true);
    }

    /**
     * desliga e exibe a mensagem: "O computador está sendo desligado...".
     */
    public void desligar() {
        JOptionPane.showMessageDialog(null, "computador está sendo desligado...");
        this.setLigado(false);
    }

    /**
     * deve exibir a mensagem: "Computador processando...".
     */
    public void processar() {
        JOptionPane.showMessageDialog(null, "Computador processando...");
    }

    @Override
    public String toString() {
        return "[" + "CPU: " + getProcessamento() + ""
                + " | Serie: " + getNrSerie() + " | "
                + "Tipo: " + getTipo() + " | "
                + "Ligado?: " + isLigado() + ']';
    }

}
