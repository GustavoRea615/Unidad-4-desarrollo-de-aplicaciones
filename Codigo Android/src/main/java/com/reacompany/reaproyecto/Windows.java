package com.reacompany.reaproyecto;

/**
 * Created by Martha on 30/12/2016.
 */
public class Windows {
    private String version;
    private String serial;
    private String propietario;

    private static Windows windows;

    public static Windows getWindows() {
        if (windows ==null){
            windows = new Windows();
        }
        return windows;
    }

    public Windows() {
        this.version = "";
        this.serial="";
        this.propietario="";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public static void setWindows(Windows windows) {
        Windows.windows = windows;
    }
}
