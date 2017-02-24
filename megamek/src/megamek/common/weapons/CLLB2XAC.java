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
 * Created on Oct 15, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.TechConstants;
import megamek.common.TechAdvancement;

/**
 * @author Andrew Hunter
 */
public class CLLB2XAC extends LBXACWeapon {
    /**
     * 
     */
    private static final long serialVersionUID = -2333780992130250932L;

    /**
     * 
     */
    public CLLB2XAC() {
        super();

        this.name = "LB 2-X AC";
        this.setInternalName("CLLBXAC2");
        this.addLookupName("Clan LB 2-X AC");
        this.heat = 1;
        this.damage = 2;
        this.rackSize = 2;
        this.minimumRange = 4;
        this.shortRange = 10;
        this.mediumRange = 20;
        this.longRange = 30;
        this.extremeRange = 40;
        this.tonnage = 5.0f;
        this.criticals = 3;
        this.bv = 47;
        this.cost = 150000;
        this.shortAV = 2;
        this.medAV = 2;
        this.longAV = 2;
        this.extAV = 2;
        this.maxRange = RANGE_EXT;
        introDate = 2819;
        techLevel.put(2819, TechConstants.T_CLAN_EXPERIMENTAL);   ///EXP
        techLevel.put(2821, TechConstants.T_CLAN_ADVANCED);   ///ADV
        techLevel.put(2828, TechConstants.T_CLAN_TW);   ///COMMON
        availRating = new int[] { RATING_X, RATING_D, RATING_C, RATING_B };
        techRating = RATING_F;
        rulesRefs = "207, TM";

        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(2819, 2821, 2828);
        techAdvancement.setTechRating(RATING_F);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_D, RATING_C, RATING_B });
    }
}
