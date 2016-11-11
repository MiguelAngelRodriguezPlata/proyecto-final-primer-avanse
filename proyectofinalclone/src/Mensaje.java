/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NucleoInformativo
 */
public class Mensaje {
    private int idMensaje;
    private Usuario usuario;
    private String asunto;
    private String mensaje;
    private String tipo;

    public Mensaje(int idMensaje, Usuario usuario, String asunto, String mensaje, String tipo) {
        this.idMensaje = idMensaje;
        this.usuario = usuario;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
