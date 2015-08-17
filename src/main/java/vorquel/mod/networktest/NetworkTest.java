package vorquel.mod.networktest;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vorquel.mod.networktest.helper.Ref;
import vorquel.mod.networktest.proxy.Proxy;

@Mod(modid = Ref.MOD_ID, name = "Network Test", version = "@MOD_VERSION@")
public class NetworkTest {

    @Mod.Instance(Ref.MOD_ID)
    @SuppressWarnings("unused")
    public static NetworkTest instance;

    @SidedProxy(serverSide = "vorquel.mod.networktest.proxy.Proxy", clientSide = "vorquel.mod.networktest.proxy.ProxyClient")
    public static Proxy proxy;

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }

    @Mod.EventHandler
    @SuppressWarnings("unused")
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit();
    }
}
