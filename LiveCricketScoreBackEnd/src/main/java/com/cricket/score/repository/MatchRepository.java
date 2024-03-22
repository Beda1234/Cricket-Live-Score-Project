package com.cricket.score.repository;

import com.cricket.score.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match, Integer> {
    /**
     * This will return the match details by the team name
     *
     * @param teamHeading
     * @return
     */
    Optional<Match> findByTeamHeading(String teamHeading);
}
