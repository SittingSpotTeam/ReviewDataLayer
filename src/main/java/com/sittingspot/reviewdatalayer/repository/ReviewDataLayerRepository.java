package com.sittingspot.reviewdatalayer.repository;

import com.sittingspot.reviewdatalayer.models.*;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface ReviewDataLayerRepository extends JpaRepository<Review, UUID>{
    
    @Query("SELECT r FROM Review r WHERE r.reviewId = :reviewId")
    List<Review> findReviewById(@Param("reviewId") String reviewId);
    
    @Query("SELECT r FROM Review r WHERE r.sittingSpotId = :sittingSpotId")
    List<Review> findBySittingSpotId(String sittingSpotId);

    @Query("SELECT r FROM Review r WHERE r.sittingSpotId = :sittingSpotId AND r.corpus = :corpus")
    Review checkReviewExistance(@Param("sittingSpotId") String sittingSpotId, @Param("corpus") String corpus);
}
