///conexção com o banoc de dados
package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaBD {
    public Connection conexao(){

String bd= "jdbc:sqlite:crud.db";

String td="CREATE TABLE IF NOT EXISTS usuario(id, integer, user string, password string, serviceName string)";

Connection con =null;
try{
  con = DriverManager.getConnetion(bd);
  Statement st = con.createStatement();
  st.execute(tb);
}catch(SQLExeception e){
 System.out.println(e.getMessage());
}

System.out.println("pegou de boas");
return con;

  }
}
