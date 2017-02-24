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

import megamek.common.TechConstants;
import megamek.common.TechAdvancement;
import megamek.common.WeaponType;

public class CLBAHeavyFlamer extends BAFlamerWeapon {
    /**
     *
     */
    private static final long serialVersionUID = 8041763978361592459L;

    /**
     *
     */
    public CLBAHeavyFlamer() {
        super();
        name = "Heavy Flamer [BA]";
        setInternalName("CLBAHeavyFlamer");
        heat = 5;
        damage = 4;
        infDamageClass = WeaponType.WEAPON_BURST_6D6;
        shortRange = 2;
        mediumRange = 3;
        longRange = 4;
        extremeRange = 6;
        tonnage = .35f;
        criticals = 1;
        bv = 15;
        cost = 11250;
        techRating = RATING_C;
        availRating = new int[] { RATING_X, RATING_X, RATING_E };
        flags = flags.or(F_FLAMER).or(F_ENERGY).or(F_BA_WEAPON)
                .or(F_BURST_FIRE).andNot(F_MECH_WEAPON).andNot(F_TANK_WEAPON).andNot(F_AERO_WEAPON).andNot(F_PROTO_WEAPON);
        introDate = 3073;
        techLevel.put(3073, TechConstants.T_CLAN_ADVANCED);
        techLevel.put(3075, TechConstants.T_CLAN_TW);
        availRating = new int[] { RATING_X ,RATING_X ,RATING_E ,RATING_D};
        techRating = RATING_C;
        rulesRefs = "312, TO";

        techAdvancement.setTechBase(TechAdvancement.TECH_BASE_CLAN);
        techAdvancement.setClanAdvancement(DATE_NONE, 3073, 3075);
        techAdvancement.setTechRating(RATING_C);
        techAdvancement.setAvailability( new int[] { RATING_X, RATING_X, RATING_E, RATING_D });
    }
}
