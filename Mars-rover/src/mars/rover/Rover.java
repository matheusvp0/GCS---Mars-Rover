package mars.rover;

/**
 *
 * @author chris
 */
public class Rover {
    
    //posição 0 para local do rover em X, posição 1 em Y e posição 2 para direção
    public int posicaoX;
    public int posicaoY;
    public char direcao;
    public String percurso;
    
    
    
    public Rover(String dadosIniciaisRover, String percurso) {
        this.posicaoX = Character.getNumericValue(dadosIniciaisRover.charAt(0));
        this.posicaoY = Character.getNumericValue(dadosIniciaisRover.charAt(2));
        this.direcao = dadosIniciaisRover.charAt(4);
    }
    
    public void CalculaPosicaoFinal(Rover rover, String limite) {
        int limiteX = Character.getNumericValue(limite.charAt(0));
        int limiteY = Character.getNumericValue(limite.charAt(2));
        
        for(int i=0; i < rover.getPercurso().length(); i++) {
            char comandoAtual = rover.getPercurso().charAt(i);
            
            switch (comandoAtual) {
                case 'M':
                    if(rover.getDirecao() == 'N') {
                        if(limiteY == rover.getPosicaoY()) {
                            rover.setPosicaoY(0);
                        } else {
                            rover.setPosicaoY(rover.getPosicaoY()+1);
                        }
                    }
                    else if(rover.getDirecao() == 'S') {
                        if(rover.getPosicaoY() == 0) {
                            rover.setPosicaoY(limiteY);
                        } else {
                            rover.setPosicaoY(rover.getPosicaoY()-1);
                        }
                    }
                    else if(rover.getDirecao() == 'L') {
                        if(rover.getPosicaoX() == limiteX) {
                            rover.setPosicaoX(0);
                        } else {
                            rover.setPosicaoX(rover.getPosicaoX()+1);
                        }
                    }
                    else if(rover.getDirecao() == 'O') {
                        if(rover.getPosicaoX() == 0) {
                            rover.setPosicaoX(limiteX);
                        } else {
                            rover.setPosicaoX(rover.getPosicaoX()-1);
                        }
                    }
                    break;
                case 'L':
                    if(rover.getDirecao() == 'N') {
                        rover.setDirecao('O');
                    }
                    else if(rover.getDirecao() == 'O') {
                        rover.setDirecao('S');
                    }
                    else if(rover.getDirecao() == 'S') {
                        rover.setDirecao('L');
                    }
                    else if(rover.getDirecao() == 'L') {
                        rover.setDirecao('N');
                    }
                    break;
                case 'R':
                    if(rover.getDirecao() == 'N') {
                        rover.setDirecao('L');
                    }
                    else if(rover.getDirecao() == 'L') {
                        rover.setDirecao('S');
                    }
                    else if(rover.getDirecao() == 'S') {
                        rover.setDirecao('O');
                    }
                    else if(rover.getDirecao() == 'O') {
                        rover.setDirecao('N');
                    }
                    break;
                default:
                    System.out.println("Há um caractere inválido no percurso do MarsRover");
                    break;
            }
        }
    }

    public String getPercurso() {
        return percurso;
    }

    public void setPercurso(String percurso) {
        this.percurso = percurso;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
    
    
    
}