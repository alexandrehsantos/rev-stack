package br.com.bulvee.ed.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StackTest {

    Stack<String> stack;

    @BeforeEach
    void setUp() {
        stack = new Stack<>();
    }

    @Test
    void givenNames_whenPush_checkPushed_thenVerify(TestInfo testInfo) {
        System.out.println("displayName = " + testInfo.getDisplayName());

        String name1 = "name1";
        String name2 = "name2";

        Assertions.assertTrue(stack.empty());


        stack.push(name1);
        stack.push(name2);

        System.out.println(stack);

        Assertions.assertFalse(stack.empty());
    }

    @Test
    void givenNames_whenPushPop_checkPop_thenVerify(TestInfo testInfo) {
        System.out.println("displayName = " + testInfo.getDisplayName());

        String name1 = "name1";
        String name2 = "name2";

        stack.push(name1);
        stack.push(name2);

        stack.pop();

        System.out.println(stack);

        Assertions.assertFalse(stack.toString().contains(name2));
    }

    @Test
    void givenNames_whenPush_checkIsEmpty_thenVerify(TestInfo testInfo) {
        System.out.println("displayName = " + testInfo.getDisplayName());

        String name1 = "name1";
        String name2 = "name2";

        stack.push(name1);
        stack.push(name2);

        Assertions.assertFalse(stack.empty());
    }

    @Test
    void givenNames_whePeek_checkName_thenVerify(TestInfo testInfo) {
        System.out.println("displayName = " + testInfo.getDisplayName());

        String name1 = "name1";
        String name2 = "name2";

        stack.push(name1);
        stack.push(name2);

        System.out.println(stack.peak());

        Assertions.assertTrue(stack.toString().contains(name2));
    }
}