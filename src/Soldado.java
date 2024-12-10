public abstract class Soldado {
    protected String nombre;
    protected int nivelVida;
    protected int nivelAtaque;
    protected int nivelDefensa;
    protected int fila;
    protected int columna;

    public Soldado(String nombre, int nivelVida, int nivelAtaque, int nivelDefensa) {
        this.nombre = nombre;
        this.nivelVida = nivelVida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public abstract void realizarAccionEspecial();

    public String getNombre() {
        return nombre;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int calcularPoder() {
        return nivelVida + nivelAtaque + nivelDefensa;
    }
}
