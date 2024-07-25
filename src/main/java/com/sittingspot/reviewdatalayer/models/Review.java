package com.sittingspot.reviewdatalayer.models;
import java.util.*;


public class Review{
    private UUID sittingSpotId;
    private String corpus;

    public Review(UUID sittingSpotId, String corpus){
        this.sittingSpotId=sittingSpotId;
        this.corpus=corpus;
    }

    public String corpus(){
        return this.corpus;
    }

    public UUID sittingSpotId(){
        return this.sittingSpotId;
    }
}
