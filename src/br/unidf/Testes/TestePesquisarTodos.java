/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Testes;

import br.unidf.DAL.livroDAL;
import exercicio01.DTO.livroDTO;
import java.util.List;

/**
 *
 * @author autologon
 */
public class TestePesquisarTodos {
    public static void main(String[] args) throws Exception {
        livroDAL dal = new livroDAL();
        List<livroDTO> livros = dal.selecionarListaLivros();
        livros.forEach(System.out::println);
    }
}
