/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.annotations.providers.jackson.Formatted;

/**
 *
 * @author santiago
 */
public interface Services {

    //que hace cada anotacion?
    @GET
    @Path("/obtenerProgramaYUltimoSemestre/{cedulaEstudiante}")
    
    @Produces("application/json")
    @Formatted
    public Response obtenerProgramaYUltimoSemestre(@PathParam("cedulaEstudiante") String cedulaEstudiante);
    
    @GET
    // cedula estudiante y codigo del programa
    @Path("/obtenerMateriasOfertadas/{cedulaEstudiante}/{idPrograma}")
    @Produces("application/json")
    @Formatted
    public Response obtenerMateriasOfertadas(@PathParam("cedulaEstudiante") String cedulaEstudiante,
            @PathParam("idPrograma") String idPrograma);
    
    @GET
    @Path("/obtenerGrupos/{codigoMateria}")
    @Produces("application/json")
    @Formatted
    public Response obtenerGrupos(@PathParam("codigoMateria") String codigoMateria);
    
    @GET
    @Path("/obtenerTanda/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerTanda(@PathParam("cedulaEstudiante") String cedulaEstudiante);
    
    @GET
    @Path("/obtenerImpedimentos/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerImpedimentos(@PathParam("cedulaEstudiante") String cedulaEstudiante);
    
}
