public class Principal {
    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento();
        estacionamento.setNumeroVagasVeiculos(1000);

        estacionamento.entraVeiculo("XXX-1234");
        estacionamento.entraVeiculo("YYY-4321");
        estacionamento.mostrarCarrosEstacionados();
        estacionamento.saiVeiculo("YYY-4321");
        estacionamento.mostrarCarrosEstacionados();
    };
}
