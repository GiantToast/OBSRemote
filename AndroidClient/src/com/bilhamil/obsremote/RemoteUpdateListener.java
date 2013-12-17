package com.bilhamil.obsremote;

import java.util.ArrayList;

import com.bilhamil.obsremote.messages.updates.StreamStatus;
import com.bilhamil.obsremote.messages.util.Source;

public interface RemoteUpdateListener
{
    public void onConnectionAuthenticated();
    
    public void onConnectionClosed(int code, String reason);

    public void onStreamStarting(boolean previewOnly);
    
    public void onStreamStopping();
    
    public void onStreamStatus(StreamStatus status);

    public void onFailedAuthentication(String message);

    public void onNeedsAuthentication();

    public void onStreamStatusUpdate(int totalStreamTime, int fps,
            float strain, int numDroppedFrames, int numTotalFrames, int bps);

    public void onSceneSwitch(String sceneName);

    public void onScenesChanged();

    public void onSourceChanged(String sourceName, Source source);

    public void onSourceOrderChanged(ArrayList<String> sources);

    public void onRepopulateSources(ArrayList<Source> sources);
}