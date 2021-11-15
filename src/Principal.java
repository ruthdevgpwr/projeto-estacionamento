public class Principal {
    public static void main(String[] args) {

        Estacionamento estacionamento = new Estacionamento;
        estacionamento.setNumeroVagasCarros(1000);
        estacionamento.setNumeroVagasMotos(200);
        estacionamento.setNumeroVagasOnibus(10);
        estacionamento.setNumeroVagasBicicletas(50);

        estacionamento.entraCarro();
        estacionamento.saiCarro();
        estacionamento.entraMoto();
        estacionamento.saiMoto();
        estacionamento.entraOnibus();
        estacionamento.saiOnibus();

        estacionamento.getVagasCarros()
    }
}
