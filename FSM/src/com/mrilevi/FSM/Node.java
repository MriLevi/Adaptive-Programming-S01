package com.mrilevi.FSM;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    HashMap<String, Node> verbinding = new HashMap<>();
    static String code;
    private String nodeName;
    private String firstletter;
    private String newCode;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public void useNode(String code, ArrayList<String> passedNodeList) {
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
        if (this.firstletter.equals("A")) {
            //check of er een verbinding is met als key A
            if (verbinding.containsKey("A")) {
                System.out.println("Via A!");
                //voeg naam van de node toe aan een arraylist
                passedNodeList.add(this.nodeName);
                //check of dit de laatste letter was
                if(this.newCode == null){
                    System.out.println("Dat was de laatste letter! We zijn de volgende nodes gepasseerd:\n" + passedNodeList);
                    System.exit(0);
                }
                else{//als het niet de laatste letter was, roep de volgende node aan
                verbinding.get(this.firstletter).useNode(this.newCode, passedNodeList);
                }
            }
            else {
                System.out.println("Bij node "+ this.nodeName +" geen verbinding vanaf A mogelijk, einde");
                System.out.println("We zijn deze nodes gepasseerd:" + passedNodeList);
                System.exit(0);
            }
        }
        if (this.firstletter.equals("B")) {
            if (verbinding.containsKey("B")) {
                System.out.println("Via B!");
                passedNodeList.add(this.nodeName);
                if(this.newCode == null){
                    System.out.println("Dat was de laatste letter! We zijn de volgende nodes gepasseerd:\n" + passedNodeList);
                    System.exit(0);
                }
                else {
                    verbinding.get(this.firstletter).useNode(this.newCode, passedNodeList);
                }
            } else {
                System.out.println("Bij node "+ this.nodeName +" geen verbinding vanaf B mogelijk, einde");
                System.out.println("We zijn deze nodes gepasseerd:" + passedNodeList);
                System.exit(0);
            }
            }

        else {
            System.out.println(this.firstletter + " is niet A of B, we skippen deze en gaan verder.");
            this.firstletter = code.substring(1, 2);
            if(code.length() > 1){
                this.newCode = code.substring(1);}
            verbinding.get(this.firstletter).useNode(this.newCode, passedNodeList);
        }
    }

    public void nieuweVerbinding(String inputLetter, Node node){
            verbinding.put(inputLetter, node);
    }

}
