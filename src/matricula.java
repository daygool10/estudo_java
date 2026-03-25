class Aluno {
   private int matricula;
   private String nome;
   private double prova1;
   private double prova2;
   private double trabalho;

    Aluno(int matricula, String nome, double prova1, double prova2, double trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.trabalho = trabalho;
    }

    // calcular media
    public double media(){
        double pesoProva = 2.5;
        double pesoTrab = 2;

        double somaPesos = pesoProva + pesoProva + pesoTrab;

        double mediaFinal = (prova1 * pesoProva + prova2 * pesoProva+ trabalho * pesoTrab) / somaPesos;

        return mediaFinal;

    }

    // calcular quanto precisa na final
    public double FinalProva(){
        double mediaAtual = media();

        if(mediaAtual >= 6) {
            return 0;
        }

        double notaNecessaria = (5 * 2) - mediaAtual;

        return notaNecessaria;

    }

    public void Exibir(){
        System.out.println("matricula: " + matricula);
        System.out.println("nome: " + nome);
        System.out.println("media: " + media());
        System.out.println("nota necessaria: " + FinalProva());
    }

}

void main() {
    Aluno aluno =  new Aluno(001, "Ayrton",5,4, 3);

    aluno.Exibir();



}
