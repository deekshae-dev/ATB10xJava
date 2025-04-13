package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractionIQ {
}

interface I11{}   //valid
interface I12{}   //valid
class A1{}
class B1{}
class Test1 extends A1{} //valid
//class Test2 extends A1,B1{} // Invalid, Multiple inheritance in class is not allowed
class Test3 implements I11{} //valid
class Test4 implements I11,I12{} //valid
class Test5 extends A1 implements I11,I12{}//Valid
//class Test5 implements I11 extends A{} //Invalid

interface I3{}
//interface I3 extends A1{}