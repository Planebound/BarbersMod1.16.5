package io.github.nootascendant.barbersmod.common.items;

import java.util.List;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SummoningTotem extends Item {

	public SummoningTotem(Properties p_i48487_1_) {
		super(p_i48487_1_);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack p_77624_1_, World p_77624_2_, List<ITextComponent> p_77624_3_,
			ITooltipFlag p_77624_4_) {
		super.appendHoverText(p_77624_1_, p_77624_2_, p_77624_3_, p_77624_4_);
		if(Screen.hasShiftDown()) {
			p_77624_3_.add(new TranslationTextComponent("tooltip.barbersmod.summoning_totem.shift"));
		}
		else {
			p_77624_3_.add(new TranslationTextComponent("tooltip.barbersmod.hold_shift"));
		}
	}
	
	@Override
	public ActionResult<ItemStack> use(World p_77659_1_, PlayerEntity p_77659_2_, Hand p_77659_3_) {
		int min = -5; int max = 5; int nearby = (int)Math.floor(Math.random()*(max-min+1)+min);
		ZombieEntity entity = new ZombieEntity(p_77659_1_);
		entity.setPos(p_77659_2_.getX() + nearby, p_77659_2_.getY(), p_77659_2_.getZ() + nearby);
		p_77659_1_.addFreshEntity(entity);
		return ActionResult.success(ItemStack.EMPTY);
	}
}
