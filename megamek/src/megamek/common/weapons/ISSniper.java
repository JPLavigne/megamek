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
 * Created on Oct 20, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.AmmoType;
import megamek.common.TechConstants;
import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class ISSniper extends ArtilleryWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -5022670163785084036L;

    /**
     *
     */
    public ISSniper() {
        super();

        name = "Sniper";
        setInternalName("ISSniper");
        addLookupName("ISSniperArtillery");
        addLookupName("IS Sniper");
        flags = flags.or(F_AERO_WEAPON);
        heat = 10;
        rackSize = 20;
        ammoType = AmmoType.T_SNIPER;
        shortRange = 1;
        mediumRange = 2;
        longRange = 18;
        extremeRange = 18; // No extreme range.
        tonnage = 20f;
        criticals = 20;
        bv = 85;
        cost = 300000;
        introDate = 1950;
        techLevel.put(1950, TechConstants.T_IS_ADVANCED);
        availRating = new int[] { RATING_C ,RATING_C ,RATING_C ,RATING_C};
        techRating = RATING_B;
        rulesRefs = "284, TO";

        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(DATE_NONE, 1950, DATE_NONE);
        techAdvancement.setTechRating(RATING_B);
        techAdvancement.setAvailability( new int[] { RATING_C, RATING_C, RATING_C, RATING_C });
    }

}
