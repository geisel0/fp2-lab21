public class Mapa {
    private Tablero tablero;
    private String tipoTerritorio;

    public Mapa(int filas, int columnas, String tipoTerritorio) {
        this.tablero = new Tablero(filas, columnas);
        this.tipoTerritorio = tipoTerritorio;
    }

    public void aplicarBonus(Ejercito ejercito) {
        for (Soldado soldado : ejercito.getSoldados()) {
            soldado.setNivelVida(soldado.getNivelVida() + 1);
        }
    }

    public Tablero getTablero() {
        return tablero;
    }

    public String getTipoTerritorio() {
        return tipoTerritorio;
    }
    
}
