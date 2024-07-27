CREATE TABLE review
(
    reviewId TEXT NOT NULL,
    sittingSpotId  TEXT NOT NULL,
    corpus  TEXT NOT NULL,
    CONSTRAINT pk_review PRIMARY KEY (review_id)
);
