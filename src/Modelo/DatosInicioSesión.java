package Modelo;

public class DatosInicioSesión {

    private String Usuario;
    private String Contraseña;

    public DatosInicioSesión() {
    }

    public DatosInicioSesión(int id, String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}
