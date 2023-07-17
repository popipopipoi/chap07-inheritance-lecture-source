package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {     // 자식 클래스

    /* 메소드 이름, 리턴 타입, 매개변수의 갯수/타입/순서가 일치해야 오버라이딩 성립 */
    @Override
//    public void method2(int num) {} 메소드명이 다름
//    public int method(int num) { return 0; } 리턴타입이 다름
//    public void method(String num) {} 매개변수 타입이 다름
    public void method(int num) {}

    /* private 메소드 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {} 부모 클래스의 private 메소드 외부(자식클래스) 오버라이딩 불가능

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public final void finalMethod() {}

    /* 부모 메소드의 접근 제한자와 같거나 더 넓은 범위로 오버라이딩 가능 */
//    @Override
//    void protectedMethod() {}

    @Override
    public void protectedMethod() {}

}