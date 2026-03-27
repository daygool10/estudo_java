package exercicio2;

public class LP1 extends Disciplina implements Pratica {
    private String laboratorio;

    public LP1(int codigo, String laboratorio){
        this.laboratorio = laboratorio;
        this.setCodigo(codigo);
    }

    public void setLaboratorio(String laboratorio){
        this.laboratorio = laboratorio;
    }

    @Override
    public float calcularMedia(){
        return 0;
    }

    @Override
    public String obterLab(){
        return this.laboratorio = laboratorio;
    }
}
