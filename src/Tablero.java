public class Tablero{

    public int tablero[][] = new int[10][10];//creo mi matriz 
    

    public Tablero()//El constructor me llena mi matriz
    {       
        int x = 1, y=2;

        for(int i=0; i<tablero.length; i++)
        {
            for(int j=0; j<tablero[i].length; j++)
            {
                if (i == 0)
                {
                    this.tablero[i][j] = x;
                    x = x+1;
                }
                else if (j == 0)
                {
                    this.tablero[i][j] = y;
                    y = y+1;
                }
                else
                {
                    this.tablero[i][j] = 0;
                } 
            }
        }
    }

    public void ImprimirTablero(){
        
        for(int i=0; i<tablero.length; i++)        
        {   
            for(int j=0; j<tablero[i].length; j++)
            {   
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}