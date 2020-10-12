class ParkingSystem {

    int ar[]=new int[4];
    public ParkingSystem(int big, int medium, int small) {
        ar[1]=big;
        ar[2]=medium;
        ar[3]=small;
    }
    
    public boolean addCar(int carType) 
    {
        ar[carType]--;
        return ar[carType]>=0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */