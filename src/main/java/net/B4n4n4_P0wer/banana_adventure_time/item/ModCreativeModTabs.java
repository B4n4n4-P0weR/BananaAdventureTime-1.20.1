package net.B4n4n4_P0wer.banana_adventure_time.item;

import net.B4n4n4_P0wer.banana_adventure_time.BananaAdventureTime;
import net.B4n4n4_P0wer.banana_adventure_time.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BananaAdventureTime.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BANANA_ADVENTURE_TIME_TUB = CREATIVE_MODE_TABS.register("banana_adventure_time_tub",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.banana_adventure_time_tub"))
                    .displayItems((pParameters, pOutput) -> {
                        //Ruby
                        pOutput.accept(ModItems.RUBY.get());

                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());

                        pOutput.accept(ModItems.MARCELINE_AXE.get());
                        pOutput.accept(ModItems.MARCELINE_AXE_GUITAR.get());

                        pOutput.accept(ModItems.ICE_KING_CROWN.get());
                        pOutput.accept(ModItems.EMPTY_ICE_KING_CROWN.get());

                        pOutput.accept(ModItems.SCARLET.get());
                        pOutput.accept(ModItems.ROOT_SWORD.get());
                        pOutput.accept(ModItems.DEMON_BLOOD_SWORD.get());
                        pOutput.accept(ModItems.GRASS_SWORD.get());
                        pOutput.accept(ModItems.FINN_SWORD.get());
                        pOutput.accept(ModItems.CANDY_CANE_SWORD.get());
                        pOutput.accept(ModItems.GRAPE_SWORD.get());

                        pOutput.accept(ModItems.SCARLET_HANDLE.get());
                        pOutput.accept(ModItems.SCARLET_BLADE.get());
                        pOutput.accept(ModItems.EMPTY_DEMON_BLOOD_SWORD.get());
                        pOutput.accept(ModItems.REFUGE_OF_THE_SOUL.get());

                        pOutput.accept(ModItems.SWEET_BERRIES_JUICE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
