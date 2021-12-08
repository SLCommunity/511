package com.example.tilproject.controller;

import com.example.tilproject.domain.NewPost;
import com.example.tilproject.dto.SearchRequestDto;
import com.example.tilproject.dto.SearchResponse;
import com.example.tilproject.service.NewpostService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;


@RestController
@RequiredArgsConstructor
public class NewPostController {

    private final NewpostService newpostService;


    @GetMapping(value = "/postlist")
    @ResponseBody
    public List<NewPost> postList() {
        return newpostService.postList();
    }

    @GetMapping(value = "/posts/search/{searchtxt}")
    @ResponseBody
    public List<SearchResponse> postSearch (SearchRequestDto txt) {
        return newpostService.postSearch(txt);
    }

}