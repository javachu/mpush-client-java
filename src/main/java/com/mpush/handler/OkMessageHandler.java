package com.mpush.handler;


import com.mpush.api.connection.Connection;
import com.mpush.api.protocol.Packet;
import com.mpush.message.OkMessage;
import com.mpush.api.Logger;
import com.mpush.client.ClientConfig;

/**
 * Created by ohun on 2015/12/30.
 */
public final class OkMessageHandler extends BaseMessageHandler<OkMessage> {
    private final Logger logger = ClientConfig.I.getLogger();

    @Override
    public OkMessage decode(Packet packet, Connection connection) {
        return new OkMessage(packet, connection);
    }

    @Override
    public void handle(OkMessage message) {
        logger.w("<<< receive an ok message=%s", message);
    }
}