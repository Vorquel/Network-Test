package vorquel.mod.networktest.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vorquel.mod.networktest.NetworkTest;

public class HandlerNet2 implements IMessageHandler<MessageNet2, IMessage> {
    @Override
    public IMessage onMessage(MessageNet2 message, MessageContext ctx) {
        NetworkTest.proxy.say("Net2 says hello.");
        return null;
    }
}
