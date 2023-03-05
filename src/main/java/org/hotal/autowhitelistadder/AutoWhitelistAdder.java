package org.hotal.autowhitelistadder;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AutoWhitelistAdder extends JavaPlugin implements Listener {

    public void onEnable() {
        // Pluginが有効になったときに呼び出される処理
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable() {
        // Pluginが無効になったときに呼び出される処理
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.isWhitelisted()) {
            player.setWhitelisted(true);
            Bukkit.broadcastMessage(ChatColor.GREEN + player.getName() + "がホワイトリストに追加されました。");
        }
    }
}

