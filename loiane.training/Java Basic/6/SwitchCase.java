
public class SwitchCase{

public static void main(String[] args){


   Scanner scan = New Scanner(System.in);

   System.out.println("Informe um dia da semana de [1 até 7]");
   int diaSemana= scan.nextInt();


  if(diaSemana == 1){

    System.out.println("Domingo");
    

  } else if(diaSemana == 2){


     System.out.println("Segunda");

   
} else if(diaSemana == 3){


     System.out.println("terça");

   
} else if(diaSemana == 4){


     System.out.println("Quarta");

   
} else if(diaSemana == 5){


     System.out.println("Quinta");

   
} else if(diaSemana == 6){


     System.out.println("Sexta");

   
} else if(diaSemana == 7){


     System.out.println("Sábado");

   }else{

     System.out.println("Não é um dia da semana válido);

  }


}
