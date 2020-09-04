import java.util.Scanner;

public class Buscaminas {

    public Boolean comp;
    static public int sminas[][] = new int[10][10];
    static Persona persona = new Persona();
    static Tablero tablero = new Tablero();
    static Bombas bombas = new Bombas();

    public Buscaminas()
    {
        this.comp=false;
    }

    //Metodo para borrar pantalla
    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    //Me configura los valores donde estoy posicionado
    public void setCoord(int x, int y)
    {
        persona.setCoordenadas(x,y);
    }

    //Me muestra en donde estoy poscicionado
    public void printChar()
    {
        persona.getCoordenadas();
    }

    //Coomparar las bombas
    public Boolean inbombs(int x, int y)
    {  
        if(bombas.minas[x][y]==sminas[x][y])
        {
            return true;
        }
        else
        {
            tablero.tablero[x][y] = 2;
            tablero.ImprimirTablero();
            return false;
        }
    }
    public static void main(String[] args) {
        Buscaminas buscaminas = new Buscaminas();

        bombas.randomNumbers();
 
        int coordx1=1;
        int coordy1=1;
        Scanner coordxy = new Scanner(System.in);

        Boolean compro = false;
        while(compro!=true)
        {  
            persona.setCoordenadas(coordx1, coordy1);
            persona.getCoordenadas();
            tablero.ImprimirTablero();
            System.out.println("Escriba las coordenadas x y: ");
        
            coordx1 = coordxy.nextInt();
            coordy1= coordxy.nextInt();

            sminas[coordx1][coordy1]=1;
            compro=buscaminas.inbombs(coordx1, coordy1);

            buscaminas.clearScreen();
        }
        coordxy.close();
            
        if(compro == true)
        {
            System.out.println("Usted ha pisado una mina. Ah perdido el juego");
        }
        
    }
}
