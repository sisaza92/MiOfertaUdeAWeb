/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.service;

import co.edu.udea.miofertaudea.dao.ServicesDao;
import co.edu.udea.miofertaudea.dao.ServiciosDao;
import co.edu.udea.miofertaudea.dto.Estudiante;
import co.edu.udea.miofertaudea.dto.Grupo;
import co.edu.udea.miofertaudea.dto.Impedimento;
import co.edu.udea.miofertaudea.dto.MateriaOfertada;
import co.edu.udea.miofertaudea.dto.Programa;
import co.edu.udea.miofertaudea.dto.Tanda;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *contiene la implementacion de los servicios rest
 * que se van a exponer
 * @author santiago
 */

@Path("/MiOferta")
public class ServicesImpl implements Services {
    private final ServicesDao serviciosDao = new  ServiciosDao();

    @Override
    public Response obtenerProgramaYUltimoSemestre(String cedulaEstudiante) {
        Response respuesta = null;
        try {
            List<Programa> programas  = serviciosDao.obtenerProgramaYUltimoSemestre(cedulaEstudiante);
            respuesta = Response.ok(programas).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public Response obtenerMateriasOfertadas(String cedulaEstudiante, String idPrograma) {
        Response respuesta = null;
        try {
            List<MateriaOfertada> oferta  = serviciosDao.obtenerMateriasOfertadas(cedulaEstudiante,idPrograma,"");
            respuesta = Response.ok(oferta).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
        
    }

    @Override
    public Response obtenerGrupos(String codigoMateria) {
        Response respuesta = null;
        try {
            List<Grupo> grupos  = serviciosDao.obtenerGrupos(codigoMateria);
            respuesta = Response.ok(grupos).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
        
    }

    @Override
    public Response obtenerTanda(String cedulaEstudiante) {
        Response respuesta = null;
        try {
            Tanda tanda  = serviciosDao.obtenerTanda(cedulaEstudiante);
            respuesta = Response.ok(tanda).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public Response obtenerImpedimentos(String cedulaEstudiante) {
        Response respuesta = null;
        try {
            List<Impedimento> impedimento  = serviciosDao.obtenerImpedimentos(cedulaEstudiante);
            respuesta = Response.ok(impedimento).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

    @Override
    public Response obtenerInfoEstudiante(String cedulaEstudiante) {
        Response respuesta = null;
        try {
            Estudiante estudiante = serviciosDao.obternerEstudiante(cedulaEstudiante);
            respuesta = Response.ok(estudiante).build();
            
        } catch (ExceptionInInitializerError ex) {
            // que hace
            Logger.getLogger(ServicesImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }

}
