package com.maks.service;

public class IdGeneratorImpl implements IdGenerator{
    private static int lastFreeId = 0;
    private String lastid;
    @Override
    public String generateId() {
        lastid =""+ lastFreeId++;
        return lastid;
    }
}
