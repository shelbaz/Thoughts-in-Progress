package thirdsem;

import javax.swing.*;

import java.awt.*;
import java.util.Random;
 
public class Histogram extends JPanel 
{
		Random randomGenerator = new Random();
		
        // Count the occurrences of 26 letters
        private int[] count;
        private int lastSorted = 0;
 
        /** Set the count and display histogram */
        public void showHistogram(int[] count) 
        {
                this.count = count;
                repaint();
        }
        
        void lastSorted(int index)
        {
        	lastSorted = index;
        }
        
        @Override /** Paint the histogram */
        protected void paintComponent(Graphics g) 
        {
                if (count == null) return; // No display if count is null
 
                super.paintComponent(g);
                
                g.setColor(Color.BLACK);
 
                // Find the panel size and bar width and interval dynamically
                int width = getWidth();
                int height = getHeight();
                int interval = (width - 40) / count.length;
                int individualWidth = (int)(((width - 40) / 24) * 0.35);
 
                // Find the maximum count. The maximum count has the highest bar
                int maxCount = 0;
                for (int i = 0; i < count.length; i++) 
                {
                        if (maxCount < count[i])
                                maxCount = count[i];
                }
 
                // x is the start position for the first bar in the histogram
                int x = 30;
 
                // Draw a horizontal base line
                g.drawLine(10, height - 45, width - 10, height - 45);
                for (int i = 0; i < count.length; i++) 
                {
                        // Find the bar height
                        int barHeight = (int)(((double)count[i] / (double)maxCount) * (height - 55));
 
                        // Display a bar (i.e., rectangle)
                        if(i == lastSorted)
                        {
                        	g.setColor(new Color(randomGenerator.nextInt(255) ,randomGenerator.nextInt(255) ,randomGenerator.nextInt(255)));
                        	g.fillRect(x, height - 45 - barHeight, individualWidth, barHeight);
                        	g.setColor(Color.BLACK);
                        }
                        
                        g.drawRect(x, height - 45 - barHeight, individualWidth, barHeight);
                         
                        // Display a letter under the base line
                        g.drawString(count[i]+"", x, height - 30);
 
                        // Move x for displaying the next character
                        x += interval;
                }
        }
 
        @Override
        public Dimension getPreferredSize() 
        {
                return new Dimension(1000, 250);
        }
}