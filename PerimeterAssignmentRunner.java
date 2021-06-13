package Perimeter;

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int countpoint = 0;
        for(Point num : s.getPoints()){
            //System.out.println(num);
            countpoint ++;
            
    
        
    }
    return countpoint;
}
    public double getAverageLength(Shape s) {
        // Put code here
        double averagelength;
        averagelength = getPerimeter(s) / getNumPoints(s);
        return averagelength;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        //prevPt.distance=0.0;
        Point prevPt = s.getLastPoint();
        double largest = 0.0;
    for (Point currPt : s.getPoints()) {
         // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            if (currDist>largest){
            largest=currDist;
            
        } 
        
    }
    return largest;
} 

    public double getLargestX(Shape s) {
        // Put code here
        int largestx=-100;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
        if (prevPt.getX()>largestx){
            largestx=prevPt.getX();
            System.out.println(largestx);
        }
    }
    return largestx;
 }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testGetNumPoints () {
    FileResource fr = new FileResource();
    Shape s = new Shape(fr);
    int result = getNumPoints(s);
    System.out.println(result);

    }
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        //double result = getAverageLength(s);
        //double result= getLargestSide(s);
        double result= getLargestX(s);
        System.out.println(result);
        //double length = getPerimeter(s);
        //System.out.println("perimeter = " + length);
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        //pr.testGetNumPoints();
    }
}
