package com.example.project1.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payLoads")
public class payLoads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long loadId;

    @Column(name = "shipperId")
    private long shipperId;
    @Column(name = "weight")
    private long weight;
    @Column(name = "noOfTrucks")
    private long noOfTrucks;
    @Column(name = "loadingPoint")
    private String loadingPoint;
    @Column(name = "unloadingPoint")
    private String unloadingPoint;
    @Column(name = "productType")
    private String productType;
    @Column(name = "truckType")
    private String truckType;
    @Column(name = "comment")
    private String comment;
    @Column(name = "date")
    private Date date;

    public payLoads() {
        super();
    }

    public payLoads(long shipperId, long weight, long noOfTrucks, String loadingPoint, String unloadingPoint, String productType, String truckType, String comment, Date date) {
        super();
        this.shipperId = shipperId;
        this.weight = weight;
        this.noOfTrucks = noOfTrucks;
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.comment = comment;
        this.date = date;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }

    public long getLoadId() {
        return loadId;
    }

    public void setLoadId(long loadId) {
        this.loadId = loadId;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public long getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(long noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
