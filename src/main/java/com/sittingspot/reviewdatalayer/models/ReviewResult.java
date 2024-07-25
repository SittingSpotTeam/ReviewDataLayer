package com.sittingspot.reviewdatalayer.models;

import java.util.List;
import java.util.UUID;

public record ReviewResult(UUID id, List<Review> reviews) {
    public ReviewResult(UUID id, List<Review> reviews){
        this.id=id;
        this.reviews = reviews;
    }
}
