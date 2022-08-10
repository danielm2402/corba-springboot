package co.edu.unicauca.distribuidos.api_rest_dian.repositories;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.unicauca.distribuidos.api_rest_dian.models.Compra;

@Service
public class CompraRepository {

    private ArrayList<Compra> listaDeCompras;

    public CompraRepository() {
        this.listaDeCompras = new ArrayList<Compra>();
        cargarCompras();
    }

    public List<Compra> findAll() {
        System.out.println("Invocando a listarclientes");
        return this.listaDeCompras;
    }

    public Compra findById(Integer id) {
        System.out.println("Invocando a consultar una compra");
        Compra objCompra = null;

        for (Compra compra : listaDeCompras) {
            if (java.util.Objects.equals(compra.getId(), id)) {
                objCompra = compra;
                break;
            }
        }

        return objCompra;
    }

    public boolean analizar(Integer id) {
        System.out.println("ID " + id.getClass().getSimpleName());
        float total = 0;
        for (Compra objcompra : this.listaDeCompras) {

            if (java.util.Objects.equals(objcompra.getId(), id)) {
                System.out.println("USER " + objcompra.getId());
                total = total + objcompra.getValor();
            }
        }
        System.out.println("total: " + total);
        if (total > 45000000) {
            return true;
        }
        return false;
    }

    public Compra save(Compra compra) {
        System.out.println("Invocando a almacenar compra");
        Compra objCompra = null;
        if (this.listaDeCompras.add(compra)) {
            objCompra = compra;
        }

        return objCompra;
    }

    public Compra update(Integer id, Compra compra) {
        System.out.println("Invocando a actualizar una compra");
        Compra objCompra = null;

        for (int i = 0; i < this.listaDeCompras.size(); i++) {
            if (this.listaDeCompras.get(i).getId() == id) {
                this.listaDeCompras.set(i, compra);
                objCompra = compra;
                break;
            }
        }

        return objCompra;
    }

    public boolean delete(Integer id) {
        System.out.println("Invocando a eliminar una compra");
        boolean bandera = false;

        for (int i = 0; i < this.listaDeCompras.size(); i++) {
            if (this.listaDeCompras.get(i).getId() == id) {
                this.listaDeCompras.remove(i);
                bandera = true;
                break;
            }
        }

        return bandera;
    }

    private void cargarCompras() {
        Compra objCompra1 = new Compra(1, "CC", 50000000, "Exito sa", new Date(), "TARJETA", 105);
        this.listaDeCompras.add(objCompra1);

    }

}
