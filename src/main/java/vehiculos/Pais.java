package vehiculos;

import java.util.ArrayList;

public class Pais{
    private static ArrayList<Pais> listaPais= new ArrayList<Pais>();
    private String nombre;
    public int cantiadPorPais;
    public Pais(String nombre){
        this.nombre=nombre;
        agregarPais(this);
    }
    public static void agregarPais(Pais pais){
        listaPais.add(pais);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantiadPorPais() {
        return cantiadPorPais;
    }
    public void setCantiadPorPais(int cantiadPorPais) {
        this.cantiadPorPais = cantiadPorPais;
    }
    public static Pais paisMasVendedor(){
        int mayor=0;
        Pais masFabricante=null;
        for(int i=0;i<listaPais.size();i++){;
            int j= listaPais.get(i).getCantiadPorPais();
            if(j>mayor){
            mayor=j;
            masFabricante=listaPais.get(i);
        }
        }
        return masFabricante;
    }
}