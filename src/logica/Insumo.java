package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (name = "insumo")
public class Insumo implements Serializable{
    
    @Id
    @Column(name = "codigo")
    private String codigo;
    @Basic
    @Column(name = "nombre_insumo")
    private String nombreInsumo;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "proveedor")
    private String proveedor;
    @Column(name = "especificaciones")
    private String especif;
    @Column(name = "unidad_medida")
    private String uMedida;
    @Column(name = "stock_I")
    private float stockInicial;
    @Column(name = "stock_A")
    private float stockActual;
    @Column(name = "stock_MIN")
    private int stockMin;
    @Column(name = "costo")
    private float costo;
    @Column(name = "precio")
    private float precio;

    public Insumo() {
    }

    public Insumo(String codigo, String nombreInsumo, String categoria, 
            String proveedor, String especif, String uMedida, float stockInicial,
            float stockActual, int stockMin, float costo, float precio) {
        this.codigo = codigo;
        this.nombreInsumo = nombreInsumo;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.especif = especif;
        this.uMedida = uMedida;
        this.stockInicial = stockInicial;
        this.stockActual = stockActual;
        this.stockMin = stockMin;
        this.costo = costo;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getEspecif() {
        return especif;
    }

    public void setEspecif(String especif) {
        this.especif = especif;
    }

    public String getuMedida() {
        return uMedida;
    }

    public void setuMedida(String uMedida) {
        this.uMedida = uMedida;
    }

    public float getStockInicial() {
        return stockInicial;
    }

    public void setStockInicial(float stockInicial) {
        this.stockInicial = stockInicial;
    }

    public float getStockActual() {
        return stockActual;
    }

    public void setStockActual(float stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
