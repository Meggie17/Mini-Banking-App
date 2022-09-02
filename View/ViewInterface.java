package View;

import Controler.BusinessLogic;

public class ViewInterface {
    private BusinessLogic controller;

    public ViewInterface(BusinessLogic controller){
        this.controller=controller;
    }

    public void setController(BusinessLogic controller) {
        this.controller = controller;
    }

    public BusinessLogic getController() {
        return controller;
    }
}
