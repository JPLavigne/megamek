/**
 * MegaMek - Copyright (C) 2005 Ben Mazur (bmazur@sev.org)
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 */
package megamek.common.weapons;

import megamek.common.TechConstants;
import megamek.common.TechAdvancement;

/**
 * @author Sebastian Brocks
 */
public class ISMRM40IOS extends MRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 5383621160269655212L;

    /**
     *
     */
    public ISMRM40IOS() {
        super();

        name = "MRM 40 (I-OS)";
        setInternalName(name);
        addLookupName("IOS MRM-40");
        addLookupName("ISMRM40 (IOS)");
        addLookupName("IS MRM 40 (IOS)");
        heat = 12;
        rackSize = 40;
        shortRange = 3;
        mediumRange = 8;
        longRange = 15;
        extremeRange = 16;
        tonnage = 11.5f;
        criticals = 7;
        bv = 49;
        flags = flags.or(F_ONESHOT);
        cost = 280000;
        shortAV = 24;
        medAV = 24;
        maxRange = RANGE_MED;
        introDate = 3056;
        techLevel.put(3056, TechConstants.T_IS_EXPERIMENTAL);
        techLevel.put(3076, TechConstants.T_IS_ADVANCED);
        techLevel.put(3085, TechConstants.T_IS_TW_NON_BOX);
        availRating = new int[] { RATING_X ,RATING_X ,RATING_E ,RATING_D};
        techRating = RATING_C;
        rulesRefs = "327, TO";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(3056, 3076, 3085);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_E, RATING_D });
    }
}
