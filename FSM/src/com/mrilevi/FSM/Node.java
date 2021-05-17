package com.mrilevi.FSM;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    HashMap<String, Node> transition = new HashMap<>();
    private String nodeName;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void newTransition(String inputLetter, Node node){
        transition.put(inputLetter, node);
    }

}
