package com.hikaru0721.antipluginlist;

import org.bukkit.Bukkit;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Anti Plugin List plugin for Bukkit.
 * @author HIKARU0721
 */
public class AntiPluginList extends JavaPlugin {
    private static AntiPluginList instance;
    
    /**
     * Called when enable the plugin.
     */
    @Override
    public void onEnable() {
        // Initialization of variables
        instance = this;
        
        // Register the permissions
        this.setupPermissions();
    }
    
    /**
     * Setup the permissions.
     */
    private void setupPermissions() {
        PluginManager pm = Bukkit.getServer().getPluginManager();
        
        pm.addPermission(new Permission("bukkit.command.help", PermissionDefault.OP));
        pm.addPermission(new Permission("bukkit.command.plugins", PermissionDefault.OP));
        pm.addPermission(new Permission("bukkit.command.version", PermissionDefault.OP));
    }
    
    /**
     * Get the current instance of this class.
     * @return instance
     */
    public static AntiPluginList getInstance() {
        return instance;
    }
}