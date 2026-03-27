package Exercicio3;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    //construtor
    public Data(int dia, int mes, int ano){
        if(dataValida(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1; 
            this.ano = 1; 
        }
    }

    private boolean dataValida(int dia, int mes, int ano){
        if(ano < 1 || mes < 1 || mes > 12 || dia < 1) return false;

        int[] diaMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(isBissexto(ano)){
            diaMes[1] = 29;
        }
        return dia <= diaMes[mes - 1];
    }

    //comparação
    public int compara(Data outra){
        if(this.ano == outra.ano && this.mes == outra.mes && this.dia == outra.dia){
            return 0;
        }
        if(this.ano > outra.ano || (this.ano == outra.ano && this.mes > outra.mes) || (this.ano == outra.ano && this.mes == outra.mes && this.dia > outra.dia)){
            return 1;
        }

        return -1;

    }

    // getters
    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public String getmesExtenso(){
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
        "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }

    //Bissexto
    public boolean bissexto(int ano){
        return isBissexto(this.ano);
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0  && ano % 100 != 0 || ano % 400 == 0);
    }

    //clone
    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

}
