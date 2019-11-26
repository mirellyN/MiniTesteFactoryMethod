package ufpb.br;

public class Teste {
  
    public static void main(String args[]) {
        FactoryFruta factory = new FactoryFruta();
        String nome = "laranja";
        Fruta fruta = factory.getFruta(nome, Tipo.FRUTAS_CITRICAS);
        System.out.println(fruta);
    }
}

