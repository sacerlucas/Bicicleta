package entity;

public class BicicletaMotorizada extends Bicicleta implements BicicletaCombustao{
    private double capacidadeDeCombustivel;
    private Integer cilindradas;
    private static final int CapacidadeMaxCombustivel = 100;

    public BicicletaMotorizada(double tamanhoDoAro, double tamanhoDoQuadro, String cor, String materialQuadro, String modelo, double capacidadeDeCombustivel, Integer cilindradas) {
        super(tamanhoDoAro, tamanhoDoQuadro, cor,materialQuadro,modelo);

        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
        this.cilindradas = cilindradas;
    }

    public double getCapacidadeDeCombustivel() {
        return capacidadeDeCombustivel;
    }

    public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
        this.capacidadeDeCombustivel = capacidadeDeCombustivel;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void qtdCombustivel(){
        if (capacidadeDeCombustivel <= CapacidadeMaxCombustivel){
            System.out.println("A quantidade de combustivel do veiculo está dentro do permitido.");
        }
        else{
            System.out.println("A quantidade de combustivel do veiculo não está dentro do permitdo");
        }
    }
    public void abastecer(){
        if (capacidadeDeCombustivel == 0 || capacidadeDeCombustivel < CapacidadeMaxCombustivel){
            System.out.println("Sem combustivel, veiculo está Abastecendo");
        }
        else{
            System.out.println("Tem combustivel, está pronto para andar");
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
        return "\nBicicletaMotorizada:" +
                "\ntamanhoDoQuadro: "+ super.getTamanhoDoQuadro() +
                "\nCor: "+ super.getCor()+
                "\nModelo: "+ super.getModelo()+
                "\nTamanhoDoAro: " + super.getTamanhoDoAro() +
                "\ncapacidadeDeCombustivel: " + capacidadeDeCombustivel +
                "\ncilindradas: " + cilindradas;
    }
}
