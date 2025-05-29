public class Animal {

    String nome;
    String especie;
    int id;
    String bioma;
    int idade;
    int fome;
    static int totalAnimais = 0;
    static int totalAlimentacoes = 0;



    public Animal(String nome, String  especie, int id,String bioma, int idade, int fome ){
        this.nome = nome;
        this.id = id;
        this.bioma = bioma;
        this.especie = especie;
        this.idade = idade;
        this.fome = fome;
        totalAnimais++;
    }

    public void Alimentar(){
        totalAlimentacoes++;
        System.out.println(nome + " foi alimentado.");
    }

    public static int getTotalAnimais(){
        return totalAnimais;
    }

    public static int getTotalAlimentacoes(){
        return totalAlimentacoes;
    }

    public void alimentacao(int quantidadeComida){  // metodo para alimentacao dos animas
        if (fome == 0) {
        System.out.println(nome + " já está satisfeito e não precisa comer.");
    }else{
         System.out.println("\nAlimentando " + nome + " com " + quantidadeComida + " unidades de comida.");
        fome -= quantidadeComida;

          if (fome < 0) {
            fome = 0;
            //if para simular a alimentacao
        }
    }
        System.out.println(nome + " agora tem fome: " + fome);
        if (fome == 0){// if para se a fome do animal for 0 ele nao sera alimentado
            System.out.println(nome + "animal agora esta satisfeito!");
        }
   
    }


    @Override
   public String toString(){
     String estadoFome = (fome == 0) ? "Satisfeito" : "Fome: " + fome;
   return nome + " - " + especie + " (ID: " + id + "), idade: " + idade + ", bioma: " + bioma + ",  " + estadoFome;
   }

}
