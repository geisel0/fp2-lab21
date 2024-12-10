import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        Ejercito ejercito1 = new Ejercito("Inglaterra");
        Ejercito ejercito2 = new Ejercito("Francia");

        for (int i = 0; i < 10; i++) {
            int tipo = random.nextInt(4);
            switch (tipo) {
                case 0 -> ejercito1.agregarSoldado(new Espadachin("Espadachin" + i, random.nextInt(3) + 8, 5));
                case 1 -> ejercito1.agregarSoldado(new Arquero("Arquero" + i, random.nextInt(3) + 3, 10));
                case 2 -> ejercito1.agregarSoldado(new Caballero("Caballero" + i, random.nextInt(3) + 10));
                case 3 -> ejercito1.agregarSoldado(new Lancero("Lancero" + i, random.nextInt(4) + 5, 6));
            }
        }

        for (int i = 0; i < 3; i++) {
            int tipo = random.nextInt(4);
            switch (tipo) {
                case 0 -> ejercito2.agregarSoldado(new Espadachin("Espadachin" + i, random.nextInt(3) + 8, 5));
                case 1 -> ejercito2.agregarSoldado(new Arquero("Arquero" + i, random.nextInt(3) + 3, 10));
                case 2 -> ejercito2.agregarSoldado(new Caballero("Caballero" + i, random.nextInt(3) + 10));
                case 3 -> ejercito2.agregarSoldado(new Lancero("Lancero" + i, random.nextInt(4) + 5, 6));
            }
        }

        int poderEjercito1 = ejercito1.calcularPoderTotal();
        int poderEjercito2 = ejercito2.calcularPoderTotal();

        double totalPoder = poderEjercito1 + poderEjercito2;
        double probabilidad1 = (poderEjercito1 / totalPoder) * 100;
        double probabilidad2 = (poderEjercito2 / totalPoder) * 100;

        double experimentoAleatorio = random.nextDouble() * 100;

        String ganador = experimentoAleatorio <= probabilidad1 ? "Ejercito 1 de: " + ejercito1.getReino() : "Ejercito 2 de: " + ejercito2.getReino();

        System.out.println("Ejercito 1: " + ejercito1.getReino());
        System.out.println("Cantidad total de soldados creados: " + ejercito1.getSoldados().size());
        System.out.println("Espadachines: " + ejercito1.contarSoldadosPorTipo(Espadachin.class));
        System.out.println("Arqueros: " + ejercito1.contarSoldadosPorTipo(Arquero.class));
        System.out.println("Caballeros: " + ejercito1.contarSoldadosPorTipo(Caballero.class));
        System.out.println("Lanceros: " + ejercito1.contarSoldadosPorTipo(Lancero.class));

        System.out.println("Ejercito 2: " + ejercito2.getReino());
        System.out.println("Cantidad total de soldados creados: " + ejercito2.getSoldados().size());
        System.out.println("Espadachines: " + ejercito2.contarSoldadosPorTipo(Espadachin.class));
        System.out.println("Arqueros: " + ejercito2.contarSoldadosPorTipo(Arquero.class));
        System.out.println("Caballeros: " + ejercito2.contarSoldadosPorTipo(Caballero.class));
        System.out.println("Lanceros: " + ejercito2.contarSoldadosPorTipo(Lancero.class));

        System.out.println("Ejercito 1: " + ejercito1.getReino() + ": " + poderEjercito1);
        System.out.println("Ejercito 2: " + ejercito2.getReino() + ": " + poderEjercito2);
        System.out.printf("%.2f%% de probabilidad de victoria\n", probabilidad1);
        System.out.printf("%.2f%% de probabilidad de victoria\n", probabilidad2);
        System.out.println("El ganador es el " + ganador + ". Ya que al generar los porcentajes de probabilidad de victoria basada en los niveles de vida de sus soldados y aplicando un experimento aleatorio salio vencedor. (Aleatorio generado: " + String.format("%.2f", experimentoAleatorio) + ")");
    }
}
