/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.livroDAL;
import exercicio01.DTO.livroDTO;

/**
 *
 * @author autologon
 */
public class TestePesquisar {
    public static void main(String[ ] args) throws Exception
    {
        livroDAL dal = new livroDAL();
        livroDTO livro = dal.selecionarLivroPorID(2);
        System.out.println("Codigo: " + livro.getLivID());
        System.out.println("Nome Titulo: " + livro.getLivTitulo());   
        System.out.println("Nome ISBN: " + livro.getLivISBN());   
    }

}
