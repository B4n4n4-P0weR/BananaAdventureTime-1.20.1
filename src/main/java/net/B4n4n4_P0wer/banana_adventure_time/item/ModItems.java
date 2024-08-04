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
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MARCELINE_AXE  = ITEMS.register("marceline_axe",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MARCELINE_AXE_GUITAR  = ITEMS.register("marceline_axe_guitar",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> ICE_KING_CROWN  = ITEMS.register("ice_king_crown",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EMPTY_ICE_KING_CROWN  = ITEMS.register("empty_ice_king_crown",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> SCARLET  = ITEMS.register("scarlet",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROOT_SWORD  = ITEMS.register("root_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEMON_BLOOD_SWORD  = ITEMS.register("demon_blood_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRASS_SWORD  = ITEMS.register("grass_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FINN_SWORD  = ITEMS.register("finn_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CANDY_CANE_SWORD  = ITEMS.register("candy_cane_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRAPE_SWORD  = ITEMS.register("grape_sword",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SCARLET_HANDLE  = ITEMS.register("scarlet_handle",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SCARLET_BLADE  = ITEMS.register("scarlet_blade",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> EMPTY_DEMON_BLOOD_SWORD  = ITEMS.register("empty_demon_blood_sword",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> REFUGE_OF_THE_SOUL  = ITEMS.register("refuge_of_the_soul",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SWEET_BERRIES_JUICE  = ITEMS.register("sweet_berries_juice",
            () -> new Item(new Item.Properties().stacksTo(64)));


    public static final RegistryObject<Item> COME_ALONG_WITH_ME  = ITEMS.register("come_along_with_me",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
