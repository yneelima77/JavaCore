package Perscholas_ClassPractice.genericTypes;

public interface GenericInterface_Movable<T>{
    public void move(T t, String locationcode);
    public T getItembeingmoved();
    public String getLocationBeingMovedTo();

}
