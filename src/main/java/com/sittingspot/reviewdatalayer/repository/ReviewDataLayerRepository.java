package com.sittingspot.reviewdatalayer.repository;

import com.sittingspot.reviewdatalayer.models.*;

import java.util.*;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

public interface ReviewDataLayerRepository extends JpaRepositoryImplementation<Review, Review>{
    
    @Query(value="SELECT * FROM reviews r WHERE r.sittingSpotId=id")
    public List<Review> findReviewById(@Param("id") UUID id);
}
