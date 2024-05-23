package busRes;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int busno,boolean ac,int capacity){
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;
    }
    public int getBusno(){
        return busno;
    }
    public boolean isAc(){
        return ac;
    }
    public void setAc(boolean ac){
        this.ac=ac;
    }
    public int getCapacity(){
         return capacity;
    }
    public void setCapacity(int cap){
        this.capacity=cap;
    }
    public void displayBus(){
        System.out.println("Bus No: "+busno+"AC/NON-AC "+ac+"Bus capacity "+capacity);
    }

}
