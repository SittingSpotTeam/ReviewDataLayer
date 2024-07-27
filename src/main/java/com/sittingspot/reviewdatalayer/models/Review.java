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
@IdClass(ReviewId.class)
@Table(name = "reviews")
public class Review{

    @Id
    @Column(nullable = false)
    private String sittingSpotId;

    @Id
    @Column(nullable = false)
    private String corpus;

    public Review(String sittingSpotId, String corpus){      
        this.sittingSpotId=sittingSpotId;
        this.corpus=corpus;
    }

    public String corpus(){
        return this.corpus;
    }

    public String sittingSpotId(){
        return this.sittingSpotId;
    }

    public void print(){
        System.out.println("sittingSpotId:"+this.sittingSpotId);
        System.out.println("corpus:"+this.corpus);
    }
}
