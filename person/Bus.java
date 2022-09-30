package com.example.week01_1.person;

public class Bus extends Transport {

    String state;
    int max_num = 30;

    int r_num = 0;
    int b_price = 1000;

    int t_price = 0;

    boolean cycle = true;

    public Bus() {
        super();
        state = "운행중";
    }

    @Override
    void ride(int r_num) {
        if (max_num > (current_num + r_num)) {
            current_num += r_num;
            System.out.println("승객이 탑승했습니다.");
            System.out.println("탑승 승객 수: " + current_num);
            System.out.println("잔여 승객 수: " + (max_num - current_num));
            System.out.println("요금 확인: " + b_price * r_num);
        } else {
            System.out.println("차고지행 또는 인원 초과입니다. (현재 승객 수: " + current_num + ")");
        }
    }

    @Override
    void state() {
        System.out.println("차대번호: " + num);
        System.out.println("운행상태: " + state);
    }

    @Override
    void ride(int r_num, String place, int distance) {

    }

    @Override
    void drive() {
        while (true) {
            if (gas > 10) {
                System.out.println("운행을 시작합니다.(gas잔량: " + gas + ")");
                gas -= 5;
                if (gas == 50) {
                    System.out.println("주유량: " + gas + "입니다. 차고지로 이동합니다.");
                    chargeState();
                    charge(10);
                    current_num = 0;
                    break;
                }
            } else {
                System.out.println("주유를 위해 차고지로 갑니다. (gas잔량: " + gas + ")");
                chargeState();
                current_num = 0;
                return;
            }
        }
    }


    void busState() {
        System.out.println("탑승 승객 수: " + current_num);
        System.out.println("잔여 승객 수: " + (max_num - current_num));
        System.out.println("요금 확인: " + b_price * r_num);
        r_num = b_price * r_num;
    }


    void chargeState() {
        if (state.equals("운행중")) {
            state = "차고지행";
        } else if (state.equals("차고지행")) {
            state = "운행중";
        }
    }

    @Override
    void charge(int gass) {
        this.gas = gas + gass;
        System.out.println("기름을 넣었습니다. (현재 주유량: " + gas + ")");
        System.out.println("상태: " + state);
        chargeState();
    }


    void drive2() {
        while (gas > 5) {
            gas -= 5;
            System.out.println("운행을 시작합니다.(gas잔량: " + gas + ")");
        }
        System.out.println("주유량: " + gas + "입니다. 차고지로 이동합니다.");
        chargeState();
        System.out.println("상태: " + state);
        current_num = 0;
    }
}
