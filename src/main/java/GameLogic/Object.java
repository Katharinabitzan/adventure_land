package GameLogic;

import behaviours.ITool;

public class Object implements ITool {

    private ITool object;

    public Object(ITool object) {
        this.object = object;
    }

    public ITool getObject() {
        return object;
    }

}
