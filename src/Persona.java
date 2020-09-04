public class Persona {
    public int a,b;

    public Persona()
    {
        //Las personas empiezan en la poscicion [1][1]
        this.a = 0;
        this.b = 0;
    }
    
    //Mis metodos me tienen que editar esas coordenadas
    public void setCoordenadas(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void getCoordenadas()
    {
        System.out.println("Usted esta en: [" +a +"]["+b+"]");
    }

}
