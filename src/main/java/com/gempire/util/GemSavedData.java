package com.gempire.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.saveddata.SavedData;

import java.util.ArrayList;

public class GemSavedData extends SavedData {

    private ArrayList<Integer> gemIDs = new ArrayList<>();

    public ArrayList<Integer> getGemData() {
        return this.gemIDs;
    }

    public void addToGemData(int id) {
        gemIDs.add(id);
        this.setDirty();
    }


    public static GemSavedData create() {
        return new GemSavedData();
    }

    public static GemSavedData load(CompoundTag tag) {
        GemSavedData data = create();
        ArrayList<Integer> gemIDs = new ArrayList<>();
        int[] list = tag.getIntArray("ids");
        for (int a : list) {
            gemIDs.add(a);
        }
        data.gemIDs = gemIDs;
        return data;
    }
    @Override
    public CompoundTag save(CompoundTag compoundTag) {
        compoundTag.putIntArray("ids", gemIDs);
        return compoundTag;
    }

    public static GemSavedData getData(MinecraftServer server) {
        return server.overworld().getDataStorage().computeIfAbsent(GemSavedData::load, GemSavedData::create, "gems");
    }
}
