package co.edu.unicauca.distribuidos.api_rest_dian.services;

import java.util.List;

import co.edu.unicauca.distribuidos.api_rest_dian.models.Compra;

public interface ICompraService {
        public List<Compra> findAll();		
	public Compra findById(Integer id);	
	public Compra save(Compra compra);	
	public Compra update(Integer id, Compra compra);	
	public boolean delete(Integer id);
        public boolean analizar(Integer id);
}
