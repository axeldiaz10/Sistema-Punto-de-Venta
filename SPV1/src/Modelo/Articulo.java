/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Axel y Ampy
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private double precioUnitario;
    private Stock stock;
    private Proveedor proveedor;

    public Articulo() {
    }

    public Articulo(int codigo, String descripcion, double precioUnitario, Stock stock, Proveedor proveedor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
        this.proveedor = proveedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precio) {
        this.precioUnitario = precio;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precioUnitario + ", stock=" + stock + ", proveedor=" + proveedor + '}';
    }
    
    /* public Articulo buscarArticulo (int c){
         Articulo a = new Articulo();
         if (c == this.codigo) {
             a = this;
             return a;
         } else return a=null;
     } */
    
}
