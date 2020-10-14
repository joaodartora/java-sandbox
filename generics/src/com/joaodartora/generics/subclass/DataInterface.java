package com.joaodartora.generics.subclass;

public interface DataInterface<T> extends BaseInterface<T> {

    public T getData();

    public void setData(T data);

}
