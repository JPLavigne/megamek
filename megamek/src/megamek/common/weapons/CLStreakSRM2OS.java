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
public class CLStreakSRM2OS extends StreakSRMWeapon {

    /**
     *
     */
    private static final long serialVersionUID = 2219171972794110915L;

    /**
     *
     */
    public CLStreakSRM2OS() {

        name = "Streak SRM 2 (OS)";
        setInternalName("CLStreakSRM2 (OS)");
        addLookupName("Clan OS Streak SRM-2");
        addLookupName("Clan Streak SRM 2 (OS)");
        heat = 2;
        rackSize = 2;
        shortRange = 4;
        mediumRange = 8;
        longRange = 12;
        extremeRange = 16;
        tonnage = 1.5f;
        criticals = 1;
        flags = flags.or(F_NO_FIRES).or(F_ONESHOT);
        bv = 8;
        cost = 7500;
        shortAV = 4;
        medAV = 4;
        introDate = 2817;
        techLevel.put(2817, TechConstants.T_CLAN_EXPERIMENTAL);   ///EXP
        techLevel.put(2819, TechConstants.T_CLAN_ADVANCED);   ///ADV
        techLevel.put(2830, TechConstants.T_CLAN_TW);   ///COMMON
        availRating = new int[] { RATING_X, RATING_D, RATING_D, RATING_D };
        techRating = RATING_F;
        rulesRefs = "230, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(2817, 2819, 2830);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_D, RATING_D, RATING_D });
    }
}
