package com.sittingspot.reviewdatalayer.models;
import java.util.*;
import jakarta.persistence.*;
import java.util.UUID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "reviews")
public class Review{
    @Id
    @Column(name = "id", nullable = false)
    private UUID reviewId;

    @Column(name = "sitting_spot_id", nullable = false)
    private UUID sittingSpotId;

    @Column(name = "corpus", nullable = false)
    private String corpus;

    public Review(UUID sittingSpotId, String corpus){      
        this.reviewId = UUID.randomUUID();
        this.sittingSpotId=sittingSpotId;
        this.corpus=corpus;
    }

    public String corpus(){
        return this.corpus;
    }

    public UUID sittingSpotId(){
        return this.sittingSpotId;
    }

    public void generateId(){
        this.reviewId = UUID.randomUUID();
    }

    public void print(){
        System.out.println("reviewId:"+this.reviewId);
        System.out.println("sittingSpotId:"+this.sittingSpotId);
        System.out.println("corpus:"+this.corpus);
    }
}
