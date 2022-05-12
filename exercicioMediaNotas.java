import java.util.Scanner;
//impotando biblioteca.
class MediaNotas
//nomeando codigo.
{
    public static void main(String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        //criando scanner.
        float ac1,ac2,ag,af;
        //crindo as variaveis.
        
        System.out.printf("Digite a sua nota da ac1: ");
        //mensagem pedindo para o usuario digitar sua nota.
        ac1 = ler.nextFloat();
        //recebendo a nota digitada.
        System.out.printf("Digite a sua nota da ac2: ");
        //mensagem pedindo para o usuario digitar sua nota.
        ac2 = ler.nextFloat();
          //recebendo a nota digitada.
        System.out.printf("Digite a sua nota da ag: ");
        //mensagem pedindo para o usuario digitar sua nota.
        ag = ler.nextFloat();
          //recebendo a nota digitada.
        System.out.printf("Digite sua nota da af: ");
        //mensagem pedindo para o usuario digitar sua nota.
        af = ler.nextFloat();
          //recebendo a nota digitada.
        
         double media = ((ac1 * 0.15)  + (ac2 *  0.3) + (ag * 0.1 ) + (af * 0.45));
         //calculando todas as notas digitadas.
    System.out.printf("A sua media e: %f\n " ,media );
    //exibindo a media das notas.
    if (media >= 5)
    //se a nota calculada for maior ou igual a 5 sera considerada verdadeira.
    {
    System.out.println("Voce foi aprovado.");
    //se a nota for maior ou igual a 5 sera mostrado essa mensagem na tela.
    }
    else
    System.out.println("Voce foi reprovado."); 
    //se a nota for menor que 5 sera mostrado essa mensagem na tela.
        

    }
}
