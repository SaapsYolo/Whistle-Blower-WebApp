package com.projects.Whistle.Blower.Service;

import com.projects.Whistle.Blower.Model.WhistleBlowerModel;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface WhistleBlowerService {
    @Bean
    public WhistleBlowerModel savePost (WhistleBlowerModel whistleBlower);
    public List<WhistleBlowerModel> getAllPosts();
}
