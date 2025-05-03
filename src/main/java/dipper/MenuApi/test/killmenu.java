package dipper.MenuApi.test;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import dipper.MenuApi.menu.SimpleMenu;

public class killmenu extends SimpleMenu{
    public killmenu() {
        super(Rows.THREE, "Kill Menu");
    }



    @Override
    public void onSetItem() {
        final ItemStack killitem = new ItemStack(Material.REDSTONE_BLOCK); // Example item, replace with your own
        final ItemMeta meta = killitem.getItemMeta();
        meta.setDisplayName("Kill Item");
        killitem.setItemMeta(meta);

        setItem(13, killitem, player -> player.setHealth(0)); // Set item in slot 13 to null and kill the player
        //excute when player click the item
    }
}
