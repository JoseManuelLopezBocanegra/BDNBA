/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author manul
 */
@Entity
@Table(name = "JUGADORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugadores.findAll", query = "SELECT j FROM Jugadores j")
    , @NamedQuery(name = "Jugadores.findById", query = "SELECT j FROM Jugadores j WHERE j.id = :id")
    , @NamedQuery(name = "Jugadores.findByNombre", query = "SELECT j FROM Jugadores j WHERE j.nombre = :nombre")
    , @NamedQuery(name = "Jugadores.findByApellidos", query = "SELECT j FROM Jugadores j WHERE j.apellidos = :apellidos")
    , @NamedQuery(name = "Jugadores.findByN\u00bacamiseta", query = "SELECT j FROM Jugadores j WHERE j.n\u00bacamiseta = :n\u00bacamiseta")
    , @NamedQuery(name = "Jugadores.findByPosici\u00f3n", query = "SELECT j FROM Jugadores j WHERE j.posici\u00f3n = :posici\u00f3n")
    , @NamedQuery(name = "Jugadores.findByPa\u00eds", query = "SELECT j FROM Jugadores j WHERE j.pa\u00eds = :pa\u00eds")
    , @NamedQuery(name = "Jugadores.findByPromedioPuntosPorPartido", query = "SELECT j FROM Jugadores j WHERE j.promedioPuntosPorPartido = :promedioPuntosPorPartido")
    , @NamedQuery(name = "Jugadores.findByAltura", query = "SELECT j FROM Jugadores j WHERE j.altura = :altura")
    , @NamedQuery(name = "Jugadores.findByFechaNacimiento", query = "SELECT j FROM Jugadores j WHERE j.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Jugadores.findBySalario", query = "SELECT j FROM Jugadores j WHERE j.salario = :salario")
    , @NamedQuery(name = "Jugadores.findByA\u00f1osActivo", query = "SELECT j FROM Jugadores j WHERE j.a\u00f1osActivo = :a\u00f1osActivo")
    , @NamedQuery(name = "Jugadores.findByAnillos", query = "SELECT j FROM Jugadores j WHERE j.anillos = :anillos")
    , @NamedQuery(name = "Jugadores.findByAllStar", query = "SELECT j FROM Jugadores j WHERE j.allStar = :allStar")
    , @NamedQuery(name = "Jugadores.findByN\u00baallStars", query = "SELECT j FROM Jugadores j WHERE j.n\u00baallStars = :n\u00baallStars")
    , @NamedQuery(name = "Jugadores.findByMvp", query = "SELECT j FROM Jugadores j WHERE j.mvp = :mvp")
    , @NamedQuery(name = "Jugadores.findByFoto", query = "SELECT j FROM Jugadores j WHERE j.foto = :foto")})
public class Jugadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "N\u00baCAMISETA")
    private String nºcamiseta;
    @Column(name = "POSICI\u00d3N")
    private String posición;
    @Column(name = "PA\u00cdS")
    private String país;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROMEDIO_PUNTOS_POR_PARTIDO")
    private BigDecimal promedioPuntosPorPartido;
    @Column(name = "ALTURA")
    private BigDecimal altura;
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "SALARIO")
    private BigDecimal salario;
    @Column(name = "A\u00d1OS_ACTIVO")
    private Short añosActivo;
    @Column(name = "ANILLOS")
    private Short anillos;
    @Column(name = "ALL_STAR")
    private Boolean allStar;
    @Column(name = "N\u00baALL_STARS")
    private Short nºallStars;
    @Column(name = "MVP")
    private Short mvp;
    @Column(name = "FOTO")
    private String foto;
    @JoinColumn(name = "EQUIPO", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Equipos equipo;

    public Jugadores() {
    }

    public Jugadores(Integer id) {
        this.id = id;
    }

    public Jugadores(Integer id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNºcamiseta() {
        return nºcamiseta;
    }

    public void setNºcamiseta(String nºcamiseta) {
        this.nºcamiseta = nºcamiseta;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public BigDecimal getPromedioPuntosPorPartido() {
        return promedioPuntosPorPartido;
    }

    public void setPromedioPuntosPorPartido(BigDecimal promedioPuntosPorPartido) {
        this.promedioPuntosPorPartido = promedioPuntosPorPartido;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Short getAñosActivo() {
        return añosActivo;
    }

    public void setAñosActivo(Short añosActivo) {
        this.añosActivo = añosActivo;
    }

    public Short getAnillos() {
        return anillos;
    }

    public void setAnillos(Short anillos) {
        this.anillos = anillos;
    }

    public Boolean getAllStar() {
        return allStar;
    }

    public void setAllStar(Boolean allStar) {
        this.allStar = allStar;
    }

    public Short getNºallStars() {
        return nºallStars;
    }

    public void setNºallStars(Short nºallStars) {
        this.nºallStars = nºallStars;
    }

    public Short getMvp() {
        return mvp;
    }

    public void setMvp(Short mvp) {
        this.mvp = mvp;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
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
        if (!(object instanceof Jugadores)) {
            return false;
        }
        Jugadores other = (Jugadores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Jugadores[ id=" + id + " ]";
    }
    
}
