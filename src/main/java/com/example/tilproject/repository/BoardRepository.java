package com.example.tilproject.repository;

import com.example.tilproject.domain.Board;
import com.example.tilproject.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    List<Board>findAllByOrderByCreatedAtDesc();

    List<Board> findByUser(User user);
}