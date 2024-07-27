CREATE TABLE review
(
    corpus  VARCHAR(255) NOT NULL,
    sittingSpotId  VARCHAR(255) NOT NULL,
    CONSTRAINT pk_review PRIMARY KEY (sittingSpotId, corpus)
);
