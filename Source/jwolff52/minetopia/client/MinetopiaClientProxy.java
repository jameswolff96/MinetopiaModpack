package jwolff52.minetopia.client;

import jwolff52.minetopia.MinetopiaCommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class MinetopiaClientProxy extends MinetopiaCommonProxy {

	@Override
	public void registerRenderThings(){
		MinecraftForgeClient.preloadTexture("/spritesheet.png");
	}
}
