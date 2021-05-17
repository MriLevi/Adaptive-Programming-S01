package com.mrilevi.FSM;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //machine 1
        ArrayList<String> passedNodeList = new ArrayList<>();
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        s0.newTransition("B", s1);
        s0.newTransition("A", s2);
        s1.newTransition("A", s1);
        s1.newTransition("B", s2);
        s2.newTransition("B", s3);
        s3.newTransition("B", s0);
        s3.newTransition("A", s3);
        FSM f1 = new FSM();
        f1.useNode("ABBBAAABBB", passedNodeList, s0);

        //machine 2
        ArrayList<String> passedNodeList2 = new ArrayList<>();
        Node t0 = new Node("t0");
        Node t1 = new Node("t1");
        Node t2 = new Node("t2");
        Node t3 = new Node("t3");
        Node t4 = new Node("t4");

        t0.newTransition("A", t0);
        t0.newTransition("B", t1);
        t0.newTransition("C", t2);
        t0.newTransition("D", t3);
        t0.newTransition("E", t4);
        t1.newTransition("A", t0);
        t1.newTransition("B", t1);
        t1.newTransition("C", t2);
        t1.newTransition("D", t3);
        t1.newTransition("E", t4);
        t2.newTransition("A", t0);
        t2.newTransition("B", t1);
        t2.newTransition("C", t2);
        t2.newTransition("D", t3);
        t2.newTransition("E", t4);
        t3.newTransition("A", t0);
        t3.newTransition("B", t1);
        t3.newTransition("C", t2);
        t3.newTransition("D", t3);
        t3.newTransition("E", t4);
        t4.newTransition("A", t0);
        t4.newTransition("B", t1);
        t4.newTransition("C", t2);
        t4.newTransition("D", t3);
        t4.newTransition("E", t4);
        FSM f2 = new FSM();
        f2.useNode("ADEBCEDBCBDBEABABABEBABAB",passedNodeList2, t0);
    }
}
