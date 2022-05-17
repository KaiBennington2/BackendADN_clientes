package com.ceiba.cliente.servicio;

import com.ceiba.cliente.modelo.dto.DtoCliente;
import com.ceiba.cliente.puerto.dao.DaoCliente;
import com.ceiba.cliente.puerto.repositories.RepositorioCliente;
import com.ceiba.dominio.excepcion.ExcepcionSinDatos;

public class ServicioEliminarCliente {

    private static final String NOT_EXISTS = "el cliente no existe en el sistema.";
    private static final String TIENE_CONTRATOS_RELACIONADOS = "el cliente no puede ser eliminado por que tiene contratos relacionados.";

    private final RepositorioCliente repositorioCliente;
    private final DaoCliente daoCliente;

    public ServicioEliminarCliente(RepositorioCliente repositorioCliente,
                                   DaoCliente daoCliente) {
        this.repositorioCliente = repositorioCliente;
        this.daoCliente = daoCliente;
    }

    public void ejecutar(Long id) {
        if (!daoCliente.existsById(id)) { throw new ExcepcionSinDatos(NOT_EXISTS); }
        DtoCliente dtoCliente = this.daoCliente.findById(id);
        repositorioCliente.delete(id);
    }

}
