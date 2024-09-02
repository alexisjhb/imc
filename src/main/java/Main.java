import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua altura:");
double altura = sc.nextDouble();
        System.out.println("Seu peso:");
double massa = sc.nextDouble();
double imc = massa / (altura * altura);
System.out.printf("Seu imc é %.2f", imc);
if (imc < 18.5) {
            System.out.println(" Abaixo do peso");
        } 
if (imc >= 12.6&& imc < 25) {
            System.out.println(" Peso normal");
} 
if (imc >= 25 && imc < 35) {
            System.out.println(" Sobrepeso");
} 
if (imc >= 35
   ) {
            System.out.println(" Obesidade");
        } 
    }
}