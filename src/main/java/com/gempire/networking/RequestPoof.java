package com.gempire.networking;

import com.gempire.entities.bases.EntityGem;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class RequestPoof {
    public final int entityID;

    public RequestPoof(int entityID) {
        this.entityID = entityID;
    }

    public static RequestPoof decode(FriendlyByteBuf data) {
        return new RequestPoof(data.readInt());
    }

    public static void encode(RequestPoof msg, FriendlyByteBuf buffer) {
        buffer.writeInt(msg.entityID);
    }

    public static void handle(final RequestPoof msg, final Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context ctx = contextSupplier.get();
        ServerPlayer sender = ctx.getSender();
        boolean hasPermission = true;
        if (hasPermission) {
            ctx.enqueueWork(() -> {
                if (sender != null ) {
                    EntityGem gem = (EntityGem) sender.level().getEntity(msg.entityID);
                    if (gem != null) {
                        gem.poofed = true;
                        gem.hurt(gem.damageSources().magic(), gem.getMaxHealth() * 20);
                        gem.setCracked(false);
                        gem.setShatter(false);
                    }
                }
            });
            ctx.setPacketHandled(true);
        }
    }
}
