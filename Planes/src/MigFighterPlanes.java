public class MigFighterPlanes extends FighterPlanes
{
    public void highSpeedGeometry()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - High speed geometry selected");
    }
    public void normalGeometry()
    {
        System.out.println("PlaneID_"+this.getPlaneID()+" - Normal geometry selected");
    }
    public MigFighterPlanes(String planeID,int totalEnginePower)
    {
        super(planeID, totalEnginePower);
    }
}
