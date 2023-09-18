/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DAL;

import exercicio01.DTO.LivroDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author autologon
 */
public class LivroDAL extends ConexaoMySQL{
   public void incluir(LivroDTO livros) throws Exception{
        abrirBD();
        SQL = "INSERT INTO livros (livTitulo, livISBN ) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        //Busca os valores da classe clienteDTO
        ps.setString(1, livros.getLivTitulo());
        ps.setInt(2, livros.getLivISBN());
        ps.execute();
        fecharBD();
    } 
   public LivroDTO selecionarLivroPorID (int livID) throws Exception{
       abrirBD();
        SQL = "SELECT * FROM livros WHERE livID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, livID);
        rs = ps.executeQuery();
        LivroDTO livro = new LivroDTO();
        if(rs.next())
        {
            livro.setLivID(rs.getInt("livID"));
            livro.setLivTitulo(rs.getString("livTitulo"));
            livro.setLivISBN(rs.getInt("livISBN"));
            fecharBD();            
        }
        return livro;

   }
   public List selecionarListaLivros() throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM livros ORDER BY livTitulo";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaLivros = new ArrayList();
        while(rs.next())
        {
           LivroDTO livro = new LivroDTO();
            livro.setLivID(rs.getInt("livID"));
            livro.setLivTitulo(rs.getString("livTitulo"));
            livro.setLivISBN(rs.getInt("livISBN"));
           listaLivros.add(livro);         
        }
        fecharBD();
        return listaLivros;
    }
   
   public void alterarLivro(LivroDTO livro) throws Exception
     {
         abrirBD();         
         SQL = "UPDATE livros SET livTitulo = ?, livISBN = ? WHERE livID = ?";
         ps = con.prepareStatement(SQL);
         ps.setString(1, livro.getLivTitulo());
         ps.setInt(2, livro.getLivISBN());
         ps.execute();
         fecharBD();
     }

       public void excluirLivro(Integer livID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM livros WHERE livID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, livID);
        ps.execute();
        fecharBD();
    }

}
