# 
#  A MegaMek Scenario file
#
# Future features for the scenario language
#    Alternate victory conditions
#    Staggered entry (reinforcements)
#    Specified critical slot damage
#

# Versionstamp required to be recognized as a Scenario file
MMSVersion=1

# Name of the scenario
Name=Broken Arrow

# Scenario description
Description=A Lance of Strike Mechs must take down a heavily damaged Assault and its escort

# Size of the map in mapboards
BoardWidth=2
BoardHeight=1

# Maps can be specified by name.  The order is left-to-right, top-to-bottom
# Any unspecified boards will be set to RANDOM
Maps=RANDOM

# Faction list
# The player name used to log into the server MUST match this name to play as that faction
#
Factions=Strike,Assault

# Faction location
# Determines deployment area
# Valid values are Any,N,NE,E,SE,S,SW,W,NW
Location_Strike=W
Location_Assault=E


# Mechlist for each faction
#
# Units are constructed as Unit_<faction name>_<#>, where the faction name 
# matches the one listed in the Faction property and the # is a sequential 
# numbering starting at 1.  If there is a gap in the numbering, any units after
# the gap will be ignored.
#

# The format is MechRef,PilotName,PilotGunnery,PilotPiloting

Unit_Strike_1=Wraith TR1,X,3,4
Unit_Strike_2=Venom SDR-9KA,X,4,3
Unit_Strike_3=Griffin GRF-3M,X,3,4
Unit_Strike_4=Nightsky NGS-4S,X,4,4

Unit_Assault_1=Kingfisher Prime,X,3,3
Unit_Assault_2=Stalking Spider SSR,X,4,5
Unit_Assault_3=Stalking Spider SSR,X,4,5

# To initially damage units, you can use a unit armor property, which specifies
# armor and internal values.  Values above the unit's nominal value for that location
# will be ignored.  
# Armor is specified in this order: 
# H,CT,CTR,RT,RTR,LT,LTR,RA,LA,RL,LL,HI,CTI,RTI,LTI,RAI,LAI,RLI,LLI
# Here's an example:
#
# Unit_Kurita_1_Armor=0,30,19,24,20,24,10,24,24,33,33,1,25,17,17,13,13,17,17
#
# Alternately, if you want more random damage, and want to allow critical damage
# before the game starts, you can use a unit damage property, which specifies a
# number of blocks of 5 damage that will be randomly applied to the unit using
# the standard hit chart.  Any internal and critical hits will be resolved normally.
# Warning: this can result in the unit being destroyed before the game begins.
Unit_Assault_1_Damage=12




