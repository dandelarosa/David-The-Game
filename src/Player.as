package
{
    import flash.geom.Rectangle;
    import net.flashpunk.Entity;
    import net.flashpunk.graphics.Canvas;
    import net.flashpunk.utils.Input;
    import net.flashpunk.utils.Key;
    
    public class Player extends Entity
    {
        public function Player()
        {
            var canvas:Canvas = new Canvas(32, 32);
            var fillArea:Rectangle = new Rectangle(0, 0, 32, 32);
            canvas.fill(fillArea, 0x11111111, 1);
            graphic = canvas;
        }
        
        override public function update():void
        {
            if (Input.check(Key.LEFT)) {
                x -= 5;
            }
            if (Input.check(Key.RIGHT)) {
                x += 5;
            }
            if (Input.check(Key.UP)) {
                y -= 5;
            }
            if (Input.check(Key.DOWN)) {
                y += 5;
            }
        }
    }
}
