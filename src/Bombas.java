public class Bombas {
    public int w, z, nminas;
    public int minas[][] = new int[10][10];

    public Bombas()
    {
        this.nminas=1;
        this.w=0;
        this.z=0;

        for(int i=0; i<minas.length; i++)
        {
            for(int j=0; j<minas[i].length; j++)
            {
                minas[i][j]=7;
            }
        }
       
    }

    //Me devuelve la poscicion donde van a estar mis minas y llenar la matriz con ellas
    public void randomNumbers()
    {
       
        do
        {
            w = (int)(Math.random()*10);
            z = (int)(Math.random()*10);
            if ((z!=0 && w!=0) && ((z!=1 && w!=1) || (z!=10 && w!=10)))
            {
                minas[w][z]=1;
                nminas++;
            }
        }while(nminas <=8);
    }

    public void printbombas()
    {
        for(int i=0; i<minas.length; i++)        
        {   
            for(int j=0; j<minas[i].length; j++)
            {   
                System.out.print(minas[i][j] + " ");
            
            }
            System.out.println("");
        }
    }
}
