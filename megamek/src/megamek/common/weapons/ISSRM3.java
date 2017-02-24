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
public class ISSRM3 extends SRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 8732407650030864483L;

    /**
     *
     */
    public ISSRM3() {
        super();
        techLevel.put(3071, TechConstants.T_IS_TW_NON_BOX);
        name = "SRM 3";
        setInternalName(name);
        addLookupName("IS SRM-3");
        addLookupName("ISSRM3");
        addLookupName("IS SRM 3");
        rackSize = 3;
        shortRange = 3;
        mediumRange = 6;
        longRange = 9;
        extremeRange = 12;
        bv = 30;
        flags = flags.or(F_NO_FIRES);
        introDate = 3050;
        techLevel.put(3050, techLevel.get(3071));
        availRating = new int[] { RATING_X, RATING_X, RATING_D };
        techRating = RATING_E;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(DATE_NONE, DATE_NONE, 3050);
        techAdvancement.setTechRating(RATING_E);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_D, RATING_X });
    }
}
