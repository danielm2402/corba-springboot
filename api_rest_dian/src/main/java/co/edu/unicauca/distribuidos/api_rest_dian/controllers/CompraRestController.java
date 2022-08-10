package co.edu.unicauca.distribuidos.api_rest_dian.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.time.DateFormatUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.distribuidos.api_rest_dian.models.Compra;
import co.edu.unicauca.distribuidos.api_rest_dian.services.ICompraService;
import sop_corba.ControladorNotificacionesInt;
import sop_corba.ControladorNotificacionesIntPackage.NotificacionDTO;
import utilidades.UtilidadesRegistroC;

@RestController
@RequestMapping("/api")
public class CompraRestController {

    @Autowired
    private ICompraService compraService;

    @GetMapping("/compras")
    public List<Compra> index() {
        return compraService.findAll();
    }

    @GetMapping("/compras/{id}")
    public Compra show(@PathVariable Integer id) {
        Compra objCliente = null;
        objCliente = compraService.findById(id);
        return objCliente;
    }

    @GetMapping("/analizar/{id}")
    public boolean analizar(@PathVariable Integer id) {
        boolean result = false;
        result = compraService.analizar(id);
        if (result) {
            ControladorNotificacionesInt objRemoto;
            String[] vectorDatosLocalizarNS = new String[4];
            vectorDatosLocalizarNS[0] = "-ORBInitialHost";
            vectorDatosLocalizarNS[1] = "localhost";
            vectorDatosLocalizarNS[2] = "-ORBInitialPort";
            vectorDatosLocalizarNS[3] = "5000";
            objRemoto = UtilidadesRegistroC.obtenerObjRemoto(vectorDatosLocalizarNS, "idObjetoRemoto");
            Compra objcompra = null;
            objcompra = compraService.findById(id);
            System.out.println(objcompra.getLugar());
            NotificacionDTO objNotificacion = new NotificacionDTO(objcompra.getId(), objcompra.getTipo(), objcompra.getValor(), objcompra.getLugar(), DateFormatUtils.format(objcompra.getFecha(), "yyyy-MM-dd HH:mm:SS"), objcompra.getMedioDePago(), objcompra.getNit());
            objRemoto.registrarNotificacion(objNotificacion);
        }
        return result;
    }

    @PostMapping("/compra")
    public Compra create(@RequestParam String id, @RequestParam String tipo, @RequestBody Compra compra) {
        Compra objCompra = new Compra(Integer.parseInt(id), tipo, compra.getValor(), compra.getLugar(), compra.getFecha(), compra.getMedioDePago(), compra.getNit());
        return compraService.save(objCompra);
    }
}
