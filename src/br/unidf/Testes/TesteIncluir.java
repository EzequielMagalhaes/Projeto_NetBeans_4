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
public class TesteIncluir {
    public static void main(String[] args) throws Exception
    {
        livroDTO livro = new livroDTO();
        livro.setLivISBN(12);
        livro.setLivTitulo("Xablau");
        livroDAL dal = new livroDAL();
        dal.incluir(livro);
        System.out.print("Livro de " + livro.getLivISBN()+ " Cadastrado com sucesso!");
    }

}
