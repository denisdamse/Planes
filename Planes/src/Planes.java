public class Planes 
{
    private String planeID;
    public String getPlaneID()
    {
        return planeID;
    }
    private int totalEnginePower;
    public int getTotalEnginePower()
    {
        return totalEnginePower;
    }
    public void takeOff()
    {
        System.out.println("PlaneID_"+this.planeID+" - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete");
    }
    public void land()
    {
        System.out.println("PlaneID_"+this.planeID+" - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete");
    }
    public void fly()
    {
        System.out.println("PlaneID_"+this.planeID+" - Flying");
    }
    public Planes(String planeID,int totalEnginePower)
    {
        this.planeID=planeID;
        this.totalEnginePower=totalEnginePower;
    }
}
