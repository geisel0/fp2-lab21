import java.util.Random;

public class Tablero {
    private int filas;
    private int columnas;
    private Soldado[][] grid;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.grid = new Soldado[filas][columnas];
    }

    public boolean posicionarSoldado(Soldado soldado) {
        Random random = new Random();
        boolean colocado = false;
        while (!colocado) {
            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);
            if (grid[fila][columna] == null) {
                grid[fila][columna] = soldado;
                soldado.setPosicion(fila, columna);
                colocado = true;
            }
        }
        return colocado;
    }

    public void mostrarTablero() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (grid[i][j] == null) {
                    System.out.print("[  ] ");
                } else {
                    System.out.print("[" + grid[i][j].getNombre().charAt(0) + "] ");
                }
            }
            System.out.println();
        }
    }
}

