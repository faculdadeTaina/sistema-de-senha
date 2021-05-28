//class

//importando o scanner
import java.util.Scanner;

class Main {
  //metodo da class
  public static void main(String[] args) {
  //trabalhando com entrada de dados
  //criar um objto scanne publicara entrada de dados
//criando leitor e dizendo que quero ver informações do teclado
Scanner scan = new Scanner(System.in);

//criando varial exmplo 2

int nota1=0, nota2=0, nota3=0 ,nota4=0, soma=0;
//criando constante
final int Media =10;
String nome="", res="";
//ler um dado
System.out.println("digite o nomde do aluno:");
nome=scan.nextLine();

System.out.println("digite a primeira note:");
nota1=scan.nextInt();

System.out.println("digite a segunda note:");
nota2=scan.nextInt();

System.out.println("digite a terceira note:");
nota3=scan.nextInt();

System.out.println("digite A quarta nota:");
nota4=scan.nextInt();

soma=(nota1+nota2+nota3+nota4)/4;

if(soma >=Media){
  res="Aprovado";

}else if(soma >=6 ){
 res="Recuperacao";
}else{
  res="reprovado";
}

System.out.printf("O aluno %s foi de %s , com nota %d: " ,nome,res,soma);


  }
}
