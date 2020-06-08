package l2;

import java.util.ArrayList;
import java.util.Scanner;
public class Lab2Classes {
	private static final int COUNT_POINTS = 3; 
	private static Scanner in = new Scanner(System.in);

public static void main(String[] args) {
	ArrayList<Point3D> points = readPoints(COUNT_POINTS);
	double area = computeArea(points); 
	System.out.println(area);
	} 
public static double computeArea(ArrayList<Point3D> points)
{ 
	if (points.size() != 3) 
	{ 
		System.out.println("Need 3 points!");
		return 0; 
		} 
	for 
	(int i = 0; i < points.size(); i++) 
	{ 
		for (int j = i + 1;
				j < points.size();
				j++) 
		{ 
			if (points.get(i).compare(points.get(j))) 
			{ 
				System.out.println("All points should be different!");
				return 0;
				}
			}
		}
	Point3D p1 = points.get(0);
	Point3D p2 = points.get(1); 
	Point3D p3 = points.get(2); 
	double a = p1.distanceTo(p2); 
	double b = p2.distanceTo(p3); 
	double c = p3.distanceTo(p1); 
	double p = (a + b + c) / 2; 
	return Math.sqrt(p * (p - a) * (p - b) * (p - c)); } 
private static ArrayList<Point3D> readPoints(int count) 
{ ArrayList<Point3D> points = new ArrayList<>();
for 
(int i = 1; i <= count; i++) 
{ 
	System.out.println(String.format("Print %d point", i));
	points.add(readPoint());
	} 
return points;
} 
private static Point3D readPoint() 
{ 
	System.out.print("Print X: ");
	double x = Double.parseDouble(in.nextLine());
	System.out.print("Print Y: ");
	double y = Double.parseDouble(in.nextLine());
	System.out.print("Print Z: "); 
	double z = Double.parseDouble(in.nextLine());
	return new Point3D(x, y, z); 
	} 
} 