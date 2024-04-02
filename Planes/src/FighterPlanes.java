public class FighterPlanes extends Planes
{
    public void launchMissile()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete");
    }
    public FighterPlanes(String planeID,int totalEnginePower)
    {
        super(planeID, totalEnginePower);
    }
}
