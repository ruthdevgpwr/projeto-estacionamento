import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

    private Integer numeroVagasVeiculos;
    private List<Veiculo> veiculos = new ArrayList<>();


    public Integer getNumeroVagasVeiculos() {
        return numeroVagasVeiculos;
    }

    public void setNumeroVagasVeiculos(Integer numeroVagasVeiculos) {
        this.numeroVagasVeiculos = numeroVagasVeiculos;
    }

    public void entraVeiculo(String placa) {
        veiculos.add(new Veiculo(placa));
        System.out.println("O ve�culo com placa " + placa + " entrou no estacionamento.");
    }

    public void saiVeiculo(String placa) {
        for (int i = 0; i < veiculos.size(); i++) {
            if (veiculos.get(i).getPlaca().equals(placa)) {
                System.out.println("O ve�culo com placa " + placa + " saiu no estacionamento.");
                veiculos.remove(i);
            }
        };
    }

    public void mostrarCarrosEstacionados() {
        for (Veiculo veiculo : veiculos) {
            System.out.println("Ve�culo placa: " + veiculo.getPlaca() + " est� estacionado.");
        };
    }
}
