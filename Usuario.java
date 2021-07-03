
package Main;
import java.sql.Connection;
import java.sql.PreparedStatement;
//regras de negocio
public class Usuario {
    ConectaBD bd = new ConectaBD();
    Connection con = bd.conexao();

public void inserirUsuario(Usuario usuario){
    
    String sql = "INSERT INTO usuario(id , name, password, serviceName)VALUES()";
    try{
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.setInt(1, usuario.getId());
        ps.setInt(2, usuario.getName());
        ps.setInt(3, usuario.getPasswoord());
        System.out.println("Dados salvos com sucesso!");
    }catch(Expeption e){
        e.printStackTrace();
    }
    
}

   public void excluirTodosusuarios(){
       String sql ="DELETE FROM usuario";
       try{
         PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
         ps.executeLargeUpdate();
         System.out.println("Dados excluidos com sucesso!");
       }
       
       
       public void excluirUsuario(int id){
    
    String sql = "DELETE from usuario WHERE id=";
    try{
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
        ps.setInt(1, id());
        ps.executeUpdate();
       
        System.out.println("Usuario excluido com sucesso!");
    }catch(Expeption e){
        e.printStackTrace();
    }
    
public void atualizarUsuario(int id, String name,String password ){
    
    String sql = "INSERT INTO usuario(id , name, password, serviceName)VALUES()";
    try{
        PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
       
        System.out.println("Dados salvos com sucesso!");
    }catch(Expeption e){
        e.printStackTrace();
    }
    }
   }
