package dipper.MenuApi;

import org.bukkit.plugin.java.JavaPlugin;

import dipper.MenuApi.listeners.InventoryListener;
import dipper.MenuApi.test.killcommand;

public final class MenuApi extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new InventoryListener(), this);
        getCommand("kill").setExecutor(new killcommand());
    }
}