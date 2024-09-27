package entity;

public abstract class Bicicleta {
    private double TamanhoDoAro;
    private double TamanhoDoQuadro;
    private String cor;
    private String materialQuadro;
    private String modelo;

    public Bicicleta(double tamanhoDoAro, double tamanhoDoQuadro, String cor, String materialQuadro, String modelo) {
        TamanhoDoAro = tamanhoDoAro;
        TamanhoDoQuadro = tamanhoDoQuadro;
        this.cor = cor;
        this.materialQuadro = materialQuadro;
        this.modelo = modelo;
    }

    public double getTamanhoDoAro() {
        return TamanhoDoAro;
    }

    public void setTamanhoDoAro(double tamanhoDoAro) {
        TamanhoDoAro = tamanhoDoAro;
    }

    public double getTamanhoDoQuadro() {
        return TamanhoDoQuadro;
    }

    public void setTamanhoDoQuadro(double tamanhoDoQuadro) {
        TamanhoDoQuadro = tamanhoDoQuadro;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterialQuadro() {
        return materialQuadro;
    }

    public void setMaterialQuadro(String materialQuadro) {
        this.materialQuadro = materialQuadro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void acelerar();
    public abstract void frear();

    @Override
    public String toString() {
        return "Bicicleta{" +
                "TamanhoDoAro=" + TamanhoDoAro +
                ", TamanhoDoQuadro=" + TamanhoDoQuadro +
                ", cor='" + cor + '\'' +
                '}';
    }
}
