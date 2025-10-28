package com.ucu.edu.ua.lab8.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.ucu.edu.ua.lab8.model.Flower;
@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
