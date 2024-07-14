package com.projects.Whistle.Blower.Service;

import com.projects.Whistle.Blower.Model.WhistleBlowerModel;
import com.projects.Whistle.Blower.Repository.WhistleBlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhistleBlowerServiceImplemenation {

    @Autowired
    WhistleBlowerRepository repository;

    public List<WhistleBlowerModel> getAllPosts(){
        System.out.println("get all posts");
        return List.of();
    }
}
