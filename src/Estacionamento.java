import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private Integer numeroVagasMotos;
    private Integer numeroVagasCarros;
    private List<Carro> carros = new ArrayList<>();
    private List<Moto> motos = new ArrayList<>();

    public Estacionamento(Integer numeroVagasMotos, Integer numeroVagasCarros) {
        this.numeroVagasMotos = numeroVagasMotos;
        this.numeroVagasCarros = numeroVagasCarros;
    }

    public void obterNumeroVagasTotalVeiculos() {
        System.out.printf("Este estacionamento possui %d vagas de motos e %d vagas de carros\n\n", numeroVagasMotos, numeroVagasCarros);
    }

    public void entraVeiculo(Veiculo veiculo) {
        if (veiculo instanceof Carro) {
            if (carros.size() < numeroVagasCarros) {
                carros.add((Carro) veiculo);
                System.out.printf("O carro com placa %s entrou no estacionamento.\n", veiculo.getPlaca());
            } else {
                System.out.println("Não há mais vagas para carros!");
            }
        }
        if (veiculo instanceof Moto) {
            if (motos.size() < numeroVagasMotos) {
                motos.add((Moto) veiculo);
                System.out.printf("A moto com placa %s entrou no estacionamento.\n", veiculo.getPlaca());
            } else {
                System.out.println("Não há mais vagas para motos");
            }
        }
    }

    public boolean saiVeiculo(String placa) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getPlaca().equals(placa)) {
                System.out.printf("O carro com placa %s saiu do estacionamento.\n", placa);
                carros.remove(i);
                return true;
            }
        }
        for (int i = 0; i < motos.size(); i++) {
            if (motos.get(i).getPlaca().equals(placa)) {
                System.out.printf("A moto com placa %s saiu do estacionamento.\n", placa);
                motos.remove(i);
                return true;
            }
        };
        System.out.printf("Não há veículo estacionado com a placa: %s.\n", placa);
        return false;
    }

    public void mostrarVeiculosEstacionados() {
        System.out.println("Carros estacionados:\n ");
        for (Carro carro : carros) {
            System.out.printf("Placa: %s\n", carro.getPlaca());
        };
        if (carros.size() == 0) System.out.println("Não há carrro estacionado!");

        System.out.println("\nMotos estacionadas:\n ");
        for (Moto moto : motos) {
            System.out.printf("Placa: %s\n", moto.getPlaca());
        };
        if (motos.size() == 0) System.out.println("Não há moto estacionada!");
    }
}
