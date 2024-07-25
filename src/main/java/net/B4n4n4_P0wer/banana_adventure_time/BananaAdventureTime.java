package net.B4n4n4_P0wer.banana_adventure_time;

import com.mojang.logging.LogUtils;
import net.B4n4n4_P0wer.banana_adventure_time.block.ModBlocks;
import net.B4n4n4_P0wer.banana_adventure_time.item.ModCreativeModTabs;
import net.B4n4n4_P0wer.banana_adventure_time.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(BananaAdventureTime.MOD_ID)
public class BananaAdventureTime
{
    public static final String MOD_ID = "banana_adventure_time";
    private static final Logger LOGGER = LogUtils.getLogger();


    public BananaAdventureTime()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.COME_ALONG_WITH_ME);

        }
    }

//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event) {

//    }

//    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//    public static class ClientModEvents {
//        @SubscribeEvent
//        public static void onClientSetup(FMLClientSetupEvent event) {

//        }
//    }
}
