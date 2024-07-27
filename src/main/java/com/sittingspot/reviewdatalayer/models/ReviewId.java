package com.sittingspot.reviewdatalayer.models;
import java.io.Serializable;
import java.util.Objects;


public class ReviewId implements Serializable{
    private String sittingSpotId;
    private String corpus;

    public String sittingSpotId() {
        return sittingSpotId;
    }

    public void setSittingSpotId(String sittingSpotId) {
        this.sittingSpotId = sittingSpotId;
    }

    public String getCorpus() {
        return corpus;
    }

    public void corpus(String corpus) {
        this.corpus = corpus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReviewId reviewId = (ReviewId) o;
        return Objects.equals(sittingSpotId, reviewId.sittingSpotId) &&
                Objects.equals(corpus, reviewId.corpus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sittingSpotId, corpus);
    }
}
