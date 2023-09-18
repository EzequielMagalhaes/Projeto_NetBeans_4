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
public class TesteExcluir {
    public static void main(String[] args) throws Exception {
        livroDAL dal = new livroDAL();
        dal.excluirLivro(1);
        System.out.println("Livro deletado com sucesso: ");
    }
 
}
