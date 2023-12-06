public final class Point3D implements Comparable<Point3D> {
    private final double x;
    private final double y;
    private final double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static boolean less(Point3D pointOne, Point3D pointTwo) {
        return (pointOne.z < pointTwo.z ||
                (pointOne.z == pointTwo.z && (pointOne.y < pointTwo.y ||
                        (pointOne.y == pointTwo.y && pointOne.x < pointTwo.x))));
    }

    @Override
    public int compareTo(Point3D other) {
        if (this == other) {
            return 0;
        }
        else if (less(this, other)) {
            return -1;
        }
        else {
            return 1;
        }
    }
}

