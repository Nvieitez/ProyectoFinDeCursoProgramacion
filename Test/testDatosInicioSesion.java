import Modelo.DatosInicioSesion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testDatosInicioSesion {

    DatosInicioSesion datos = new DatosInicioSesion(1, "Nicolas", "nico1");

    @Test
    public void pruebaGetUsuario() {
        Assertions.assertEquals("Nicolas", datos.getUsuario());
    }

    @Test
    public void pruebaSetUsuario() {
        datos.setUsuario("Nicolas");
        Assertions.assertEquals("Nicolas", datos.getUsuario());
    }

    @Test
    public void pruebaGetContraseña() {
        Assertions.assertEquals("nico1", datos.getContrasena());
    }

    @Test
    public void pruebaSetContraseña() {
        datos.setContrasena("nico1");
        Assertions.assertEquals("nico1", datos.getContrasena());
    }

    @Test
    public void pruebaConstructor() {
        Assertions.assertEquals("Nicolas", datos.getUsuario());
        Assertions.assertEquals("nico1", datos.getContrasena());
    }

}
