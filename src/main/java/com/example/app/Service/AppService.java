package com.example.app.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import com.example.app.Model.ApiResponse;
import com.example.app.Model.Data;
import com.example.app.Model.DataBean;
import com.example.app.Model.Status;
import com.example.app.Model.StatusBean;
import com.example.app.Repository.AppRepository;
import com.example.app.Repository.StatusRepository;

@Service
@Transactional
public class AppService {

    @Autowired
    private AppRepository appRepository;

    @Autowired
    private StatusRepository statusRepository;

    public ApiResponse getData() {
        ApiResponse response = new ApiResponse();

        List<DataBean> dataList = getDataFromDatabase();
        List<StatusBean> statusList = getStatusFromDatabase();

        response.setStatus(statusList);
        response.setData(dataList);

        return response;
    }

    private List<DataBean> getDataFromDatabase() {
        List<Data> entities = appRepository.findAll();
        List<DataBean> beans = new ArrayList<>(entities.size());

        for (Data e : entities) {
            DataBean b = new DataBean();
            b.setId(e.getId());
            b.setProductID(e.getProductID());
            b.setProductName(e.getProductName());
            b.setAmount(e.getAmount());
            b.setCustomerName(e.getCustomerName());
            b.setStatus(e.getStatus());

            if (e.getTransactionDate() != null) {
                b.setTransactionDate(e.getTransactionDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }

            b.setCreateBy(e.getCreateBy());

            if (e.getCreateOn() != null) {
                b.setCreateOn(e.getCreateOn().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            }

            beans.add(b);
        }

        return beans;
    }

    private List<StatusBean> getStatusFromDatabase() {
        List<Status> entities = statusRepository.findAll();
        List<StatusBean> beans = new ArrayList<>(entities.size());

        for (Status e : entities) {
            StatusBean b = new StatusBean();
            b.setId(e.getId());
            b.setName(e.getName());
            beans.add(b);
        }

        return beans;
    }
}