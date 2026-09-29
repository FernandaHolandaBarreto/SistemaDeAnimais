public class Animal {

    public String Raca;
    public String cor;
    public double PesoAtual;

    public Animal(String raca, String cor, double pesoAtual) {
        Raca = raca;
        this.cor = cor;
        PesoAtual = pesoAtual;
    }

    public void aumentarpeso(){
        PesoAtual = PesoAtual + (PesoAtual * 3 );

    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return PesoAtual;
    }

    public void setPeso(double peso) {
        PesoAtual = peso;
    }
}
