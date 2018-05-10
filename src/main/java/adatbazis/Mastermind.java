/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adatbazis;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author minori
 */
@Entity
@Table(name = "mastermind")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mastermind.findAll", query = "SELECT m FROM Mastermind m")
    , @NamedQuery(name = "Mastermind.findById", query = "SELECT m FROM Mastermind m WHERE m.id = :id")
    , @NamedQuery(name = "Mastermind.findByV\u00e9geredm\u00e9ny", query = "SELECT m FROM Mastermind m WHERE m.v\u00e9geredm\u00e9ny = :v\u00e9geredm\u00e9ny")})
public class Mastermind implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "V\u00e9geredm\u00e9ny")
    private String végeredmény;

    public Mastermind() {
    }

    public Mastermind(Integer id) {
        this.id = id;
    }

    public Mastermind(Integer id, String végeredmény) {
        this.id = id;
        this.végeredmény = végeredmény;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVégeredmény() {
        return végeredmény;
    }

    public void setVégeredmény(String végeredmény) {
        this.végeredmény = végeredmény;
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
        if (!(object instanceof Mastermind)) {
            return false;
        }
        Mastermind other = (Mastermind) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "adatbazis.Mastermind[ id=" + id + " ]";
    }
    
}
