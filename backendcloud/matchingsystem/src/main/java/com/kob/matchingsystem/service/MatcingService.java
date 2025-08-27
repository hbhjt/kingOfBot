package com.kob.matchingsystem.service;

public interface MatcingService {
    String addPlayer(Integer userId, Integer rating, Integer botId);
    String removePlayer(Integer userId);
}
