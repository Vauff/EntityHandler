package me.tehkitti.EntityHandler;

import java.util.List;

import me.tehkitti.EntityHandler.Main;

import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Boat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Item;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.LeashHitch;
import org.bukkit.entity.Minecart;
import org.bukkit.entity.StorageMinecart;
import org.bukkit.entity.Villager;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("deprecation")
public class Main extends JavaPlugin {
	public static String v = "1.0.0";
	public static Main instance;

	@Override
	public void onDisable() {
		System.out.println("[EntityHandler] Version " + v
				+ " of EntityHandler Disabled!");
	}

	@Override
	public void onEnable() {
		Main.instance = this;
		System.out.println("[EntityHandler] Version " + v
				+ " of EntityHandler Enabled!");
		getConfig().options().copyDefaults(true);
		saveConfig();
		this.getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public int xpremovetime = 2;

			public void run() {
				{
					if (xpremovetime != 1) {
						xpremovetime--;
					} else {
						List<World> worlds = getServer().getWorlds();
						List<Entity> EntityList = ((World) worlds)
								.getEntities();

						for (Entity entities : EntityList) {
							if (entities instanceof ExperienceOrb) {
								entities.remove();
							}
							if (entities instanceof Item) {
								entities.remove();
							}
							if (entities instanceof Bat) {
								entities.remove();
							}
							if (entities instanceof Villager) {
								entities.remove();
							}
							if (entities instanceof Boat) {
								entities.remove();
							}
							if (entities instanceof Minecart) {
								entities.remove();
							}
							if (entities instanceof ItemFrame) {
								entities.remove();
							}
							if (entities instanceof StorageMinecart) {
								entities.remove();
							}
							if (entities instanceof Arrow) {
								entities.remove();
							}
							if (entities instanceof LeashHitch) {
								entities.remove();
							}
							if (entities instanceof Egg) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof Firework) {
								entities.remove();
							}
							if (entities instanceof Bat) {
								entities.remove();
							}
							if (entities instanceof Blaze) {
								entities.remove();
							}
							if (entities instanceof CaveSpider) {
								entities.remove();
							}
							if (entities instanceof Chicken) {
								entities.remove();
							}
							if (entities instanceof Cow) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}
							if (entities instanceof FallingBlock) {
								entities.remove();
							}

							xpremovetime = 2;
						}

					}
				}
			}
		}, 0L, 1L);

	}

}
