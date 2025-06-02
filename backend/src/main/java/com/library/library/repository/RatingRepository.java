package com.library.library.repository;

import com.library.library.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
    Optional<Rating> findByBook_BookIdAndUser_Id(Integer bookId, Integer userId);
}