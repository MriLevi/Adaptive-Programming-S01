package com.mrilevi.FSM;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> passedNodeList = new ArrayList<>();
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");
        s0.nieuweVerbinding("B", s1);
        s0.nieuweVerbinding("A", s2);
        s1.nieuweVerbinding("A", s1);
        s1.nieuweVerbinding("B", s2);
        s2.nieuweVerbinding("B", s3);
        s3.nieuweVerbinding("B", s0);
        s3.nieuweVerbinding("A", s3);
        s0.useNode("ABBBAXAABBB", passedNodeList);

    }
}
