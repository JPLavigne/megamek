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
public class InfantryRifleISGyrojetWeapon extends InfantryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -3164871600230559641L;

    public InfantryRifleISGyrojetWeapon() {
        super();

        name = "Gyrojet Rifle";
        setInternalName(name);
        addLookupName("InfantryGyrojetRifle");
        ammoType = AmmoType.T_NA;
        cost = 1000;
        bv =  1.07;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC);
        infantryDamage = 0.35;
        infantryRange = 1;
        introDate = 2530;
        techLevel.put(2530, TechConstants.T_CLAN_EXPERIMENTAL);
        techLevel.put(2540, TechConstants.T_CLAN_ADVANCED);
        techLevel.put(2570, TechConstants.T_CLAN_TW);
        availRating = new int[] { RATING_C,RATING_C ,RATING_B ,RATING_B};
        techRating = RATING_F;
        rulesRefs = "273, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(2530, 2540, 2570);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_C, RATING_C, RATING_B, RATING_B });
    }
}
