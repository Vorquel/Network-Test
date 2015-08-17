package vorquel.mod.networktest.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import vorquel.mod.networktest.event.EventHandler1;
import vorquel.mod.networktest.helper.Log;
import vorquel.mod.networktest.helper.Ref;
import vorquel.mod.networktest.network.HandlerNet1;
import vorquel.mod.networktest.network.HandlerNet2;
import vorquel.mod.networktest.network.MessageNet1;
import vorquel.mod.networktest.network.MessageNet2;

public class Proxy {

    public void preInit(FMLPreInitializationEvent event) {
        Log.setLogger(event.getModLog());
        Ref.net1 = NetworkRegistry.INSTANCE.newSimpleChannel("test");
        Ref.net2 = NetworkRegistry.INSTANCE.newSimpleChannel("test");
        Ref.net1.registerMessage(HandlerNet1.class, MessageNet1.class, 0, Side.CLIENT);
        Ref.net2.registerMessage(HandlerNet2.class, MessageNet2.class, 0, Side.CLIENT);
    }

    public void init() {
        MinecraftForge.EVENT_BUS.register(new EventHandler1());
    }

    public void postInit() {}

    public void say(String string) {}
}
