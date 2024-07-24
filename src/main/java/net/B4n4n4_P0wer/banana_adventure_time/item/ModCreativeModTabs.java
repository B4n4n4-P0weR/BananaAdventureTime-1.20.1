package net.B4n4n4_P0wer.banana_adventure_time.item;

import net.B4n4n4_P0wer.banana_adventure_time.BananaAdventureTime;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BananaAdventureTime.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BANANA_FOOD_PLUS_TUB = CREATIVE_MODE_TABS.register("banana_food_plus_tub",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.DIAMOND))
                    .title(Component.translatable("creativetab.banana_adventure_time_tub"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Items.DIAMOND);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
