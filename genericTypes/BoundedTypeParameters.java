package Perscholas_ClassPractice.genericTypes;

public class BoundedTypeParameters <E extends Number>  {
    private E data;
    public BoundedTypeParameters(E data){
        this.data = data;
    }

    public double sqRt(){
        return Math.sqrt(this.data.doubleValue());

    }

}
