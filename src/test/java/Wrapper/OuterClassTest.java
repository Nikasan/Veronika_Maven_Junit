package Wrapper;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Wrapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OuterClassTest {

    private static Outer_Class.NestedClass nestedClass;
    private static Outer_Class.InnerClass innerClass;
    private static Outer_Class.NestedChildrenClass nestedchildren;

    @BeforeAll
    public static void createReturnString() {
        nestedClass = new Outer_Class.NestedClass();

        Outer_Class outer = new Outer_Class();
        innerClass = outer.new InnerClass();

    }


    @Nested
    class PositiveTests {
        @Test
        void strComparingPositive() {
            String result = nestedClass.NestedMethod();
            assertEquals(result, "I am Nested");
        }

        @Test
        void strInnerClassComparing() {
            String result = innerClass.ineerMethod();
            assertEquals(result, "I am Inner");
        }
        @Test
        void sumFromNestedClass() {
            int result =nestedClass.sumMethod(1,3);
            assertEquals(result, 4);
        }
        @Test
        void sumThree_elementNestedClass() {
            int result =nestedClass.sumMethod(1,3,6);
            assertEquals(result, 10);
        }

        @Test
        void minusFromNestesChildrenClass(){
            nestedchildren = new Outer_Class.NestedChildrenClass();
             int result = Outer_Class.NestedChildrenClass.sumMethod(6,3);
             assertEquals(result,3);
        }
    }

    @Nested
    class NegativeTests {
        @Test
        void strComparingNegative() {
            String result = nestedClass.NestedMethod();
            assertNotEquals(result, "x");
        }

        @Test
        void strInnerClassComparing() {
            String result = innerClass.ineerMethod();
            assertNotEquals(result, "x");
        }
    }
}