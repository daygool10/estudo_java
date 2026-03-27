public class TrainguloRetangulo extends Triangulo implements Retangulo {
    private double catetoAdj;
    private double catetoOpo;

    public TrainguloRetangulo(int numeroLados, double base, double altura){
        super(numeroLados, base, altura);
    }

    public void setCatetos(double catetoAdj, double catetoOpo) {
        this.catetoAdj = catetoAdj;
        this.catetoOpo = catetoOpo;
    }

    public double calcularHipotenusa(){
        return Math.sqrt(Math.pow(catetoOpo, 2)+ Math.pow(catetoAdj, 2));
    }
}
