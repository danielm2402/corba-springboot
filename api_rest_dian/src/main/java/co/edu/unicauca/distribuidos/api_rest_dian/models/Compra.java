package co.edu.unicauca.distribuidos.api_rest_dian.models;

import java.util.Date;

public class Compra {
    private Integer id;	
    private String tipo;	
    private float valor;	
    private String lugar;
    private Date fecha;
    private String MedioDePago;
    private Integer nit;
    
    public Compra(){
        
    }

    public Compra(Integer id, String tipo, float valor, String lugar, Date fecha, String medioDePago, Integer nit) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.lugar = lugar;
        this.fecha = fecha;
        this.MedioDePago = medioDePago;
        this.nit = nit;
    }

    public Integer getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public float getValor() {
        return valor;
    }

    public String getLugar() {
        return lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getMedioDePago() {
        return MedioDePago;
    }

    public Integer getNit() {
        return nit;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMedioDePago(String medioDePago) {
        MedioDePago = medioDePago;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }	
	

  
}
