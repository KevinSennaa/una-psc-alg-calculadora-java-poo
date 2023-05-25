import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacao operacao = new Operacao();


        System.out.println("Calculadora");

        while(true){
        System.out.println("Qual operação deseja fazer? (+, -, /, ^, !)");
        String simbolo = scanner.next().toUpperCase();
        if(simbolo.equals("Q")){
            break;
        }
        
        System.out.println("Informe o primeiro número: ");
        operacao.setNumeroUm(scanner.nextDouble());
       

        System.out.println("Informe o segundo número: ");
        operacao.setNumeroDois(scanner.nextDouble());
        
        if(simbolo.equals("+")){
            
            double resultadoSomar = operacao.somar();
            System.out.println("Resultado da soma: " + resultadoSomar);
        }

        else if(simbolo.equals("-")){
            double resultadoSubtrair = operacao.subtrair();
            System.out.println("Resultado da subtração: " + resultadoSubtrair);
        }

        else if(simbolo.equals("^")){
            double resultadoPotencia = operacao.potencia();
            System.out.println("Resultado da potência: " + resultadoPotencia);
        }

        else if(simbolo.equals("/")){
            if(operacao.getNumeroUm() == 0){
                System.out.println("Impossível realizar divisao por zero");
                break;
            }else{
                double resultadoDividir = operacao.dividir();

                System.out.println("Resultado da divisao: " + resultadoDividir);
            }
            
        }

        else if(simbolo.equals("*")){
            double resultadoMultiplicar = operacao.multiplicar();
            System.out.println("Resultado da multiplicação: " + resultadoMultiplicar);
        }

        else if(simbolo.equals("!")){
            if(operacao.getNumeroUm() < 0){
                System.out.println("Não existe raiz de número 0");
                break;
            }else{
            double resultadoRaiz = operacao.raiz();
            System.out.println("Resultado da Raiz: " + resultadoRaiz);
            }
        }
        
    
        }
        scanner.close();
    }
}