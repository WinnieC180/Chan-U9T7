public class ThreeDPoint extends Point{

    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)) {
            if (!(obj instanceof ThreeDPoint)) {
                return false;
            }
            ThreeDPoint three = (ThreeDPoint) obj;
            if (z == three.z) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
