package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Profesor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfesorServicio {


    @GET
    public List<ProfesorDTO> obtenerTodosProfesores() {
        return ProveedorInformacion.instance().obtenerTodos(ProfesorDTO.class);
    }

    @GET
    @Path("/{id}")
    public ProfesorDTO obtenerProfesor(@PathParam("id") Long id) {
        return (ProfesorDTO) ProveedorInformacion.instance().obtener(ProfesorDTO.class, id);
    }


    @POST
    public ProfesorDTO guardarProfesor(ProfesorDTO dto) {
        return (ProfesorDTO) ProveedorInformacion.instance().guardar(dto);
    }

    @DELETE
    @Path("/{id}")
    public void borrarProfesor(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(ProfesorDTO.class, id);
    }

}
