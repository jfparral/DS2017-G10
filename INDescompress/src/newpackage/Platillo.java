package newpackage;

import java.util.LinkedList;

/**
 *
 * @author hp
 */
class Platillo {
    private String nombre;
    private String descripcion;
    private String categoria;
    private String teperatura;
    private String tipo;
    private Restaurante restaurante;

    public Platillo(String nombre, String descripcion, String categoria, String teperatura, String tipo, Restaurante restaurante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.teperatura = teperatura;
        this.tipo = tipo;
        this.restaurante=restaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTeperatura() {
        return teperatura;
    }

    public void setTeperatura(String teperatura) {
        this.teperatura = teperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public LinkedList<String> listarCategoria(LinkedList<Platillo> lista)
    {
        LinkedList<String> list_catg=new LinkedList<String>();
        for(int i=0;i<lista.size();i++)
        {
            if(!list_catg.contains(lista.get(i).getCategoria()))
            {
                list_catg.add(lista.get(i).getCategoria());
            }
        }
        return list_catg;
    }
    public LinkedList<Platillo> listarPlatillo(String categoria,LinkedList<Platillo> lista)
    {
        LinkedList<Platillo> list_plat=new LinkedList<Platillo>();
        for(int i=0;i<lista.size();i++)
        {
            if(categoria.equals(lista.get(i).getCategoria()))
            {
                list_plat.add(lista.get(i));
            }
        }
        return list_plat;
    }
    
    public LinkedList<Object> DatosPlatillo(Platillo platillo)
    {
        LinkedList<Object> lista=new LinkedList<Object>();
        lista.add(platillo.getNombre());
        lista.add(platillo.getDescripcion());
        lista.add(platillo.getTipo());
        lista.add(platillo.getRestaurante());
        lista.add(platillo.getCategoria());
        return lista;
    }        
}

