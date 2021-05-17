package com.mrilevi.FSM;

import java.util.ArrayList;

public class FSM {
    private String code;
    private String firstletter;
    private String newCode;

    public void useNode(String code, ArrayList<String> passedNodeList, Node currentNode) {
        this.code = code;
        this.firstletter = code.substring(0, 1);
        //check of het de laatste letter is
        if(code.length() > 1){
            this.newCode = code.substring(1);
        }
        else{
            this.newCode = null;
        }

        //als de eerste letter van de gegeven code A is
        if (currentNode.transition.containsKey(this.firstletter)) {
            //voeg naam van de node toe aan een arraylist
            passedNodeList.add(currentNode.getNodeName());
            //check of dit de laatste letter was
            if(this.newCode == null){
                System.out.println("Dat was de laatste letter! We zijn de volgende nodes gepasseerd:\n" + passedNodeList);
            }
            else{//als het niet de laatste letter was, roep de volgende node aan
                Node nextNode = currentNode.transition.get(this.firstletter);
                useNode(this.newCode, passedNodeList, nextNode);
            }
        }
        else {
            System.out.println("Bij node " + currentNode.getNodeName() + " geen verbinding vanaf " + this.firstletter + "mogelijk, einde");
            System.out.println("We zijn deze nodes gepasseerd:" + passedNodeList);
        }
    }
}