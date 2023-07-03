import java.util.Scanner;
public class atvdGilson {
public static void main(String[] args){
Scanner telaVaScanner = new Scanner(System.in);
String questao;
questao = """
ESCOLHA A QUESTÃO QUE QUER ACESSAR !
1 = PRIMEIRA
2 = SEGUNDA
3 = TERCEIRA
4 = QUARTA
5 = QUINTA         """;
System.out.println(questao);
int numeroVR = telaVaScanner.nextInt();
switch(numeroVR){
case 1:
String texto;
texto = """
AREA DO TRIANGULO RETANGULO 1
AREA DO CIRCULO 2
AREA DO TRAPEZIO 3
AREA DO QUADRADO 4
AREA DO RETANGULO 5
ESCOLHA UMA !  ! ! !      """;

System.out.println(texto);
int numero = telaVaScanner.nextInt();
// triangulo retangulo !

if (numero == 1 ) {
Double aB,aC;
System.out.println("DIGA O NUMERO DA BASE ! ");
aB = telaVaScanner.nextDouble();
System.out.println("DIGA O NUMERO DA ALTURA! ");
aC = telaVaScanner.nextDouble();
System.out.println("O RESULTADO DO CALCULO DA AREA SERA! " + (aB*aC) / 2 );
break;
}
//CIRCULO

if (numero == 2){
Double pi;
pi = 3.14159;
float aR;
System.out.println("DIGA O VALOR DO RAIO ! ! !");
aR = telaVaScanner.nextFloat();
System.out.println("O VALOR DA AREA DO CIRCULO VAI SER " + (Math.pow(aR,2) * pi));
break;
}
//TRAPZEIO
if (numero == 3){
Double aB1,aB2,vH;
System.out.println("DIGA O VALOR DA BASE MAIOR");
aB1 = telaVaScanner.nextDouble();
System.out.println("DIGA O VALOR DA BASE MENOR! ");
aB2 = telaVaScanner.nextDouble();
System.out.println("DIGA O VALOR DA ALTURA MAIOR");
vH = telaVaScanner.nextDouble();
System.out.println("O VALOR DA AREA DO TRAPEZIO É ! " + (aB1+aB2) * vH / 2);
break;
}
// QUADRADO
if (numero == 4){
double l1,l2;
System.out.println("Diga um lado ! ");
l1 = telaVaScanner.nextDouble();
System.out.println("Diga outro lado ");
l2 = telaVaScanner.nextDouble();
System.out.println("A área do quadrado é " + (l1*l2));
break;
}
//RETANGULO
if (numero == 5){
double lB,aH;
System.out.println("DIGITE A BASE! ");
lB = telaVaScanner.nextDouble();
System.out.println("DIGITE A ALTURA ! ");
aH = telaVaScanner.nextDouble();
System.out.println("A área do retangulo é " + (lB*aH));
break;
}
else{
System.out.println("NUMERO ERRADO, DIGITE O NUMERO CERTO ! ");
}
}
switch(numeroVR){
case 2:
String codigoDeRoupa;
codigoDeRoupa = """
CODIGO DA ROUPA UM É 329
CODIGO DA ROUPA DOIS É  210
""";
System.out.println("DIGA O CODIGO DA PEÇA !" );
System.out.println(codigoDeRoupa);
int codigo= telaVaScanner.nextInt();
if(codigo==329 ){
double vR,oR;
oR = 70.0;
vR = 60.0;
int qR;
qR = 10;
System.out.println("Quantidade de roupas que tem ainda no estoque desse codigo são " +  qR);
System.out.println("Comprando duas o valor sai por reais " + vR + " ou comprando apenas uma sai por ! reais " +  oR);
break;
}
if(codigo==210){
double vR2,oR2;
oR2 = 200.0;
vR2 = 100.0;
int qRR;
qRR = 7;
System.out.println("Quantidade de roupas que tem ainda no estoque desse codigo são " +  qRR);
System.out.println("Comprando duas o valor sai por reais " + vR2 + " ou comprando apenas uma sai por ! reais " +  oR2);
break;
}
else{
System.out.println("VOCE DIGITOU O O CODIGO ERRADO DIGITE NOVAMENTE");
}
}
switch(numeroVR){
case 3:
int A,B,C,D;
System.out.println("DIGA O VALOR DE A");
A = telaVaScanner.nextInt();
System.out.println("DIGA O VALOR DE B");
B = telaVaScanner.nextInt();
System.out.println("DIGA O VALOR DE C ");
C = telaVaScanner.nextInt();
System.out.println("DIGA O VALOR DE D");
D = telaVaScanner.nextInt();

System.out.println("O VALOR DE A " + A + " VALOR DE B  " + B + " VALOR DE C  " + C + " VALOR DE D " + D);

System.out.println("O VALOR DA DIFRENÇA É " + (A*B - C *D));
}
switch(numeroVR){
case 4:
System.out.println("DIGITE O PESO DO (PRATO EM QUILOS) ");
double peso = telaVaScanner.nextDouble();

double valorAPaga = peso * 23;

System.out.println("o valor a pagar vai ser  R$ " + valorAPaga);
}

switch(numeroVR){
case 5:
String textoxd;
textoxd = """
    1 PARA  A VISTA COM 10% DE DESCONTO
    2 PARCELADO EM 1 2 VEZES SEM JUROS
    3 DIVIDO EM 10 VEZES COM JUROS DE 5% SOBRE O VALOR TOTAL
    """;
System.out.println (textoxd);
int numero = telaVaScanner.nextInt();

System.out.println("DIGITE O VALOR DA COMPRA! ");
double valor = telaVaScanner.nextDouble();



if(numero == 1); {
System.out.println("O VALOR FICA A VISTA COM OS DESCONTO " + valor );
}




}
}
}





