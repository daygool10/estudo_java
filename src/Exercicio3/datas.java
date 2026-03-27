import Exercicio3.Data;
void main() {
    Data data1 = new Data(31, 5, 2005);
    Data data2 = new Data(13, 6, 2007);
    Data data3 = new Data(31, 02, 2020);

    System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
    System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
    System.out.println("Data 3: " + data3.getDia() + "/" + data3.getMes() + "/" + data3.getAno());

}