package vorquel.mod.networktest.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vorquel.mod.networktest.NetworkTest;

public class HandlerNet3 implements IMessageHandler<MessageNet3, IMessage> {
    @Override
    public IMessage onMessage(MessageNet3 message, MessageContext ctx) {
        NetworkTest.proxy.say("Net3 says hello.");
        return null;
    }
}
