import java.awt.*;
import java.util.function.Function;

public class Bots {

    public static Function<Find, Exception> algoritimoExecutavel = null;
    public static boolean paginaVisivel = true;
    public static int numeroDeExecucoes = 5;
    public static int numeroDeThreads = 2;
    public static int tempoDeEsperaDriver = 10;

    //localProject->

    public static void main(String[] args) {

        algoritimoExecutavel = find -> {
            try { find.init(paginaVisivel); } catch (AWTException e) { e.printStackTrace(); }
            /*Area de Código*/



            /*Area de Código*/
            return null;
        };
        new OrdenarThreads();
    }
}
