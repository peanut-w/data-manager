package com.haiqiu.datamanager.response;

/**
 * Created by peanut on 2019/3/23 下午5:25
 */
public class Response {
//    total: 3,
//    size: 2,
//    current: 1,
//    pages: 2
    private String status;

    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Response successResponse(Object data) {
        return createResponse("SUCCESS", data);
    }

    public static Response failedResponse(Object data) {
        return createResponse("FAILED", data);
    }

    public static Response createResponse(String status, Object data) {
        Response response = new Response();
        response.setStatus(status);
        response.setData(data);
        return response;
    }
}
