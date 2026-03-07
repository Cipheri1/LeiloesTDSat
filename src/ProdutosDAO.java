/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
        
        conn = new conectaDAO ().conectar();
        
        try {
            st = conn.prepareStatement(
                    "INSERT INTO produtos (nome, valor, status) VALUES (?,?,?)"
            ); 
            st.setString(1, produto.getNome());
            st.setInt(2, produto.getValor());
            st.setString(3, produto.getStatus());
            
            st.executeUpdate();
            
            System.out.println("Cadastro realizado com sucesso!");
            
          
        } catch (SQLException ex) {
        
            System.out.println("Erro ao cadastrar produto" + ex.getMessage());
        }   
        new conectaDAO ().desconectar(conn);       
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
            ArrayList<ProdutosDTO> listagem = new ArrayList();
            
            conn = new conectaDAO().conectar();
            
            try{
                st = conn.prepareStatement("SELECT * FROM produtos");
                rs = st.executeQuery();
                
                while (rs.next()) {
                    ProdutosDTO i = new ProdutosDTO();
                    i.setId(rs.getInt("id"));
                    i.setNome(rs.getString("nome"));
                    i.setValor(rs.getInt("valor"));
                    i.setStatus(rs.getString("status"));
                
                listagem.add(i);
                }
                } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
            }
        return listagem;
    }
    public void venderProduto (int id){
        conn = new conectaDAO().conectar();
        try {
            st = conn.prepareStatement(
                    "UPDATE produtos SET status = 'Vendido' WHERE id = ?"
                    );
            st.setInt(1, id);
            st.executeUpdate();
        
        } catch (SQLException ex) {
            System.out.println("Erro ao vender: " + ex.getMessage());
        }
        new conectaDAO().desconectar(conn);
    }
    public ArrayList<ProdutosDTO> listarProdutosVendidos (){
        ArrayList<ProdutosDTO> vendidos = new ArrayList();
            
            conn = new conectaDAO().conectar();
            
            try{
                st = conn.prepareStatement("SELECT * FROM produtos WHERE status = 'Vendido'");
                rs = st.executeQuery();
                
                while (rs.next()) {
                    ProdutosDTO i = new ProdutosDTO();
                    i.setId(rs.getInt("id"));
                    i.setNome(rs.getString("nome"));
                    i.setValor(rs.getInt("valor"));
                    i.setStatus(rs.getString("status"));
                
                vendidos.add(i);
                }
                } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
            
                }
         return vendidos;      
    }
}


