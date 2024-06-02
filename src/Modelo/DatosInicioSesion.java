package Modelo;

public class DatosInicioSesion {

    private String usuario;
    private String contrasena;

    public DatosInicioSesion() {
    }

    public DatosInicioSesion(int id, String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
