public class App {
    public static void main(String[] args) {
        Ejercito ejercito1 = new Ejercito("Inglaterra");
        Ejercito ejercito2 = new Ejercito("Francia");

        for (int i = 0; i < 5; i++) {
            ejercito1.agregarSoldado(new Espadachin("Espadachin" + i, 9, 5));
            ejercito2.agregarSoldado(new Arquero("Arquero" + i, 4, 10));
        }

        Mapa mapa = new Mapa(10, 10, "bosque");
        mapa.aplicarBonus(ejercito1);

        Tablero tablero = mapa.getTablero();
        ejercito1.getSoldados().forEach(tablero::posicionarSoldado);
        ejercito2.getSoldados().forEach(tablero::posicionarSoldado);

        tablero.mostrarTablero();

        System.out.println("Poder total de Inglaterra: " + ejercito1.calcularPoderTotal());
        System.out.println("Poder total de Francia: " + ejercito2.calcularPoderTotal());
    }
}
