package clases;
import java.util.*;
/**
 *
 * @author Galle
 */
public class Pedido {
    Usuario usuario;
    String ubicacion;
    int cant;
    ArrayList<String> bebidas;

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCant() {
        return cant;
    }
    public void setCant(int cant) {
        this.cant = cant;
    }

    public ArrayList<String> getBebidas() {
        return bebidas;
    }
    public void setBebidas(ArrayList<String> bebidas) {
        this.bebidas = bebidas;
    }
    
    
}
