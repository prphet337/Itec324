public class Clock
{
    public Clock(int x, int y, int width)
    {
        this.x = x; 
        this.y = y; 
        this.witdth = width;
    }
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public void draw(Graphics2D g2)
    {
        Circle2D.Double body = new Circle2D.Double(x , y + width / 6, width - 1, width / 6);
        
    }
    
   /* // Draw the hands
      Graphics2D g = (Graphics2D) graphics;
       g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                              61:              RenderingHints.VALUE_ANTIALIAS_ON);
      size = getSize(size);
      insets = getInsets(insets);
      int radius = Math.min(size.width - insets.left - insets.top,
                                 65:                size.height - insets.top - insets.bottom) / 2;
      g.translate((double) size.width / 2D, (double) size.height / 2D);
     
     // draw the seconds
      g.setColor(Color.red);
      g.setStroke(SEC_STROKE);
      g.rotate(sec_angle);
      g.drawLine(0, 0, radius - 6, 0);
      g.rotate(-sec_angle);
    
     // draw the minutes
      g.setColor(Color.black);
      g.setStroke(MIN_STROKE);
      g.rotate(min_angle);
      g.drawLine(0, 0, radius - 10, 0);
      g.rotate(-min_angle);
    
     // draw the hours
      g.setColor(Color.black);
      g.setStroke(HOUR_STROKE);
      g.rotate(hour_angle);
      g.drawLine(0, 0, radius / 2, 0);
      g.rotate(-hour_angle);
      
      // draw the perimeter
      g.setColor(Color.darkGray);
      g.drawOval(-radius + 2, -radius + 2, 2 * radius - 4, 2 * radius - 4);
      }*/
}