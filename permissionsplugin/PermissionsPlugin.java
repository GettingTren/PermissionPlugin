package me.ilgroggo.permissionsplugin;

import me.ilgroggo.permissionsplugin.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PermissionsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
    }
}
