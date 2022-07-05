package org.opensky.data;

import org.opensky.model.AdsbTrackData;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class AdsbTrackDataHolder {

    public static AdsbTrackDataHolder instance;
    private ConcurrentHashMap<String, AdsbTrackData> adsbTrackMap = null;

    public AdsbTrackDataHolder() {
        adsbTrackMap = new ConcurrentHashMap<>();
    }

    public static AdsbTrackDataHolder getInstance() {
        if (instance == null) {
            instance = new AdsbTrackDataHolder();
        }
        return instance;
    }

    public boolean containsAdsbTrack(String icaoCode) {
        return adsbTrackMap.contains(icaoCode);
    }
    public AdsbTrackData getAdsbTrack(String icaoCode) {
        return adsbTrackMap.get(icaoCode);
    }

    public void putAdsbTrack(AdsbTrackData adsbTrackData) {
        adsbTrackMap.put(adsbTrackData.getIcaoCode(), adsbTrackData);
    }

    public void deleteAdsbTrack(long trackId) {
        adsbTrackMap.remove(trackId);
    }
}
