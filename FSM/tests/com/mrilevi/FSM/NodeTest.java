package com.mrilevi.FSM;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @org.junit.jupiter.api.Test
    void getNodeName() {
        Node TestNode = new Node("TestNode");
        assertEquals("TestNode", TestNode.getNodeName());
    }
    @org.junit.jupiter.api.Test
    void newTransition() {
        Node transitionTestNode = new Node("transitionTestNode");
        transitionTestNode.newTransition("A", transitionTestNode);
        assertEquals(transitionTestNode.transition.get("A"), transitionTestNode);
    }

}