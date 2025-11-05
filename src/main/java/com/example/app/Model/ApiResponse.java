package com.example.app.Model;

import java.util.List;
// import lombok.Data;

public class ApiResponse {
    private List<DataBean> data;
    private List<StatusBean> status;
    
    public List<DataBean> getData() {
        return data;
    }
    public void setData(List<DataBean> data) {
        this.data = data;
    }
    public List<StatusBean> getStatus() {
        return status;
    }
    public void setStatus(List<StatusBean> status) {
        this.status = status;
    }

   


}
