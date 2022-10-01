package vehiculos;

import java.util.ArrayList;

public class Fabricante{
    protected static ArrayList<Fabricante> listafabricantes= new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;
    protected int cantPorfabricante;
    public Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        listafabricantes.add(this);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public int getCantPorfabricante() {
        return cantPorfabricante;
    }
    public void setCantPorfabricante(int cantPorfabricante) {
        this.cantPorfabricante = cantPorfabricante;
    }
    public static Fabricante fabricaMayorVentas(){
        int mayor;
        Fabricante masFabricante;
        for(int i=0;i<listafabricantes.size();i++);
         int j= listafabricantes.get(i).getCantPorfabricante;
        if(j>mayor){
            mayor=j;
            masFabricante=listafabricantes.get(i);
        }
        return masFabricante;
    }
}