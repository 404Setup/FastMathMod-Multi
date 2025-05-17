package org.elias.fastmath.mixin;

import net.minecraft.util.Mth;
import org.elias.fastmath.MathUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Mth.class)
public class MathMixin {


	/**
	 * @author Elias
	 * @reason MathUtilSin
	 */
	@Overwrite
	public static float sin(float f) {
		return MathUtil.sinAndCos(f)[0];
	}


	/**
	 * @author Elias
	 * @reason MathUtilCos
	 */
	@Overwrite
	public static float cos(float f) {
		return MathUtil.sinAndCos(f)[1];
	}
}
