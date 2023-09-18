/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01.DTO;

/**
 *
 * @author autologon
 */
public class LivroDTO {
    private Integer livID;
    private String livTitulo;
    private Integer livISBN;

    public Integer getLivID() {
        return livID;
    }

    public void setLivID(Integer livID) {
        this.livID = livID;
    }

    public String getLivTitulo() {
        return livTitulo;
    }

    public void setLivTitulo(String livTitulo) {
        this.livTitulo = livTitulo;
    }

    public Integer getLivISBN() {
        return livISBN;
    }

    public void setLivISBN(Integer livISBN) {
        this.livISBN = livISBN;
    }

    @Override
    public String toString() {
        return "livroDTO{" + "livID=" + livID + ", livTitulo=" + livTitulo + ", livISBN=" + livISBN + '}';
    }
    
}
