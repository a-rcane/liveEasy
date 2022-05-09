package com.example.project1.service;

import com.example.project1.dao.LoadDao;
import com.example.project1.entity.payLoads;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class payloadServiceImpl implements payloadService{

    @Autowired
    private LoadDao loadDao;

    public payloadServiceImpl() {

    }

    @Override
    public List<payLoads> getAllLoads() {
        return loadDao.findAll();
    }

    @Override
    public Optional<payLoads> getLoad(long longId) {
        return loadDao.findById(longId);
    }

    @Override
    public List<payLoads> getLoadsById(long shipperId) {
        return loadDao.findAllById(Collections.singletonList(shipperId));
    }

    @Override
    public payLoads addLoad(payLoads load) {
        loadDao.save(load);
        return load;
    }

    @Override
    public payLoads updateLoad(payLoads load, long loadId) {
        payLoads update = loadDao.getById(loadId);
        update.setLoadingPoint(load.getLoadingPoint());
        update.setUnloadingPoint(load.getUnloadingPoint());
        update.setProductType(load.getProductType());
        update.setTruckType(load.getTruckType());
        update.setComment(load.getComment());
        update.setShipperId(load.getShipperId());
        update.setNoOfTrucks(load.getNoOfTrucks());
        update.setWeight(load.getWeight());
        update.setDate(load.getDate());
        loadDao.save(update);
        return load;
    }

    @Override
    public void deleteLoad(long loadId) {
        payLoads del = loadDao.getById(loadId);
        loadDao.delete(del);
    }
}
