package com.joaodartora.generics.subclass;

public class NonGenericClass extends BaseData<Data> implements GenericInterface<NonGenericInterface>{

    //If NonGenericClass try to implements a generic interface, it will throw a compile time exception
    //If NonGenericClass try to extends a generic class, it will throw a compile time exception

}
