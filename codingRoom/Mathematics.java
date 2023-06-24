package codingRoom;

public class Mathematics implements Calculations{
        int temp;
    @Override
    public int multiply(int num) {
        return 0;
    }

    @Override
    public int subtract(int num) {
        int sub=0;
        while(num > 0){
            temp = num%10;
            int[] n = new int[temp];
            System.out.println(n);
            for(int i=0; i<n.length;i++){
                sub -= n[i];
            }
            System.out.println(sub);
            num=num/10;
        }
        return sub;
    }
    }

