package it.mrbackslash.mavengittest;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public class MavenGitTest extends JavaPlugin {
    @Override
    public void onEnable(){
        getLogger().info("THE PLUGIN JUST GOT ENABLED! IT WORKS!");
    }
    @Override
    public void onDisable(){
        getLogger().info("Disabling MavenGitTest!");
    }
}
