/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 *
 *  This program is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License as published by the Free
 *  Software Foundation; either version 2 of the License, or (at your option)
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 *  for more details.
 */
/*
 * Created on Sep 7, 2005
 *
 */
package megamek.common.weapons.infantry;

import megamek.common.AmmoType;
import megamek.common.TechConstants;
import megamek.common.TechAdvancement;

/**
 * @author Ben Grills
 */
public class InfantryRifleFederatedBarrettM42BWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryRifleFederatedBarrettM42BWeapon() {
        super();

        name = "Rifle (Federated-Barrett M42B)";
        setInternalName(name);
        addLookupName("InfantryFederatedBarrettM42B");
        addLookupName("Federated Barrett M42B");
        ammoType = AmmoType.T_NA;
        cost = 1385;
        bv = 3.12;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC).or(F_INF_BURST);
        infantryDamage = 1.02;
        infantryRange = 1;
        introDate = 3055;
        techLevel.put(3055, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3064, TechConstants.T_IS_ADVANCED);
        techLevel.put(3095, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X,RATING_X ,RATING_D ,RATING_C};
        techRating = RATING_C;
        rulesRefs = "273, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3055, 3064, 3095);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_D, RATING_C });
    }
}
