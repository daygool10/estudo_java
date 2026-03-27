public class Triangulo extends Poligono {
    private double base;
    private double altura;

    public Triangulo(int numeroLados, double base, double altura){
        super(numeroLados);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return (base * altura) /2;
    }

}
