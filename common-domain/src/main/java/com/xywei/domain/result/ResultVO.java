package com.xywei.domain.result;

/**
 * @Author future
 * @DateTime 2021/3/7 0:00
 * @Description
 */
public class ResultVO<T> {

    private Integer status;
    private String message;
    private T object;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ResultVO{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", object=" + object +
                '}';
    }
}
