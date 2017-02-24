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
import megamek.common.WeaponType;

/**
 * @author Andrew Hunter
 */
public class CLLightMG extends MGWeapon {

    /**
     * 
     */
    private static final long serialVersionUID = 4070411380374344272L;

    /**
     * 
     */
    public CLLightMG() {
        super();

        this.name = "Light Machine Gun";
        this.setInternalName("CLLightMG");
        this.addLookupName("Clan Light Machine Gun");
        this.heat = 0;
        this.damage = 1;
        this.infDamageClass = WeaponType.WEAPON_BURST_1D6;
        this.rackSize = 1;
        this.ammoType = AmmoType.T_MG_LIGHT;
        this.shortRange = 2;
        this.mediumRange = 4;
        this.longRange = 6;
        this.extremeRange = 8;
        this.tonnage = 0.25f;
        this.criticals = 1;
        this.bv = 5;
        this.cost = 5000;
        this.shortAV = 1;
        this.maxRange = RANGE_SHORT;
        this.atClass = CLASS_AC;
        introDate = 3050;
        techLevel.put(3050, TechConstants.T_CLAN_EXPERIMENTAL);
        techLevel.put(3060, TechConstants.T_CLAN_ADVANCED);
        techLevel.put(3070, TechConstants.T_CLAN_TW);
        availRating = new int[] { RATING_X,RATING_X ,RATING_C ,RATING_B};
        techRating = RATING_C;
        rulesRefs = "228, TM";

        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(3050, 3060, 3070);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_C, RATING_B });
    }

}
