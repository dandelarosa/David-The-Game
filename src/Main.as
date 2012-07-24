package
{
    import net.flashpunk.Engine;
    import net.flashpunk.FP;
    
    public class Main extends Engine
    {
        public function Main()
        {
            super(550, 400, 30, false);
            FP.world = new PlatformWorld();
        }
    }
}
