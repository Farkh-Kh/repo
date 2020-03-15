/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Commission;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Farkhad
 */
@Local
public interface CommissionFacadeLocal {

    void create(Commission commission);

    void edit(Commission commission);

    void remove(Commission commission);

    Commission find(Object id);

    List<Commission> findAll();

    List<Commission> findRange(int[] range);

    int count();
    
}
