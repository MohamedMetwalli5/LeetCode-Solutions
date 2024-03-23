class ParkingSystem {
    
    private int[] arr;
    
    public ParkingSystem(int big, int medium, int small) {
        arr = new int[3];
        arr[0] = big;
        arr[1] = medium;
        arr[2] = small;
    }
    
    public boolean addCar(int carType) {
        arr[carType-1]--;
        return arr[carType-1]>=0? true : false;
    }
}
