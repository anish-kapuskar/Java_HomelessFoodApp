/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PickupRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sumedhtelang
 */
public class PickupOrganization extends Organization {

    public PickupOrganization() {
        super(Organization.Type.Pickup.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PickupRole());
        return roles;
    }
    
}
