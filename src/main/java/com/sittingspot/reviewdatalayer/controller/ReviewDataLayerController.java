package com.sittingspot.reviewdatalayer.controller;

import com.sittingspot.reviewdatalayer.models.*;
import com.sittingspot.reviewdatalayer.repository.ReviewDataLayerRepository;
import lombok.AllArgsConstructor;

import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ClientHttpResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/review-dl/api/v1")
public class ReviewDataLayerController {
    
    @Autowired
    private ReviewDataLayerRepository reviewDataLayerRepository;

    @GetMapping
    public List<Review> getReviews(@RequestParam("id") UUID id){
        return reviewDataLayerRepository.findBySittingSpotId(id);
    }

    @PostMapping
    public void postReview(@RequestBody Review review){
        review.generateId();
        Review rev = reviewDataLayerRepository.checkReviewExistance(review.sittingSpotId(), review.corpus());
        System.out.println(rev);
        review.print();
        if(rev==null){
            System.out.println("Review not found: saving");
            reviewDataLayerRepository.save(review);
        }
        // reviewDataLayerRepository.save(new Review(UUID.fromString("36797d2f-fbd2-466c-8b80-cb94864be30f"), "Horrible and noisy"));
        // reviewDataLayerRepository.save(new Review(UUID.fromString("46797d2f-fbd2-466c-8b80-cb94864be30f"), "very bad"));
        // reviewDataLayerRepository.save(new Review(UUID.fromString("56797d2f-fbd2-466c-8b80-cb94864be30f"), "terrible"));
        // reviewDataLayerRepository.save(new Review(UUID.fromString("66797d2f-fbd2-466c-8b80-cb94864be30f"), "very nice"));
        // reviewDataLayerRepository.save(new Review(UUID.fromString("76797d2f-fbd2-466c-8b80-cb94864be30f"), "amazing and clean"));
        // System.out.println(UUID.fromString("36797d2f-fbd2-466c-8b80-cb94864be30f"));
        // System.out.println(UUID.fromString("46797d2f-fbd2-466c-8b80-cb94864be30f"));
        // System.out.println(UUID.fromString("56797d2f-fbd2-466c-8b80-cb94864be30f"));
    }
}
