package mars.rover;

/**
 *
 * @author Matheus
 */
public class MarsRover {
    
    //classe principal para a executação do programa
    
    public static void main(String[] args) {
    	
    	Rover r1 = new Rover("1 2 N", "LMLMLMLMM");
    	Rover r2 = new Rover("3 3 L", "MMRMMRMRRM");
    	r1.CalculaPosicaoFinal(r1, "5 5");
    	r2.CalculaPosicaoFinal(r2, "5 5");
    	
    	System.out.println("X: " + r1.getPosicaoX() + " Y:" + r1.getPosicaoY() + " FACE: " + r1.getDirecao());
    	System.out.println("X: " + r2.getPosicaoX() + " Y:" + r2.getPosicaoY() + " FACE: " + r2.getDirecao());
    }
    
}
