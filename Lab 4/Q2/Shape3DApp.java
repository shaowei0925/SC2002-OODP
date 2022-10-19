package Q2;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numShapes = 0;
        int shapeChoice = 0;
        double tempLength, tempWidth, tempHeight;
        double totalSurfaceArea = 0;

        System.out.println("Enter number of 3D-shapes to produce:");
        numShapes = sc.nextInt();

        for(int i=0; i<numShapes; i++){
            System.out.println("...Choose shape #" + (i + 1));
            System.out.println("Enter 1 for Sphere, 2 for Cuboid, 3 for Cube, 4 for Pyramid, 5 for Cone, 6 for Cylinder");
            shapeChoice = sc.nextInt();

            switch(shapeChoice){
                case 1:
                    System.out.println("Sphere chosen");
                    System.out.println("...Enter radius");
                    Sphere sphere = new Sphere(sc.nextDouble());
                    System.out.println("Surface Area is " + sphere.getSurfaceArea());
                    totalSurfaceArea += sphere.getSurfaceArea();
                    break;

                case 2:
                    System.out.println("Cuboid chosen");
                    System.out.println("...Enter length");
                    tempLength = sc.nextDouble();
                    System.out.println("...Enter width");
                    tempWidth = sc.nextDouble();
                    System.out.println("...Enter height");
                    tempHeight = sc.nextDouble();
                    Cuboid cuboid = new Cuboid(tempLength, tempWidth,tempHeight);
                    System.out.println("Surface Area is " + cuboid.getSurfaceArea());
                    totalSurfaceArea += cuboid.getSurfaceArea();
                    break;

                case 3:
                    System.out.println("Cube chosen");
                    System.out.println("...Enter side");
                    Cube cube = new Cube(sc.nextDouble());
                    System.out.println("Surface Area is " + cube.getSurfaceArea());
                    totalSurfaceArea += cube.getSurfaceArea();
                    break;

                case 4:
                    System.out.println("Pyramid chosen");
                    System.out.println("...Enter height");
                    tempHeight = sc.nextDouble();
                    System.out.println("...Enter base length");
                    tempLength = sc.nextDouble();
                    System.out.println("...Enter base width");
                    tempWidth = sc.nextDouble();
                    Pyramid pyramid = new Pyramid(tempHeight, tempLength,tempWidth);
                    System.out.println("Surface area is " + pyramid.getSurfaceArea());
                    totalSurfaceArea += pyramid.getSurfaceArea();
                    break;

                case 5:
                    System.out.println("Cone chosen");
                    System.out.println("...Enter radius");
                    tempLength = sc.nextDouble();
                    System.out.println("...Enter slant height");
                    tempHeight = sc.nextDouble();
                    Cone cone = new Cone(tempLength, tempHeight);
                    System.out.println("Surface area is " + cone.getSurfaceArea());
                    totalSurfaceArea += cone.getSurfaceArea();
                    break;  

                case 6:
                    System.out.println("Cylinder chosen");
                    System.out.println("...Enter radius");
                    tempLength = sc.nextDouble();
                    System.out.println("...Enter height");
                    tempHeight = sc.nextDouble();
                    Cylinder cylinder = new Cylinder(tempLength, tempHeight);
                    System.out.println("Surface area is " + cylinder.getSurfaceArea());
                    totalSurfaceArea += cylinder.getSurfaceArea();
                    break;
                  default:
                    shapeChoice = 0;

                
            }   
        }
        sc.close();
        System.out.println(String.format("Total surface area of all the shape is %f", totalSurfaceArea));
        System.out.println("### Program ended ###");
        System.exit(0);
        
    };

}



