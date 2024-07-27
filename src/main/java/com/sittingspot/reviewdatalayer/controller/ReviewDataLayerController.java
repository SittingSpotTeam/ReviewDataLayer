package com.sittingspot.reviewdatalayer.controller;

import com.sittingspot.reviewdatalayer.models.*;
import com.sittingspot.reviewdatalayer.repository.ReviewDataLayerRepository;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/review-dl/api/v1")
public class ReviewDataLayerController {
    
    @Autowired
    private ReviewDataLayerRepository reviewDataLayerRepository;

    @GetMapping
    public List<Review> getReviews(@RequestParam("id") String id){
        return reviewDataLayerRepository.findBySittingSpotId(id);
    }

    @PostMapping
    public Review postReview(@RequestBody Review review){
        Review rev = reviewDataLayerRepository.checkReviewExistance(review.sittingSpotId(), review.corpus());
        System.out.println(rev);
        review.print();
        if(rev==null){
            System.out.println("Review not found: saving");
            reviewDataLayerRepository.save(review);
            return review;
        }
        else{
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Sitting spot already exists");
        }
    }
}
