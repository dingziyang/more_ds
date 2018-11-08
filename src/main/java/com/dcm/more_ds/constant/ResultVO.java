package com.dcm.more_ds.constant;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @PackageName: com.dcm.more_ds.constant
 * @ClassName: ResultVO
 * @Description: 统一返回的数据类型
 * @Auther: dcm
 * @Date: 2018-5-18 10:47
 */

public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "服务器返回的状态码")
    private int status;//状态
    @ApiModelProperty(value = "服务器返回的信息")
    private String message;//信息
    @ApiModelProperty(value = "服务器返回的数据")
    private T data;//数据
    @ApiModelProperty(value = "服务器返回的时间，格式：yyyy-MM-dd-HH-mm-ss")
    private String serverTime;//服务器时间

    public ResultVO(){ }

    public ResultVO(int status,String msg){
        this.status = status;
        this.message = msg;
    }

    public ResultVO(int status,String msg,T data){
        this.status = status;
        this.message = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public String getServerTime() {
        return serverTime;
    }
    public void setServerTime(String serverTime) {
        this.serverTime = serverTime;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", serverTime='" + serverTime + '\'' +
                '}';
    }
}
