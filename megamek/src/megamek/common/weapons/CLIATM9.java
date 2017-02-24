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
 * @author Sebastian Brocks, edited by Greg
 */
public class CLIATM9 extends CLIATMWeapon {

    /**
     * I think i can just assign 1? I don't think SVUIDs conflict with those from other classes
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public CLIATM9() {
        super();
        techLevel.put(3070, TechConstants.T_CLAN_EXPERIMENTAL);
        this.name = "iATM 9";
        this.setInternalName("CLiATM9");
        this.addLookupName("Clan iATM-9");
        this.heat = 6;
        this.rackSize = 9;
        this.minimumRange = 4;
        this.shortRange = 5;
        this.mediumRange = 10;
        this.longRange = 15;
        this.extremeRange = 20;
        this.tonnage = 5.0f;
        this.criticals = 4;
        this.bv = 231; // Ammo BV is 54
        this.cost = 450000;
        this.shortAV = 18;
        this.medAV = 18;
        this.maxRange = RANGE_MED;
        introDate = 3070;
        availRating = new int[]{RATING_X,RATING_X,RATING_F};
        techRating = RATING_F;
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(3070, DATE_NONE, DATE_NONE);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_F, RATING_X });
    }
}
