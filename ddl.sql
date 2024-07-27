CREATE TABLE review
(
    reviewId VARCHAR(255) NOT NULL,
    sittingSpotId  VARCHAR(255) NOT NULL,
    corpus  VARCHAR(255) NOT NULL,
    CONSTRAINT pk_review PRIMARY KEY (review_id)
);
