package com.csc363.group2.poc_demo.UserReview;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReviewRepo extends JpaRepository <UserReviewEntity,Long> {

}