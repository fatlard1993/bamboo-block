package justfatlard.bamboo_block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BambooBlock implements ModInitializer {
    public static final Block BAMBOO_BLOCK = new Block(FabricBlockSettings.of(Material.BAMBOO).sounds(BlockSoundGroup.BAMBOO).strength(0.6F, 16F).build());

    @Override
    public void onInitialize(){
        Registry.register(Registry.BLOCK, new Identifier("bamboo-block-justfatlard", "bamboo_block"), BAMBOO_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("bamboo-block-justfatlard", "bamboo_block"), new BlockItem(BAMBOO_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }
}