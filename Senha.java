
package Main;

//proprides para senha
public class senha{
  private int id;
  private String user;
  private String password;
  private String serviceName;

//metodos para obter algo da base de dados

public int getId(){
  return id;
}

public String getUser(){
  return user;
}

public String getPassword(){
  return password;
}

public String getserviceName(){
  return serviceName;
}
//metodo para enviar dados para base de dados


public void setId (int id){
  this.id = id;
}

public void setUse (String user){
  this.user = user;
}

public void setSenha (String password){
  this.password = password;
}

public void setserviceName (String serviceName){
  this.serviceName = serviceName;
}

}

