package org.tpi_arg_prog.services;

import org.tpi_arg_prog.entities.Tecnico;
import org.tpi_arg_prog.entities.repository.TecnicoRepositorio;

import java.util.ArrayList;
import java.util.List;

public class TecnicoService {

    private TecnicoRepositorio tecnicoRepositorio;

    public TecnicoService(TecnicoRepositorio tecnicoRepositorio) {
        this.tecnicoRepositorio = tecnicoRepositorio;
    }

    void agregarTecnico(Tecnico tecnico) {};


    void actualizarTecnico(Tecnico tecnico) {

    };
    Tecnico traerPorId(Long id) {
        return new Tecnico();
    };
    void eliminarTecnica(Long id) {

    }
    ;
    List<Tecnico> traerTodosTecnicos() {
        return new ArrayList<>();
    };

}
