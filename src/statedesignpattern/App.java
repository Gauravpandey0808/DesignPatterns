package statedesignpattern;

import statedesignpattern.dto.ProductDto;
import statedesignpattern.states.VendingMachineState;
import statedesignpattern.states.idleState;

import java.util.List;

public class App {

    public static void main(String[] args) {
        VendingMachineState currentState = new idleState();
        try {
            currentState = currentState.startMachine(currentState);
            currentState.insertCoin(20,currentState);
            currentState.insertCoin(50,currentState);
            currentState.insertCoin(100,currentState);
            currentState = currentState.stateChangeButton(currentState);

            currentState = currentState.chooseProduct(currentState);
            currentState.dispenseProduct(currentState);
        } catch(Exception e) {
            e.printStackTrace();
        }



    }
}
