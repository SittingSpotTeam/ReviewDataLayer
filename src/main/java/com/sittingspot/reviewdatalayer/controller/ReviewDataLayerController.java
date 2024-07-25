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

import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/review-dl/api/v1")
public class ReviewDataLayerController {
    
    private ReviewDataLayerRepository reviewDlRepo;
    @GetMapping
    public List<Review> getReviews(@RequestParam UUID id){
        return reviewDlRepo.findReviewById(id);
    }

    @PostMapping
    public void postReview(@RequestBody Review review){
        // reviewDlRepo.save(review);
        reviewDlRepo.save(new Review(UUID.fromString("e"), "Horrible and noisy"));
        reviewDlRepo.save(new Review(UUID.fromString("a"), "very bad"));
        reviewDlRepo.save(new Review(UUID.fromString("b"), "terrible"));
        reviewDlRepo.save(new Review(UUID.fromString("c"), "very nice"));
        reviewDlRepo.save(new Review(UUID.fromString("d"), "amazing and clean"));
        System.out.println(UUID.fromString("a"));
        System.out.println(UUID.fromString("b"));
        System.out.println(UUID.fromString("c"));
    }
}
