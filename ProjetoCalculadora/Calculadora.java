import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();


        System.out.println("Calculadora");

        while(true){
        System.out.println("Qual operação deseja fazer? (+)Soma , (-)Subtração , (/)(Divisão) , (^)(Potencia) , (R)(Raiz)");
        String simbolo = scanner.next().toUpperCase();
        if(simbolo.equals("Q")){
            break;
        }
        
        System.out.println("Informe o primeiro número: ");
        operacoes.setNumeroUm(scanner.nextDouble());
       

        System.out.println("Informe o segundo número: ");
        operacoes.setNumeroDois(scanner.nextDouble());
        
        if(simbolo.equals("+")){
            
            double resultadoSomar = operacoes.somar();
            System.out.println("Resultado da soma: " + resultadoSomar);
        }

        else if(simbolo.equals("-")){
            double resultadoSubtrair = operacoes.subtrair();
            System.out.println("Resultado da subtração: " + resultadoSubtrair);
        }

        else if(simbolo.equals("^")){
            double resultadoPotencia = operacoes.potencia();
            System.out.println("Resultado da potência: " + resultadoPotencia);
        }

        else if(simbolo.equals("/")){
            if(operacoes.getNumeroUm() == 0){
                System.out.println("Impossível realizar divisao por zero");
                break;
            }else{
                double resultadoDividir = operacoes.dividir();

                System.out.println("Resultado da divisao: " + resultadoDividir);
            }
            
        }

        else if(simbolo.equals("*")){
            double resultadoMultiplicar = operacoes.multiplicar();
            System.out.println("Resultado da multiplicação: " + resultadoMultiplicar);
        }

        else if(simbolo.equals("R")){
            if(operacoes.getNumeroUm() < 0){
                System.out.println("Não existe raiz de número 0");
                break;
            }else{
            double resultadoRaiz = operacoes.raiz();
            System.out.println("Resultado da Raiz: " + resultadoRaiz);
            }
        }
        
    
        }
        scanner.close();
    }
}
