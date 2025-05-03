package dipper.MenuApi.menu;

import java.util.function.Consumer;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public interface Menu extends InventoryHolder{
    void click(Player player, int slot);

    void setItem(int slot, ItemStack item);

    void setItem(int slot, ItemStack item, Consumer<Player> consumer);

    void onSetItem();

    default void open(Player player) {
        onSetItem();
        player.openInventory(getInventory());
    }
}
