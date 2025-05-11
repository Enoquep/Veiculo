public class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Veículo: " + modelo);
    }
}
