public class Quadrado extends Poligono {
    private double tamanhoLado;

    public Quadrado(int numeroLados, double tamanhoLado){
        super(numeroLados);
        this.tamanhoLado = tamanhoLado;
    }

    @Override
    public double calcularArea(){
        return tamanhoLado * tamanhoLado;
    }


}
