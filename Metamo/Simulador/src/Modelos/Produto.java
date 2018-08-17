/**
 * 
 */
package Modelos;

import java.io.Serializable;

/**
 * 
 * @author Matsinhe
 * 
 * Posssue atributos comuns das classes filhas
 */
public class Produto {
    /*
    Nº de Série, Tipo (ex.: pessoal ou corporativo)
    e ligado (true ou false). Da mesma forma, também 
    são comuns as funcionalidades: ligar e desligar.
    */
    private String nrSerie;
    private String tipo;
    private boolean ligado;

    public Produto() {
    }
/**
 * 
 * @param nrSerie
 * @param tipo
 * @param ligado 
 * 
 * 
     * Construtor com todos atributos da classe e herdados
 */
    public Produto(String nrSerie, String tipo, boolean ligado) {
        this.nrSerie = nrSerie;
        this.tipo = tipo;
        this.ligado = ligado;
    }

    public String getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(String nrSerie) {
        this.nrSerie = nrSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
}
