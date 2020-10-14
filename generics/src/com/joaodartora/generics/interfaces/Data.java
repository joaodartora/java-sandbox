package com.joaodartora.generics.interfaces;

public class Data<T> implements DataInterface<T> {

    // T is type parameter
    // DataInterface is a generic interface

    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
