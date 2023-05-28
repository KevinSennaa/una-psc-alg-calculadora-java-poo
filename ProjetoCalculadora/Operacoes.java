public class Operacoes {
    private double numeroUm;
    private double numeroDois;
    
  
    public void setNumeroUm(double novoValorNumeroUm){
      numeroUm = novoValorNumeroUm;
    }
  
    public double getNumeroUm(){
      return numeroUm;
    }
  
    public void setNumeroDois(double novoValorNumeroDois){
      numeroDois = novoValorNumeroDois;
    }
  
    public double getNumeroDois(){
      return numeroDois;
    }
    public double somar(){
      return numeroUm + numeroDois;
    }
    public double subtrair(){
      return numeroUm - numeroDois;
    }
    public double dividir(){
      return numeroUm / numeroDois;
    }
    public double potencia(){
      return Math.pow(numeroUm, numeroDois);
    }
    public double raiz(){
      return Math.sqrt(numeroUm);
    }
    public double multiplicar(){
      return numeroUm * numeroDois;
    }
  }