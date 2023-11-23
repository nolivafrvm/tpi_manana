package org.tpi_arg_prog.entities.repository;

import org.tpi_arg_prog.entities.Tecnico;
import org.tpi_arg_prog.entities.repository.dao.DAO;

import java.util.List;

public class JpaTecnicoRespositorio implements TecnicoRepositorio{

    private DAO dao;

    public JpaTecnicoRespositorio(DAO dao) {
        this.dao = dao;
    }

    @Override
    public void agregarTecnico(Tecnico tecnico) {

    }

    @Override
    public void actualizarTecnico(Tecnico tecnico) {

    }

    @Override
    public Tecnico traerPorId(Long id) {
        return null;
    }

    @Override
    public void eliminarTecnica(Long id) {

    }

    @Override
    public List<Tecnico> traerTodosTecnicos() {
        return null;
    }
}
