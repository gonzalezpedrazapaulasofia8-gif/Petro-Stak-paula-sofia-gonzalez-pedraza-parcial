/*Modela el pozo asociado al evento (codigo, municipio, operador). Permite evaluar asociación entre clases. */


package JavaAplicacion;

public class Poso {
    private String codigo;
    private String municipio;
    private String operador;

    public Poso(String codigo, String municipio, String operador) {
        this.codigo = codigo;
        this.municipio = municipio;
        this.operador = operador;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getOperador() {
        return operador;
    }

    
    
}