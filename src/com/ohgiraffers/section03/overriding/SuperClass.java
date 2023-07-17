package com.ohgiraffers.section03.overriding;

/* 참고. Class 앞에 final 키워드는 상속 불가의 의미 */
public /* final*/ class SuperClass {           // 부모 클래스

    /* 오버라이딩 성립 조건을 이해할 수 있다. */

    /* 오버라이딩 테스트 기준 메소드 */
    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}
}