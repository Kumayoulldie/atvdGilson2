import java.util.Scanner; 

public class atvd {
    public static void main(String[] args) throws Exception {

Scanner lerTecladin = new Scanner(System.in);
System.out.println(" NUMERO DA MATRICULA é ");
int matricula = lerTecladin.nextInt();
System.out.println("Numero Funcionarios é ! ");
String funcionarios = lerTecladin.next();
System.out.println("Numero De Horas Trabalhados !");
double horas = lerTecladin.nextDouble();
System.out.println("VALOR A RECEBER " + (horas * 10));


lerTecladin.close();
    }
}