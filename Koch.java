/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

    public static void main(String[] args) {

     snowFlake(Integer.parseInt(args[0]));
    }

 
    public static void curve(int n, double x1, double y1, double x2, double y2) {

       
        if (n == 0) {
            StdDraw.line(x1, y1, x2, y2);
            return;
        }

        double dx = x2 - x1;
        double dy = y2 - y1;

   
        double xA = x1 + dx / 3.0;
        double yA = y1 + dy / 3.0;

        double xB = x1 + 2.0 * dx / 3.0;
        double yB = y1 + 2.0 * dy / 3.0;

        double xC = (x1 + x2) / 2.0 + (Math.sqrt(3) / 6.0) * (y1 - y2);
        double yC = (y1 + y2) / 2.0 + (Math.sqrt(3) / 6.0) * (x2 - x1);

       
        curve(n - 1, x1, y1, xA, yA);
        curve(n - 1, xA, yA, xC, yC);
        curve(n - 1, xC, yC, xB, yB);
        curve(n - 1, xB, yB, x2, y2);
    }

   
    public static void snowFlake(int n) {
     
       	StdDraw.setXscale(0.0, 1.1);
		StdDraw.setYscale(-0.20, 1.1);





        double x1 = 0.1, y1 = 0.1;
        double x2 = 1.0, y2 = 0.1;
        double x3 = 0.55, y3 = 0.1 + (0.9 * Math.sqrt(3) / 2.0);

       
        curve(n, x1, y1, x3, y3);
		curve(n, x3, y3, x2, y2);
		curve(n, x2, y2, x1, y1);

	}
	
}
