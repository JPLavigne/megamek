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
 * Created on Sep 24, 2004
 *
 */
package megamek.common.weapons.battlearmor;

import megamek.common.AmmoType;
import megamek.common.TechConstants;
import megamek.common.TechAdvancement;
import megamek.common.WeaponType;
import megamek.common.weapons.Weapon;

/**
 * @author Andrew Hunter
 */
public class CLBAMediumRecoillessRifle extends Weapon {
    /**
     *
     */
    private static final long serialVersionUID = -8244299318168866609L;

    /**
     *
     */
    public CLBAMediumRecoillessRifle() {
        super();
        name = "Recoilless Rifle (Medium)";
        setInternalName("CLBAMedium Recoilless Rifle");
        addLookupName("CLBAMedium Recoilless Rifle");
        addLookupName("CLBAMediumRecoillessRifle");
        heat = 0;
        damage = 3;
        infDamageClass = WeaponType.WEAPON_BURST_2D6;
        ammoType = AmmoType.T_NA;
        shortRange = 2;
        mediumRange = 4;
        longRange = 6;
        extremeRange = 8;
        tonnage = 0.25f;
        criticals = 2;
        bv = 19;
        flags = flags.or(F_NO_FIRES).or(F_DIRECT_FIRE).or(F_BALLISTIC).or(F_BA_WEAPON).or(F_BURST_FIRE).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        cost = 3000;
        introDate = 3057;
        techLevel.put(3057, TechConstants.T_CLAN_ADVANCED);
        techLevel.put(3056, TechConstants.T_CLAN_TW);
        availRating = new int[] { RATING_X ,RATING_X ,RATING_D ,RATING_D};
        techRating = RATING_C;
        rulesRefs = "268, TM";
        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(DATE_NONE, 3057, DATE_NONE);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_D, RATING_D });
    }

}
