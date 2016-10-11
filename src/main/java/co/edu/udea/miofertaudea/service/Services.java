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
    public Response obtenerProgramaYUltimoSemestre(@PathParam("cedulaEstudiante") long cedulaEstudiante);
    
    @GET
    @Path("/obtenerMateriasEnSemestre/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerMateriasEnSemestre(@PathParam("cedulaEstudiante") long cedulaEstudiante);
    
    @GET
    @Path("/obtenerMaterias/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerMaterias(@PathParam("cedulaEstudiante") long cedulaEstudiante);
    
    @GET
    @Path("/obtenerGrupos/{codigoMateria}")
    @Produces("application/json")
    @Formatted
    public Response obtenerGrupos(@PathParam("codigoMateria") String codigoMateria);
    
    @GET
    @Path("/obtenerTanda/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerTanda(@PathParam("cedulaEstudiante") long cedulaEstudiante);
    
    @GET
    @Path("/obtenerImpedimentos/{cedulaEstudiante}")
    @Produces("application/json")
    @Formatted
    public Response obtenerImpedimentos(@PathParam("cedulaEstudiante") long cedulaEstudiante);
    
}
