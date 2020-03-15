/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbeans;

import entities.Subdivizion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Farkhad
 */
@Local
public interface SubdivizionFacadeLocal {

    void create(Subdivizion subdivizion);

    void edit(Subdivizion subdivizion);

    void remove(Subdivizion subdivizion);

    Subdivizion find(Object id);

    List<Subdivizion> findAll();

    List<Subdivizion> findRange(int[] range);

    int count();
    
}
