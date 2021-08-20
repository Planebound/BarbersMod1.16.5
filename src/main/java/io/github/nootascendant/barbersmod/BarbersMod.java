package io.github.nootascendant.barbersmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.nootascendant.barbersmod.core.init.BlockInit;
import io.github.nootascendant.barbersmod.core.init.ItemInit;
import io.github.nootascendant.barbersmod.world.OreGeneration;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BarbersMod.MOD_ID)
public class BarbersMod
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "barbersmod";
    public static final ItemGroup BARBERS_MOD_GROUP = new BarbersModGroup("barbersmodtab");

    public BarbersMod() {
    	IEventBus bus =FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }
    
    public static class BarbersModGroup extends ItemGroup {

		public BarbersModGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack makeIcon() {
			return ItemInit.BARBRO_CRYSTALS.get().getDefaultInstance();
		}
    }
}
