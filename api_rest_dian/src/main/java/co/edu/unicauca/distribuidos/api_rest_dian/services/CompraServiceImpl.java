package co.edu.unicauca.distribuidos.api_rest_dian.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unicauca.distribuidos.api_rest_dian.models.Compra;
import co.edu.unicauca.distribuidos.api_rest_dian.repositories.CompraRepository;

@Service
public class CompraServiceImpl implements ICompraService {

    @Autowired
	private CompraRepository servicioAccesoBaseDatos;

    @Override
    public boolean delete(Integer id) {
        return this.servicioAccesoBaseDatos.delete(id);	
    }

    @Override
    public List<Compra> findAll() {
        return this.servicioAccesoBaseDatos.findAll();
    }

    @Override
    public Compra findById(Integer id) {
        return this.servicioAccesoBaseDatos.findById(id);
    }

    @Override
    public Compra save(Compra compra) {
        return this.servicioAccesoBaseDatos.save(compra);
    }

    @Override
    public Compra update(Integer id, Compra compra) {
        return this.servicioAccesoBaseDatos.update(id, compra);
    }

    @Override
    public boolean analizar(Integer id) {
        return this.servicioAccesoBaseDatos.analizar(id);
    }
    
}
