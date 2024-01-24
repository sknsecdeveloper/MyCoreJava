package jlc.poly;

class a1 {}
class b1 extends a1{}
class c1 extends b1 {}


public class CastClass {

    c1 c = (c1) new b1();
}
