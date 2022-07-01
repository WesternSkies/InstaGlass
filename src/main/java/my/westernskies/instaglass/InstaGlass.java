package my.westernskies.instaglass;


import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

import javax.print.CancelablePrintJob;

public final class InstaGlass extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onPlayerDamageGlass(BlockDamageEvent event) {

        /*
        If the player has an efficiency 5 Netherite/Diamond Pickaxe, and Haste, then make the block instabreak
         */
        if (event.getItemInHand().getType().equals(Material.NETHERITE_PICKAXE) || event.getItemInHand().getType().equals(Material.DIAMOND_PICKAXE) ) {
            if (event.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) >= 5 && event.getPlayer().hasPotionEffect(PotionEffectType.FAST_DIGGING)) {

                if (event.getBlock().getType().equals(Material.GLASS) || event.getBlock().getType().equals(Material.TINTED_GLASS) || event.getBlock().getType().equals(Material.BLACK_STAINED_GLASS) || event.getBlock().getType().equals(Material.GREEN_STAINED_GLASS) || event.getBlock().getType().equals(Material.BLUE_STAINED_GLASS) || event.getBlock().getType().equals(Material.BROWN_STAINED_GLASS) || event.getBlock().getType().equals(Material.CYAN_STAINED_GLASS) || event.getBlock().getType().equals(Material.GRAY_STAINED_GLASS) || event.getBlock().getType().equals(Material.LIGHT_BLUE_STAINED_GLASS) || event.getBlock().getType().equals(Material.LIME_STAINED_GLASS) || event.getBlock().getType().equals(Material.MAGENTA_STAINED_GLASS) || event.getBlock().getType().equals(Material.ORANGE_STAINED_GLASS) || event.getBlock().getType().equals(Material.PINK_STAINED_GLASS) || event.getBlock().getType().equals(Material.PURPLE_STAINED_GLASS) || event.getBlock().getType().equals(Material.RED_STAINED_GLASS) || event.getBlock().getType().equals(Material.WHITE_STAINED_GLASS) || event.getBlock().getType().equals(Material.YELLOW_STAINED_GLASS) || event.getBlock().getType().equals(Material.SEA_LANTERN) || event.getBlock().getType().equals(Material.GLOWSTONE) || event.getBlock().getType().equals(Material.GLASS_PANE) || event.getBlock().getType().equals(Material.BLACK_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.BLUE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.BROWN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.MAGENTA_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.CYAN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.ORANGE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.GRAY_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.GREEN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_BLUE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_GRAY_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIME_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.PINK_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.PURPLE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.RED_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.WHITE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.YELLOW_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_GRAY_STAINED_GLASS)) {
                    event.setInstaBreak(true);
                }

            }
        }

        /*
        If the player has an efficiency 6 or higher pickaxe, then make the block instabreak
         */
        if (event.getItemInHand().getType().equals(Material.NETHERITE_PICKAXE) || event.getItemInHand().getType().equals(Material.DIAMOND_PICKAXE)) {

            if (event.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) >= 6 ){

                if (event.getBlock().getType().equals(Material.GLASS) || event.getBlock().getType().equals(Material.TINTED_GLASS) || event.getBlock().getType().equals(Material.BLACK_STAINED_GLASS) || event.getBlock().getType().equals(Material.GREEN_STAINED_GLASS) || event.getBlock().getType().equals(Material.BLUE_STAINED_GLASS) || event.getBlock().getType().equals(Material.BROWN_STAINED_GLASS) || event.getBlock().getType().equals(Material.CYAN_STAINED_GLASS) || event.getBlock().getType().equals(Material.GRAY_STAINED_GLASS) || event.getBlock().getType().equals(Material.LIGHT_BLUE_STAINED_GLASS) || event.getBlock().getType().equals(Material.LIME_STAINED_GLASS) || event.getBlock().getType().equals(Material.MAGENTA_STAINED_GLASS) || event.getBlock().getType().equals(Material.ORANGE_STAINED_GLASS) || event.getBlock().getType().equals(Material.PINK_STAINED_GLASS) || event.getBlock().getType().equals(Material.PURPLE_STAINED_GLASS) || event.getBlock().getType().equals(Material.RED_STAINED_GLASS) || event.getBlock().getType().equals(Material.WHITE_STAINED_GLASS) || event.getBlock().getType().equals(Material.YELLOW_STAINED_GLASS) || event.getBlock().getType().equals(Material.SEA_LANTERN) || event.getBlock().getType().equals(Material.GLOWSTONE) || event.getBlock().getType().equals(Material.GLASS_PANE) || event.getBlock().getType().equals(Material.BLACK_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.BLUE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.BROWN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.MAGENTA_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.CYAN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.ORANGE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.GRAY_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.GREEN_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_BLUE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_GRAY_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIME_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.PINK_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.PURPLE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.RED_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.WHITE_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.YELLOW_STAINED_GLASS_PANE) || event.getBlock().getType().equals(Material.LIGHT_GRAY_STAINED_GLASS)) {
                    event.setInstaBreak(true);
                }

            }
        }

    }
}
