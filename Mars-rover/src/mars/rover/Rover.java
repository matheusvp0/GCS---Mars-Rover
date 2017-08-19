package mars.rover;

/**
 *
 * @author chris
 */
public class Rover {
    
    //posição 0 para local do rover em X, posição 1 em Y e posição 2 para direção
    public String[] posicaoInicial;
    public String percurso;
    
    
    public Rover(String dadosIniciaisRover, String percurso) {
        
        this.posicaoInicial = dadosIniciaisRover.split("\\s+");
        this.percurso = percurso;
    }
}
