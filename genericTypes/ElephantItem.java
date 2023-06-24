package Perscholas_ClassPractice.genericTypes;

public class ElephantItem <U> implements GenericInterface_Movable <U>{

    U item;
    String location;

    @Override
    public void move(U u, String locationcode) {
        item = u;
        location = locationcode;
    }

    @Override
    public U getItembeingmoved() {
        return item;
    }

    @Override
    public String getLocationBeingMovedTo() {
        return location;
    }
}
