
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
public class conectaDAO {
    
    public Connection conectar(){
        Connection conn = null;
        
        try {
        
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_uc11",
                    "root",
                    "1234"
                );
            
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro ConectaDAO" + erro.getMessage());
        }
        return conn;
    }
    
    public void desconectar(Connection conn) {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Desconectado do banco de dados.");
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao desconectar: " + ex.getMessage());
            }
        }
    }
