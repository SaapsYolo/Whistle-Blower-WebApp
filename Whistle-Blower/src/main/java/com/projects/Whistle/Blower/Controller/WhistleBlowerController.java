package com.projects.Whistle.Blower.Controller;

import com.projects.Whistle.Blower.Model.WhistleBlowerModel;
import com.projects.Whistle.Blower.Service.WhistleBlowerService;
import com.projects.Whistle.Blower.Service.WhistleBlowerServiceImplemenation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class WhistleBlowerController {

    @Autowired
    private WhistleBlowerService whistleBlowerService;

    @GetMapping("/getAll")
    public List<WhistleBlowerModel> getAllPosts(){
        return whistleBlowerService.getAllPosts();
    }

    @PostMapping("/addPost")
    public String addPost(@RequestBody WhistleBlowerModel whistleBlower){
        whistleBlowerService.savePost(whistleBlower);
        return "New Post Added";
    }
}
