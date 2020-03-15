/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Farkhad
 */
@Entity
public class Commission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String CommissionItem;
    private String CommissionAuthor;
    private String CommissionExecutors;
    private Date CommissionExecutionDate;
    private String CommissionSignOfControl;
    private Boolean CommissionSignOfExecution;
    private String CommissionBody;

    public String getCommissionItem() {
        return CommissionItem;
    }

    public void setCommissionItem(String CommissionItem) {
        this.CommissionItem = CommissionItem;
    }

    public String getCommissionAuthor() {
        return CommissionAuthor;
    }

    public void setCommissionAuthor(String CommissionAuthor) {
        this.CommissionAuthor = CommissionAuthor;
    }

    public String getCommissionExecutors() {
        return CommissionExecutors;
    }

    public void setCommissionExecutors(String CommissionExecutors) {
        this.CommissionExecutors = CommissionExecutors;
    }

    public Date getCommissionExecutionDate() {
        return CommissionExecutionDate;
    }

    public void setCommissionExecutionDate(Date CommissionExecutionDate) {
        this.CommissionExecutionDate = CommissionExecutionDate;
    }

    public String getCommissionSignOfControl() {
        return CommissionSignOfControl;
    }

    public void setCommissionSignOfControl(String CommissionSignOfControl) {
        this.CommissionSignOfControl = CommissionSignOfControl;
    }

    public Boolean getCommissionSignOfExecution() {
        return CommissionSignOfExecution;
    }

    public void setCommissionSignOfExecution(Boolean CommissionSignOfExecution) {
        this.CommissionSignOfExecution = CommissionSignOfExecution;
    }

    public String getCommissionBody() {
        return CommissionBody;
    }

    public void setCommissionBody(String CommissionBody) {
        this.CommissionBody = CommissionBody;
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
        if (!(object instanceof Commission)) {
            return false;
        }
        Commission other = (Commission) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Commission[ id=" + id + " ]";
    }
    
}
