/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.miofertaudea.dao;

import co.edu.udea.miofertaudea.dto.Programa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CristianCamilo
 */
public class ServiciosDao implements ServicesDao {

    @Override
    public List<Programa> obtenerProgramaYUltimoSemestre() {
        List<Programa> programas = new ArrayList();
        programas.add(new Programa(504, "Ingeniería de Sistemas", "Activo", "2016-1"));
        programas.add(new Programa(104, "Administración de Empresas", "Cancelado", "2016-1"));
        programas.add(new Programa(106, "Administración de Empresas - Carmen de Viboral", "Inactivo", "2016-1"));
        programas.add(new Programa(391, "Archivistica", "Admitido", "2015-1"));
        programas.add(new Programa(90504, "Ingeniería de Sistemas", "Admitido", "2016-1"));
        
        return programas;
    }

    @Override
    public void obtenerMateriasEnSemestre(String idStudent, String program, String semester) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerMaterias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerGrupos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerTanda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerImpedimentos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
