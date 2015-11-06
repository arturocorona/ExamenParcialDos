
package models;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Reference;
import java.util.ArrayList;
import java.util.Date;
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
public class Venta extends Model {

    @Reference
    @Required
    public Producto producto;
    
    @Required
    public Date fecha;
    
    @Required
    public Double total;

    @Required
    public Integer folio;

    public Venta(Date fecha, Double total, Integer folio) {
        this.fecha = fecha;
        this.total = total;
        this.folio = folio;
    }

    
}