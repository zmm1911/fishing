package com.fishing.designpattern.singleton;

public class FactoryMethod {
    public static void main(String[] args){
        Product p;
        AbstractFactory af;
        if(true){
            af = new CreateFactory1();
        } else {
            af = new CreateFactory2();
        }
        p = af.newProduct();
        p.show();
    }
}

interface Product{
    public void show();
}

interface AbstractFactory{
    public Product newProduct();
}

class CreateProduct1 implements Product {

    @Override
    public void show(){
        System.out.println("Create a new product whose name is product1");
    }
}

class CreateProduct2 implements Product {
    @Override
    public void show(){
        System.out.println("Create a new product whose name is product2");
    }
}

class CreateFactory1 implements AbstractFactory {
    @Override
    public Product newProduct(){
        System.out.println("Product1 has been created");
        return new CreateProduct1();
    }
}

class CreateFactory2 implements AbstractFactory {
    @Override
    public Product newProduct(){
        System.out.println("Product2 has been created");
        return new CreateProduct2();
    }
}


