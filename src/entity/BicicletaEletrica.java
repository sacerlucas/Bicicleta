package entity;

public class BicicletaEletrica extends Bicicleta implements BicicletaEnergia{

    private static final double capacidadeCarga = 100.0;
    private double TempoDeCarga;

    public BicicletaEletrica(double tamanhoDoAro, double tamanhoDoQuadro, String cor, String materialQuadro, String modelo, double tempoDeCarga, double cargaAtual) {
        super(tamanhoDoAro, tamanhoDoQuadro, cor, materialQuadro, modelo);
        TempoDeCarga = tempoDeCarga;
    }


    public double getTempoDeCarga() {
        return TempoDeCarga;
    }

    public void setTempoDeCarga(double tempoDeCarga) {
        TempoDeCarga = tempoDeCarga;
    }



    public double cargaBateria(double carga) {
        if (carga <= capacidadeCarga) {
            System.out.println("Carga adicionada: " + carga);
        } else {
            System.out.println("Carga não está de acordo! A Carga maxima é" + capacidadeCarga);
        }
        return carga;
    }


    @Override
    public double cargaBateria() {
        return 0;
    }

    public double tempoRecarga(double amperagem){
        if(amperagem >0){
            return capacidadeCarga/amperagem;
        }
        else {
            System.out.println("Amperagem invalida! Não é possivel calcular o tempo de recarga");
            return 0;
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }

    @Override
    public String toString() {
        return "\nBicicletaEletrica: " +
                "\ntamanhoDoQuadro: "+ super.getTamanhoDoQuadro() +
                "\nCor: "+ super.getCor()+
                "\nModelo: "+ super.getModelo()+
               "\nTamanhoDoAro: " + super.getTamanhoDoAro() +
                "\nCapacidadeCarga: " + capacidadeCarga +
                "\nCargaAtual: " + cargaBateria() +
                "\nTempoDeCarga:" + TempoDeCarga;
    }
}
