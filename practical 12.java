class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        double cube = vc.calculateVolume(3);
        double rectangularCube = vc.calculateVolume(4, 5, 6);
        double sphere = vc.calculateVolume(3, true);

        System.out.println("Volume of Cube: " + cube);
        System.out.println("Volume of Rectangular Cube: " + rectangularCube);
        System.out.println("Volume of Sphere: " + sphere);
    }
}