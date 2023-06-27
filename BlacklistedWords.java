import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.entity.Player;

public final class Plugin extends JavaPlugin implements Listener{

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();

        if (message.toLowerCase().contains("shit") || message.toLowerCase().contains("idiot") ||
                message.toLowerCase().contains("fuck")) {
            event.setCancelled(true);
            player.sendMessage("You cannot say that word!");
        }
    }

}