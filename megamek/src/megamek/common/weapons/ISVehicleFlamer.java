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
/*
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons;

import megamek.common.TechConstants;
import megamek.common.TechAdvancement;
import megamek.common.WeaponType;

/**
 * @author Sebastian Brocks
 */
public class ISVehicleFlamer extends VehicleFlamerWeapon {
    /**
     * 
     */
    private static final long serialVersionUID = -5209851790302913451L;

    /**
     * 
     */
    public ISVehicleFlamer() {
        super();

        this.name = "Vehicle Flamer";
        this.setInternalName(this.name);
        this.addLookupName("IS Vehicle Flamer");
        this.addLookupName("ISVehicleFlamer");
        this.heat = 3;
        this.damage = 2;
        this.infDamageClass = WeaponType.WEAPON_BURST_4D6;
        this.rackSize = 2;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 3;
        this.extremeRange = 4;
        this.tonnage = 0.5f;
        this.criticals = 1;
        this.bv = 5;
        this.cost = 7500;
        this.shortAV = 2;
        this.maxRange = RANGE_SHORT;
        introDate = 1950;
        techLevel.put(1950, TechConstants.T_INTRO_BOXSET);
        availRating = new int[] { RATING_B ,RATING_B ,RATING_B ,RATING_A};
        techRating = RATING_C;
        rulesRefs = "218, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_IS);
        techAdvancement.setISAdvancement(DATE_NONE, DATE_NONE, 1950);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_B, RATING_B, RATING_B, RATING_A });
    }
}
