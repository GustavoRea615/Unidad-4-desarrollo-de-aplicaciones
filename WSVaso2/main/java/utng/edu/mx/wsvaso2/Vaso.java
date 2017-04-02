package utng.edu.mx.wsvaso2;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;
//import java.lang;

/**
 * Created by MAnuel on 31/03/2017.
 */

public class Vaso implements KvmSerializable{
    private int id;
    private String nombre;
    private String color;
    private String tamanio;
    private String activo;

    public Vaso(int id, String nombre, String color, String tamanio, String activo) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.tamanio = tamanio;
        this.activo = activo;
    }

    public Vaso() {
        this(0,"","","","");
    }

    @Override
    public Object getProperty(int i) {
        switch (i) {
            case 0:
                return id;
            case 1:
                return nombre;
            case 2:
                return color;
            case 3:
                return tamanio;
            case 4:
                return activo;
        }

        return  null;
    }

    @Override
    public int getPropertyCount() {
        return 5;
    }

    @Override
    public void setProperty(int i, Object o) {
        switch (i){
            case 0:
                id =Integer.parseInt(o.toString());
                break;
            case 1:
                nombre = o.toString();
                break;
            case 2:
                color = o.toString();
                break;
            case 3:
                tamanio = o.toString();
                break;
            case 4:
                activo = o.toString();
                break;
            default:
                break;
        }
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {
        switch (i) {
            case 0:
                propertyInfo.type = PropertyInfo.INTEGER_CLASS;
                propertyInfo.name = "id";
                break;
            case 1:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "nombre";
                break;
            case 2:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "color";
                break;
            case 3:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "tamanio";
                break;
            case 4:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "activo";
                break;
            default:
                break;
        }


    }
}
