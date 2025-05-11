public class Moto extends Veiculo {
    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto: " + modelo + " - 2 rodas");
    }
}
