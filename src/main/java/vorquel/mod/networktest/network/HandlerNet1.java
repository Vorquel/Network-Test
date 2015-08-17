package vorquel.mod.networktest.network;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import vorquel.mod.networktest.NetworkTest;

public class HandlerNet1 implements IMessageHandler<MessageNet1, IMessage> {
    @Override
    public IMessage onMessage(MessageNet1 message, MessageContext ctx) {
        NetworkTest.proxy.say("Net1 says hello.");
        return null;
    }
}
