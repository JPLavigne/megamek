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
public class InfantryPistoMachinePistolSPEC7AWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryPistoMachinePistolSPEC7AWeapon() {
        super();

        name = "MP (H-T Spec-7a)";
        setInternalName(name);
        addLookupName("SPEC7A");
        ammoType = AmmoType.T_NA;
        cost = 190;
        bv = 0.19;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
        infantryDamage = 0.13;
        infantryRange = 0;
        introDate = 3053;
        techLevel.put(1950,TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[]{RATING_X,RATING_X,RATING_D,RATING_D};
        techRating = RATING_D;
        rulesRefs =" 177, HB:HK";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(DATE_NONE, DATE_NONE, DATE_NONE);
        techAdvancement.setTechRating(RATING_D);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_D, RATING_D });
    }
}
