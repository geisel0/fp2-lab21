import java.util.ArrayList;
import java.util.List;

public class Ejercito {
    private String reino;
    private List<Soldado> soldados;

    public Ejercito(String reino) {
        this.reino = reino;
        this.soldados = new ArrayList<>();
    }

    public void agregarSoldado(Soldado soldado) {
        soldados.add(soldado);
    }

    public List<Soldado> getSoldados() {
        return soldados;
    }

    public String getReino() {
        return reino;
    }

    public int calcularPoderTotal() {
        return soldados.stream().mapToInt(Soldado::calcularPoder).sum();
    }

    public double calcularPromedioVida() {
        return soldados.stream().mapToInt(Soldado::getNivelVida).average().orElse(0);
    }

    public int contarSoldadosPorTipo(Class<?> tipo) {
        return (int) soldados.stream().filter(tipo::isInstance).count();
    }
}
