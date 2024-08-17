


public class leituraDadosTeclado{//Nome da classe

   public static void main(String[] args){

    Scanner scan=new Scanner(System.in);


      System.out.println("Digite seu nome completo");//Entrada de dado.
      String nomeCompleto = scan.nextLine(); //Saída de dado.
      //Imprimir a mensagem
      System.out.println("Seu nome completo é:" +nomeCompleto);

     System.out.println("Digite seu primeiro nome");//Entrada de dado.
     String primeiroNome=  scan.next(); //Saída de dado.
     //Imprimir a mensagem
     System.out.println(" Seu primeiro nome é"+primeiroNome);

     System.out.println("Digite sua idade");//Entrada de dado.
     int  idade=  scan.nextInt(); //Saída de dado.
     //Imrprimir a mensagem
     System.out.println("Sua idade é"+idade);
     
     System.out.println("Digite sua idade");//Entrada de dado
     double altura=  scan.nextDouble();//Saída de dado
     //Imprimir a mensagem
     System.out.println("Sua altura é"+altura);   


   } 
     

}
