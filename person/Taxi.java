package com.example.week01_1.person;

public class Taxi extends Transport{
    int max_num = 4;

    int b_price = 3000;
    int r_price = 1000;
    int t_price = 0;
    int b_distance = 1;
    int distance;
    String state;
    int speed = 0;

    public Taxi() {
        super();
        state = "일반";
    }

    @Override
    void state() {
        System.out.println("차대번호: " + num);
        System.out.println("운행상태: " + state);
        System.out.println("주유량: " + gas);

    }

    @Override
    void ride(int r_num, String place, int distance) {
        if (max_num > (current_num + r_num)) {
            current_num += r_num;
            changeState();
            System.out.println("승객이 탑승했습니다.");
            System.out.println("탑승 승객 수: " + current_num);
            System.out.println("잔여 승객 수: " + (max_num - current_num));
            System.out.println("기본 요금 확인: " + b_price + "원");
            System.out.println("목적지: " + place);
            System.out.println("목적지까지 거리: " + distance);
            System.out.println("지불할 요금: " + (b_price + (r_price*(distance-b_distance))) + "원");
            System.out.println("상태: " + state);
            t_price += b_price + (r_price*(distance-b_distance));
        } else {
            System.out.println("인원 초과입니다. (현재 승객 수: " + current_num + ")");
        }
    }

    void pay(){
        System.out.println("주유량: " + gas);
        System.out.println("누적 요금: " + t_price + "원");
    }

    @Override
    void drive() {
        while (true) {
            if (gas > 10) {
                System.out.println("운행을 시작합니다.(gas잔량: " + gas + ")");
                gas -= 5;
                if (gas == 20) {
                    System.out.println("주유량: " + gas + "입니다.");
                    current_num = 0;
                    break;
                }
            }
        }
    }

    void drive2() {
        while (true) {
            if (gas > 0) {
                System.out.println("운행을 시작합니다.(gas잔량: " + gas + ")");
                gas -= 5;
                if (gas == 0) {
                    System.out.println("주유량: " + gas + "입니다.");
                    System.out.println("누적 요금: " + t_price + "원");
                    state = "주행불가";
                    System.out.println("상태: " + state);
                    current_num = 0;
                    System.out.println("주유 필요");
                    break;
                }
            }
        }
    }

}
