package cx.rain.mc.meowmarriage;

import org.bukkit.plugin.java.JavaPlugin;

public final class Marriage extends JavaPlugin {
    private static Marriage INSTANCE = null;

    public Marriage() {
        if (INSTANCE != null) {
            throw new RuntimeException("Do not re-init me.");
        }

        INSTANCE = this;
    }

    public static Marriage getInstance() {
        return INSTANCE;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
