public class Principal {
    public static void main(String[] args) {

        Estacionamento estacionamentoUniesp = new Estacionamento(10, 3);
        estacionamentoUniesp.entraVeiculo(new Carro("ABC-1234"));
        estacionamentoUniesp.entraVeiculo(new Carro("CDF-1432"));
        estacionamentoUniesp.entraVeiculo(new Carro("CDE-456"));
        estacionamentoUniesp.entraVeiculo(new Carro("FGH-456"));
        estacionamentoUniesp.entraVeiculo(new Moto("BCD-856"));
        estacionamentoUniesp.entraVeiculo(new Moto("DDD-856"));
        estacionamentoUniesp.saiVeiculo("BCD-856");
        estacionamentoUniesp.obterNumeroVagasTotalVeiculos();
        estacionamentoUniesp.mostrarVeiculosEstacionados();

    };
}
