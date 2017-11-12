package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Estudiante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstudianteServicio {

    /**
     * retorna una lista con los Municipio que se encuentran en la base de datos
     *
     * @return retorna una lista de MunicipioDTO
     * @generated
     */
    @GET
    public List<EstudianteDTO> obtenerTodosEstudiantes() {
        return ProveedorInformacion.instance().obtenerTodos(EstudianteDTO.class);
    }

    /**
     * @param id identificador del elemento Municipio
     * @return Municipio del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public EstudianteDTO obtenerEstudiante(@PathParam("id") Long id) {
        return (EstudianteDTO) ProveedorInformacion.instance().obtener(EstudianteDTO.class, id);
    }

    /**
     * almacena la informacion de Municipio
     *
     * @param dto Municipio a guardar
     * @return Municipio con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public EstudianteDTO guardarEstudiante(EstudianteDTO dto) {
        return (EstudianteDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Municipio con el identificador dado
     *
     * @param id identificador del Municipio
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarEstudiante(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(EstudianteDTO.class, id);
    }

}
