/*Modela la información de un evento de inspección 
(id, codigoPozo, municipio, tipoEvento, descripcion, fechaHora). 
Constructor, getters, setters, toString(). */

package JavaAplicacion;

public class Inspeccion {

    private String codigoPozo;
    private String municipio;
    private String tipoEvento;
    private String descripcion;
    private String fechaHora;

    public Inspeccion(String codigoPozo, String municipio, String tipoEvento, String descripcion,
            String fechaHora) {
        this.codigoPozo = codigoPozo;
        this.municipio = municipio;
        this.tipoEvento = tipoEvento;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }

    public String getCodigoPozo() {
        return codigoPozo;
    }

    public void setCodigoPozo(String codigoPozo) {
        this.codigoPozo = codigoPozo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String toString() {
        return "EventoInspeccion{" + "codigoPozo=" + codigoPozo + ", municipio=" + municipio + ", tipoEvento=" + tipoEvento
                + ", descripcion=" + descripcion + ", fechaHora=" + fechaHora + '}';
    }

}