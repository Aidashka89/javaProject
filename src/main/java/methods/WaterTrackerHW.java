package methods;

public class WaterTrackerHW {
    int consumeWater;



    public void addWater(int milliliters){
        if (milliliters > 0){
            consumeWater += milliliters;
            System.out.println("You just drink " + milliliters + " of water");
        }else {
            System.out.println("Consumed amount can be only positive number");
        }

    }
    public int getWaterIntake(){
        return consumeWater;
    }
    public String getStatus(){
        if (consumeWater >= 2000){
            return "You are hydrated!";
        }else {
            return "You need to consume more water!";
        }


    }


    public static void main(String[] args) {
        WaterTrackerHW waterTracker1 = new WaterTrackerHW();
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getWaterIntake());
        waterTracker1.addWater(1000);
        System.out.println(waterTracker1.getWaterIntake());
        System.out.println(waterTracker1.getStatus());
        waterTracker1.addWater(500);
        System.out.println(waterTracker1.getStatus());
        waterTracker1.addWater(-500);
    }
}
