package org.tpi_arg_prog.entities.repository;

import org.tpi_arg_prog.entities.Tecnico;

import java.util.List;

public interface TecnicoRepositorio {

    void agregarTecnico(Tecnico tecnico);
    void actualizarTecnico(Tecnico tecnico);
    Tecnico traerPorId(Long id);
    void eliminarTecnica(Long id);
    List<Tecnico> traerTodosTecnicos();

}
