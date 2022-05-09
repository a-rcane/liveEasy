package com.example.project1.service;

import com.example.project1.entity.payLoads;

import java.util.List;
import java.util.Optional;

public interface payloadService {

    public List<payLoads> getAllLoads();

    public Optional<payLoads> getLoad(long longId);

    public List<payLoads> getLoadsById(long shipperId);

    public payLoads addLoad(payLoads load);

    public payLoads updateLoad(payLoads load, long shipperId);

    public void deleteLoad(long loadId);

}
