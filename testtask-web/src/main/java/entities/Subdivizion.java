/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Farkhad
 */
@Entity
public class Subdivizion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String SubDivizionName;
    private String SDContactDetails;
    private String SDLeader;

    public String getSubDivizionName() {
        return SubDivizionName;
    }

    public void setSubDivizionName(String SubDivizionName) {
        this.SubDivizionName = SubDivizionName;
    }

    public String getSDContactDetails() {
        return SDContactDetails;
    }

    public void setSDContactDetails(String SDContactDetails) {
        this.SDContactDetails = SDContactDetails;
    }

    public String getSDLeader() {
        return SDLeader;
    }

    public void setSDLeader(String SDLeader) {
        this.SDLeader = SDLeader;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Subdivizion)) {
            return false;
        }
        Subdivizion other = (Subdivizion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Subdivizion[ id=" + id + " ]";
    }
    
}
