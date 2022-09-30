package com.example.week01_1.person;

public abstract class Transport {
    int num;
    int gas = 100;
    int speed = 0;
    int max_num;
    int current_num=0;

    int r_num;


    public int getCurrent_num() {
        return current_num;
    }

    public void setCurrent_num(int current_num) {
        this.current_num = current_num;
    }

    private int b_price;

    String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMax_num() {
        return max_num;
    }

    public void setMax_num(int max_num) {
        this.max_num = max_num;
    }

    public int getB_price() {
        return b_price;
    }

    public void setB_price(int b_price) {
        this.b_price = b_price;
    }

    public Transport() {
        num = (int)(Math.random() * 9999) + 1000;
    }

    void state(){
        System.out.println("차대번호: " + num);
        System.out.println("운행상태: " + state);
    }

    abstract void ride(int r_num, String place, int distance);

    abstract void drive();


    void changeState(){
    }


    void ride(int r_num){

    }

    void charge(int gass){
        this.gas = gas + gass;
        System.out.println("기름을 넣었습니다. (현재 주유량: " + gas + ")");
    }


}
