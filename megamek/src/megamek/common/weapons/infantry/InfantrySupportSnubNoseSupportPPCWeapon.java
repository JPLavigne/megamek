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
public class InfantrySupportSnubNoseSupportPPCWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantrySupportSnubNoseSupportPPCWeapon() {
        super();

        name = "Support PPC (Snub-Nose)";
        setInternalName(name);
        addLookupName("InfantrySnubNoseSupportPPC");
        addLookupName("SnubNoseSupportPPC");
        ammoType = AmmoType.T_NA;
        cost = 60000;
        bv = 0.0;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_ENERGY).or(F_PPC).or(F_INF_SUPPORT);
        infantryDamage = 1.58;
        infantryRange = 5;
        crew = 3;
        introDate = 3070;
        techLevel.put(3070, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3082, TechConstants.T_IS_ADVANCED);
        techLevel.put(3090, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X,RATING_X ,RATING_F ,RATING_E};
        techRating = RATING_E;
        rulesRefs = "273, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3070, 3082, 3090);
        techAdvancement.setTechRating(RATING_E);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_E });
    }
}
