package com.cricket.score.service;

import com.cricket.score.entity.Match;

import java.util.List;

public interface MatchService {
    /**
     * This will return all the live matches
     * @return
     */
    List<Match> getLiveMatchScores();

    /**
     * This will return Cricket world cup point table
     * @return
     */
    List<List<String>> getCWCPointTable(int year);

    /**
     * This will return all the matches
     * @return
     */
    List<Match> getAllMatches();
}
