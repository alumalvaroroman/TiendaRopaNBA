/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaropanba;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alvaro
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto_1.findAll", query = "SELECT p FROM Producto_1 p"),
    @NamedQuery(name = "Producto_1.findByIdProducto", query = "SELECT p FROM Producto_1 p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto_1.findByNombreProducto", query = "SELECT p FROM Producto_1 p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Producto_1.findByEquipo", query = "SELECT p FROM Producto_1 p WHERE p.equipo = :equipo"),
    @NamedQuery(name = "Producto_1.findByTalla", query = "SELECT p FROM Producto_1 p WHERE p.talla = :talla"),
    @NamedQuery(name = "Producto_1.findByColor", query = "SELECT p FROM Producto_1 p WHERE p.color = :color"),
    @NamedQuery(name = "Producto_1.findByPrecio", query = "SELECT p FROM Producto_1 p WHERE p.precio = :precio"),
    @NamedQuery(name = "Producto_1.findByCantidadesDisponibles", query = "SELECT p FROM Producto_1 p WHERE p.cantidadesDisponibles = :cantidadesDisponibles"),
    @NamedQuery(name = "Producto_1.findByDescripcion", query = "SELECT p FROM Producto_1 p WHERE p.descripcion = :descripcion")})
public class Producto_1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdProducto")
    private Integer idProducto;
    @Column(name = "NombreProducto")
    private String nombreProducto;
    @Column(name = "Equipo")
    private String equipo;
    @Basic(optional = false)
    @Column(name = "Talla")
    private String talla;
    @Column(name = "Color")
    private String color;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Precio")
    private BigDecimal precio;
    @Column(name = "CantidadesDisponibles")
    private Integer cantidadesDisponibles;
    @Column(name = "Descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idProducto")
    private Collection<Ventas> ventasCollection;

    public Producto_1() {
    }

    public Producto_1(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto_1(Integer idProducto, String talla) {
        this.idProducto = idProducto;
        this.talla = talla;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getCantidadesDisponibles() {
        return cantidadesDisponibles;
    }

    public void setCantidadesDisponibles(Integer cantidadesDisponibles) {
        this.cantidadesDisponibles = cantidadesDisponibles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Ventas> getVentasCollection() {
        return ventasCollection;
    }

    public void setVentasCollection(Collection<Ventas> ventasCollection) {
        this.ventasCollection = ventasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto_1)) {
            return false;
        }
        Producto_1 other = (Producto_1) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tiendaropanba.Producto_1[ idProducto=" + idProducto + " ]";
    }
    
}
