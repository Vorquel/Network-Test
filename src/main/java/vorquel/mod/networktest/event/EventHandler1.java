package vorquel.mod.networktest.event;

import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vorquel.mod.networktest.Derp;
import vorquel.mod.networktest.helper.Ref;
import vorquel.mod.networktest.network.MessageNet1;
import vorquel.mod.networktest.network.MessageNet2;
import vorquel.mod.networktest.network.MessageNet3;

public class EventHandler1 {
    @SubscribeEvent
    public void onEvent(ServerChatEvent event) {
        event.setCanceled(true);
        Ref.net1.sendToAll(new MessageNet1());
        Ref.net2.sendToAll(new MessageNet2());
        Derp.net3.sendToAll(new MessageNet3());
    }
}
