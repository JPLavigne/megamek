/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
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
package megamek.common.weapons;

import megamek.common.TechConstants;
import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class ISLRT5OS extends LRTWeapon {

    /**
     *
     */
    private static final long serialVersionUID = -7475019239065402296L;

    /**
     *
     */
    public ISLRT5OS() {
        super();

        name = "LRT 5 (OS)";
        setInternalName(name);
        addLookupName("IS OS LRT-5");
        addLookupName("ISLRTorpedo5 (OS)");
        addLookupName("IS LRT 5 (OS)");
        heat = 2;
        rackSize = 5;
        minimumRange = 6;
        waterShortRange = 7;
        waterMediumRange = 14;
        waterLongRange = 21;
        waterExtremeRange = 28;
        tonnage = 2.5f;
        criticals = 1;
        bv = 9;
        flags = flags.or(F_ONESHOT);
        cost = 15000;
        introDate = 2660;
        extinctDate = 2800;
        reintroDate = 3030;
        techLevel.put(2660, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(2676, TechConstants.T_IS_ADVANCED);
        techLevel.put(3045, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_C ,RATING_C ,RATING_C ,RATING_C};
        techRating = RATING_C;
        rulesRefs = "229, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(2660, 2676, 3045, 2800, 3030);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_C, RATING_C, RATING_C, RATING_C });
    }
}
