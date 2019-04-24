/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author manul
 */
@Entity
@Table(name = "EQUIPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e")
    , @NamedQuery(name = "Equipos.findById", query = "SELECT e FROM Equipos e WHERE e.id = :id")
    , @NamedQuery(name = "Equipos.findByNombre", query = "SELECT e FROM Equipos e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Equipos.findByFechaFundaci\u00f3n", query = "SELECT e FROM Equipos e WHERE e.fechaFundaci\u00f3n = :fechaFundaci\u00f3n")
    , @NamedQuery(name = "Equipos.findByPresupuesto", query = "SELECT e FROM Equipos e WHERE e.presupuesto = :presupuesto")
    , @NamedQuery(name = "Equipos.findByCiudad", query = "SELECT e FROM Equipos e WHERE e.ciudad = :ciudad")
    , @NamedQuery(name = "Equipos.findByEstadio", query = "SELECT e FROM Equipos e WHERE e.estadio = :estadio")
    , @NamedQuery(name = "Equipos.findByN\u00bacampeonatos", query = "SELECT e FROM Equipos e WHERE e.n\u00bacampeonatos = :n\u00bacampeonatos")})
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "FECHA_FUNDACI\u00d3N")
    @Temporal(TemporalType.DATE)
    private Date fechaFundación;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRESUPUESTO")
    private BigDecimal presupuesto;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "ESTADIO")
    private String estadio;
    @Column(name = "N\u00baCAMPEONATOS")
    private Short nºcampeonatos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipo")
    private Collection<Jugadores> jugadoresCollection;

    public Equipos() {
    }

    public Equipos(Integer id) {
        this.id = id;
    }

    public Equipos(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaFundación() {
        return fechaFundación;
    }

    public void setFechaFundación(Date fechaFundación) {
        this.fechaFundación = fechaFundación;
    }

    public BigDecimal getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(BigDecimal presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Short getNºcampeonatos() {
        return nºcampeonatos;
    }

    public void setNºcampeonatos(Short nºcampeonatos) {
        this.nºcampeonatos = nºcampeonatos;
    }

    @XmlTransient
    public Collection<Jugadores> getJugadoresCollection() {
        return jugadoresCollection;
    }

    public void setJugadoresCollection(Collection<Jugadores> jugadoresCollection) {
        this.jugadoresCollection = jugadoresCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Equipos[ id=" + id + " ]";
    }
    
}
