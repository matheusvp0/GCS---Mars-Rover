package mars.rover;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 17180288
 */
public class MarsRover {
    
    //classe principal para a executação do programa

    /**
     *
     * @param args
     * @throws FileNotFoundException
     */
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
        
        String posicaoEcomandos = in.nextLine();
        ArrayList<String> linhasArquivo =  lerArquivo(posicaoEcomandos);
        
        while(linhasArquivo!=null){
            System.out.print(linhasArquivo);
        }
        Rover rover = new Rover();
        rover.posicaoInicial();
        rover.lerArquivo(posicaoEcomandos);
    }
    
    public static ArrayList<String> lerArquivo(String posicaoEcomandos)throws FileNotFoundException{
        
        File origem = new File (posicaoEcomandos); 
        Scanner arquivo = new Scanner (origem);
        ArrayList<String> linhasArquivo = new ArrayList<>();
        int total = 0;
        while(arquivo.hasNextLine()){
            String line = arquivo.nextLine();
            linhasArquivo.add(line);
            //System.out.println(linha);     
        }
        
        
        arquivo.close();
        return linhasArquivo;
     }
    
}
