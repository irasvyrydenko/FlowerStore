package com.ucu.edu.ua.lab8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ucu.edu.ua.lab8.model.Flower;
import com.ucu.edu.ua.lab8.service.FlowerService;

@RestController
@RequestMapping("/flowers")
public class FlowerController {

    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    
    @GetMapping
    public List<Flower> getFlowers(){
        return flowerService.getFlowers();
    }
    @PostMapping
    public Flower createFlower(Flower flower){
        return flowerService.createFlower(flower);
    }
}
