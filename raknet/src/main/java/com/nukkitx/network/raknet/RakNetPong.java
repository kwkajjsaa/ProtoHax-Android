// Generated by delombok at Mon Nov 28 21:50:33 CST 2022
package com.nukkitx.network.raknet;

public class RakNetPong {
    private final long pingTime;
    private final long pongTime;
    private final long guid;
    private final byte[] userData;

    @java.lang.SuppressWarnings("all")
    public long getPingTime() {
        return this.pingTime;
    }

    @java.lang.SuppressWarnings("all")
    public long getPongTime() {
        return this.pongTime;
    }

    @java.lang.SuppressWarnings("all")
    public long getGuid() {
        return this.guid;
    }

    @java.lang.SuppressWarnings("all")
    public byte[] getUserData() {
        return this.userData;
    }

    @java.lang.SuppressWarnings("all")
    public RakNetPong(final long pingTime, final long pongTime, final long guid, final byte[] userData) {
        this.pingTime = pingTime;
        this.pongTime = pongTime;
        this.guid = guid;
        this.userData = userData;
    }
}