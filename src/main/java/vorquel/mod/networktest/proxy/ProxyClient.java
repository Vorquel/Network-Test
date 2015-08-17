package vorquel.mod.networktest.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

@SuppressWarnings("unused")
public class ProxyClient extends Proxy {
    @Override
    public void say(String string) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(string));
    }
}
