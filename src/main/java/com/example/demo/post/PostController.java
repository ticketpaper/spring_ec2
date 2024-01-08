package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {
    private PostService postService;

    PostController() {
        this.postService = new PostService();
    }

    @GetMapping("/csr/json")
    @ResponseBody
    List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/ssr")
    public String finAllSsr(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts", posts);
        return "post_list";
    }

}

