import java.applet.Applet;
import java.awt.*; //using awt for better compatibility

/**
 * Created with IntelliJ IDEA.
 * User: eric
 * Assignment:  Pie chart applet
 * Date: 5/14/14
 * Time: 6:05 PM
 */
public class pieApplet extends Applet {
    public void paint(Graphics g) {
        double Eng, Spa, oEur, asianPac;// % of languages spoken in the united states
        int x = 0, y = 0, w = 250, h = 250;	// defines the size of the pie
        int startAngle, degrees;	// will be used to draw a pie slice

        // Set the # of students in each disipline
        Eng = 80;
        Spa = 12.4;
        oEur = 3.7;
        asianPac = 3.0;


        // Display the Pie Chart

        // Draw the Pie for languages
        startAngle = 0;
        degrees = (int)(Eng * 360 / 100);

        g.setColor(Color.cyan);
        g.fillArc(x, y, w, h, startAngle, degrees);

        // Draw the Pie for Soc
        startAngle = degrees;
        degrees = (int)(Spa * 360 / 100);

        g.setColor(Color.red);
        g.fillArc(x, y, w, h, startAngle, degrees);

        // Draw the Pie for Hum
        startAngle = startAngle + degrees;
        degrees = (int)(oEur * 360 / 100);

        g.setColor(Color.yellow);
        g.fillArc(x, y, w, h, startAngle, degrees); // offset this slice a little

        //Draw Asain and pacific island
        startAngle = startAngle + degrees;
        degrees = (int)(asianPac * 360 / 100);

        g.setColor(Color.blue);
        g.fillArc(x, y, w, h, startAngle, degrees);

    }
}
