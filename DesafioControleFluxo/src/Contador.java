import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {

    try{
      Scanner scanner = new Scanner(System.in);
		  System.out.println("Digite o primeiro parâmetro: ");
		  int parametroUm = scanner.nextInt();
		  System.out.println("Digite o segundo parâmetro: ");
		  int parametroDois = scanner.nextInt();
      contar(parametroUm,parametroDois);
    }
    catch(ParametrosInvalidosException e){
      e.printStackTrace();
    }
    
  }
  static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException{
    int contagem = parametroDois - parametroUm;
    if ( parametroUm < parametroDois){
      for(int i = 1; i <= contagem; i++){
        System.out.println("Imprimindo o número "+i);
      }
    }
    else{
      throw new ParametrosInvalidosException();
    }
  }
}
