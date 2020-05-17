package de.sprax2013.betterchairs;

import org.bukkit.entity.ArmorStand;

public class ChairUtils {
    /**
     * <ul>
     *  <li>{@link ArmorStand#hasGravity()} = {@code false}</li>
     *  <li>{@link ArmorStand#isVisible()} = {@code false}</li>
     *  <li>{@link ArmorStand#getRemoveWhenFarAway()} = {@code true}</li>
     * </ul>
     */
    public static void applyBasicChairModifications(ArmorStand armorStand) {
        armorStand.setGravity(false);
        armorStand.setVisible(false);

        // Chairs should always be removed... But just in case
        armorStand.setRemoveWhenFarAway(true);
    }
}