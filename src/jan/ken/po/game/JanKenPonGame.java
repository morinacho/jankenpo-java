/*
 * Permitir jugar jugador-maquina y jugador-jugador
 * Inteligencia juego(SERVER)
 * CLIENT maximo dos
 */
package jan.ken.po.game;

/**
 *
 * @author nacho
 */
public class JanKenPonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GameWindow gw = new GameWindow();
        gw.setResizable(false);
        gw.setLocationRelativeTo(null);
        gw.setVisible(true);
    }
}
