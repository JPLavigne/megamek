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
public class InfantryPistolHawkEagleAutoPistolWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryPistolHawkEagleAutoPistolWeapon() {
        super();

        name = "Auto-Pistol (Hawk Eagle)";
        setInternalName(name);
        addLookupName("InfantryHawkEagleAutopistol");
        addLookupName("Hawk Eagle Auto Pistol");
        ammoType = AmmoType.T_NA;
        cost = 100;
        bv = 0.25;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
        infantryDamage = 0.27;
        infantryRange = 0;
        introDate = 3025;
        techLevel.put(3025, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3035, TechConstants.T_IS_ADVANCED);
        techLevel.put(3050, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X,RATING_F ,RATING_C ,RATING_C};
        techRating = RATING_C;
        rulesRefs = "273, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3025, 3035, 3050);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_F, RATING_C, RATING_C });
    }
}
