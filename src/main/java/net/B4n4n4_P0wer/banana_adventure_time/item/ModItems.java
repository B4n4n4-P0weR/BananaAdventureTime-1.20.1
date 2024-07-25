package net.B4n4n4_P0wer.banana_adventure_time.item;

import net.B4n4n4_P0wer.banana_adventure_time.BananaAdventureTime;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BananaAdventureTime.MOD_ID);

    public static final RegistryObject<Item> RUBY  = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COME_ALONG_WITH_ME  = ITEMS.register("come_along_with_me",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
