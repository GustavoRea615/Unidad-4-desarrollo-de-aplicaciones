package utng.edu.mx.wsbeca2;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;

/**
 * Created by MAnuel on 30/03/2017.
 */

public class Beca implements KvmSerializable {
    private int id;
    private String persona;
    private String personal;
    private int tipo;
    private int cantidad;

    public Beca(int id, String persona, String personal, int tipo, int cantidad) {
        this.id = id;
        this.persona = persona;
        this.personal = personal;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Beca() {
        this(0,"","",0,0);
    }

    @Override
    public Object getProperty(int i) {
        switch (i) {
            case 0:
                return id;
            case 1:
                return persona;
            case 2:
                return personal;
            case 3:
                return tipo;
            case 4:
                return cantidad;
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
                persona = o.toString();
                break;
            case 2:
                personal = o.toString();
                break;
            case 3:
                tipo = Integer.parseInt(o.toString());
                break;
            case 4:
                cantidad = Integer.parseInt(o.toString());
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
                propertyInfo.name = "persona";
                break;
            case 2:
                propertyInfo.type = PropertyInfo.STRING_CLASS;
                propertyInfo.name = "personal";
                break;
            case 3:
                propertyInfo.type = PropertyInfo.INTEGER_CLASS;
                propertyInfo.name = "tipo";
                break;
            case 4:
                propertyInfo.type = PropertyInfo.INTEGER_CLASS;
                propertyInfo.name = "cantidad";
                break;
            default:
                break;
        }


    }
}
