package org.tpi_arg_prog;

import org.tpi_arg_prog.entities.Especialidad;
import org.tpi_arg_prog.entities.Tecnico;
import org.tpi_arg_prog.entities.repository.JpaTecnicoRespositorio;
import org.tpi_arg_prog.entities.repository.TecnicoRepositorio;
import org.tpi_arg_prog.entities.repository.dao.DAO;
import org.tpi_arg_prog.entities.repository.dao.JpaDAO;
import org.tpi_arg_prog.services.TecnicoService;

import java.util.ArrayList;

public class Main {

    static TecnicoService tecnicoService;

    public static void main(String[] args) {
        iniciar();
        System.out.println("Hello world!");
    }

    private static void iniciar() {
        DAO dao = new JpaDAO();
        TecnicoRepositorio tecnicoRepositorio = new JpaTecnicoRespositorio(dao);
        tecnicoService = new TecnicoService(tecnicoRepositorio);

        Tecnico tecnico = crearTecnico();
        tecnicoService.agregarTecnico(tecnico);

        Tecnico nuevoTecnico = tecnicoService.traerPorId(2L);

        // Otros servicios

    }

    private static Tecnico crearTecnico() {
        Tecnico tecnico = new Tecnico();
        tecnico.setId(2L);
        tecnico.setNombre("Pedro");
        tecnico.setApellido("Lopez");
        tecnico.getEspecialidades().add(crearEspecialidad(1L, "Informatico"));
        tecnico.getEspecialidades().add(crearEspecialidad(2L, "Gastronomico"));

        return tecnico;
    }

    private static Especialidad crearEspecialidad(Long id,String nombre) {
        Especialidad especialidad = new Especialidad();
        especialidad.setId(id);
        especialidad.setNombre(nombre);
        return especialidad;
    }
}