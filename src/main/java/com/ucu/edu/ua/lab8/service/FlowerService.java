package com.ucu.edu.ua.lab8.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ucu.edu.ua.lab8.model.Flower;
import com.ucu.edu.ua.lab8.repository.FlowerRepository;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    public FlowerService(FlowerRepository repository) {
        this.flowerRepository = repository;
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll(); 
    }
    public Flower createFlower(Flower flower) {
        return flowerRepository.save(flower);
    }
}
