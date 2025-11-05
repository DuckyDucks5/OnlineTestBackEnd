package com.example.app.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.Model.ApiResponse;
import com.example.app.Model.Data;
import com.example.app.Service.AppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private AppService apiService;
    
    @GetMapping("/data")
    public ApiResponse getAllData() {

        return apiService.getData();
    }
    
}
