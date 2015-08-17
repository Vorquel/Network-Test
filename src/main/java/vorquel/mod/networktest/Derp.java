package vorquel.mod.networktest;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import vorquel.mod.networktest.helper.Ref;
import vorquel.mod.networktest.network.HandlerNet2;
import vorquel.mod.networktest.network.HandlerNet3;
import vorquel.mod.networktest.network.MessageNet2;
import vorquel.mod.networktest.network.MessageNet3;
import vorquel.mod.networktest.proxy.Proxy;

@Mod(modid = "Derp", name = "Derp", version = "1.0", dependencies = "before:NetworkTest")
public class Derp {

    public static SimpleNetworkWrapper net3;

    @Mod.Instance("Derp")
    @SuppressWarnings("unused")
    public static Derp instance;

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void preInit(FMLPreInitializationEvent event) {
        net3 = NetworkRegistry.INSTANCE.newSimpleChannel("test");
        net3.registerMessage(HandlerNet3.class, MessageNet3.class, 0, Side.CLIENT);
    }
}
