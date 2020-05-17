package nms.v1_14_R1;

import net.blackscarx.betterchairs.NMS;
import net.minecraft.server.v1_14_R1.EntityArmorStand;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftArmorStand;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class v1_14_R1 implements NMS {
    @Override
    public String getVersion() {
        return "v1_14_R1";
    }

    @Override
    public ArmorStand spawn(Location loc, Player p) {
        return CustomArmorStand_14_R1.spawn(loc, p);
    }

    @Override
    public void kill(ArmorStand armorStand) {
        EntityArmorStand nmsArmor = ((CraftArmorStand) armorStand).getHandle();
        ((CustomArmorStand_14_R1) nmsArmor).killArmorStand();
    }

    @Override
    public boolean check(ArmorStand armorStand) {
        return ((CraftArmorStand) armorStand).getHandle() instanceof CustomArmorStand_14_R1;
    }

    @Override
    public boolean isStair(Block b) {
        return false;
    }

}
