class VolumeOfEarth {
    	public static void main(String[] args) {
        double radiusKm = 6378;
        double radiusMiles = radiusKm * 0.621371;
        double pi = Math.PI;
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);
        System.out.print("The volume of Earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
}
}
