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
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String OrgName;
    private String OrgPhysicalAddress;
    private String OrgLegalAddress;
    private String OrgLeader;

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    public String getOrgPhysicalAddress() {
        return OrgPhysicalAddress;
    }

    public void setOrgPhysicalAddress(String OrgPhysicalAddress) {
        this.OrgPhysicalAddress = OrgPhysicalAddress;
    }

    public String getOrgLegalAddress() {
        return OrgLegalAddress;
    }

    public void setOrgLegalAddress(String OrgLegalAddress) {
        this.OrgLegalAddress = OrgLegalAddress;
    }

    public String getOrgLeader() {
        return OrgLeader;
    }

    public void setOrgLeader(String OrgLeader) {
        this.OrgLeader = OrgLeader;
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
        if (!(object instanceof Organization)) {
            return false;
        }
        Organization other = (Organization) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Organization[ id=" + id + " ]";
    }
    
}
