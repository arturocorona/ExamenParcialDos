
package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import java.util.ArrayList;
import java.util.List;

import play.data.validation.Email;
import play.data.validation.Required;
import play.modules.morphia.Blob;
import play.modules.morphia.Model;

/**
 *
 * @author arturo
 *
 */

@Entity
public class Producto extends Model {

    @Required
    public String clave;
    
    @Required
    public String descripcion;

    @Required
    public Integer cantidadMinima;

    @Required
    public Integer stock;
    
    @Required
    public Double precio;

    public Producto(String clave, String descripcion, Integer cantidadMinima, Integer stock, Double precio) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.cantidadMinima = cantidadMinima;
        this.stock = stock;
        this.precio = precio;
    }
}