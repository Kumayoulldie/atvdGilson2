import java.util.Scanner; // ESCOLHER A CLASSE!

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // considera ate a quebra da linha
        System.out.println("INFORME SEU NOME COMPLETO ! ");
        String nome = sc.nextLine();
        System.out.println (" QUANTOS ANOS VOCE TEM");
        int idade = sc.nextInt();
        System.out.println( " INFORME O VALOR DO SALARIO ");
        double salario = sc.nextDouble();
        System.out.println("INFORME VALOR DA TAXA");
        float taxa = sc.nextFloat();
        System.out.println("INFORME SEU SEXO");
        char sexo = sc.next().charAt(idade);
        // considera  ate o espaço  dentro do texto.
        String nome1 = sc.next();
        sc.close();
    }


}
