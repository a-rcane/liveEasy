package com.example.project1.controller;

import com.example.project1.entity.payLoads;
import com.example.project1.service.payloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class payloadController {

        @Autowired
        private payloadService Loader;

        @GetMapping("/loads")
        public List<payLoads> getAllLoads(){
            return this.Loader.getAllLoads();
        }


        @GetMapping("/load/{loadId}")
        public Optional<payLoads> getLoad(@PathVariable String loadId) {
            return this.Loader.getLoad(Long.parseLong(loadId));
        }

        @GetMapping("/load")
        public List<payLoads> getLoadsById(@RequestParam String shipperId) {
            return this.Loader.getLoadsById(Long.parseLong(shipperId));
        }

        @PostMapping("/load")
        public payLoads addLoad(@RequestBody payLoads load) {
            return this.Loader.addLoad(load);
        }

        @PutMapping("/load/{loadId}")
        public payLoads updateLoad(@RequestBody payLoads load, @PathVariable String loadId){
            return this.Loader.updateLoad(load, Long.parseLong(loadId));
        }

        @DeleteMapping("/load/{loadId}")
        public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId) {
            try {
                this.Loader.deleteLoad(Long.parseLong(loadId));
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

}
