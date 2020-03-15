/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Employer;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Farkhad
 */
@Local
public interface EmployerFacadeLocal {

    void create(Employer employer);

    void edit(Employer employer);

    void remove(Employer employer);

    Employer find(Object id);

    List<Employer> findAll();

    List<Employer> findRange(int[] range);

    int count();
    
}
