public class Plane {

    private float fuelLevel;
    private String pilotCallSign;
    private String squadNumber;

    private boolean flaps = true;
    private boolean landingGear = false;
    private boolean ejectionSystem = false;

    private boolean seatOccupation = true;

    public Plane() {
    }

    public Plane(float fuelLevel, String pilotCallSign, String squadNumber) {
        this.fuelLevel = fuelLevel;
        this.pilotCallSign = pilotCallSign;
        this.squadNumber = squadNumber;

        // Completa el código para cumplir con los requisitos.
    }

    Plane plane = new Plane();

    public void generateF18(float fuel, String pilotName, String squad) {

        Plane avion = new Plane(fuel, pilotName, squad);

        plane = avion;

        System.out.println(plane);
    }

    public void toggleFlaps() {
        flaps = !flaps;
        if (flaps == true) {
            System.out.println("Subiendo flaps...");
        } else {
            System.out.println("Bajando flaps...");
        }
    }

    public void toggleLandingGear() {
        landingGear = !landingGear;
    }

    public void ejectionSystem() {
        ejectionSystem = !ejectionSystem;
    }

    public void setSeatOccupation(boolean pilotSeated) {
        seatOccupation = pilotSeated;
    }

    public String getFlaps() {
        if (flaps == true) {
            return "Arriba";
        } else {
            return "Abajo";
        }
    }

    public String getLandingGear() {
        if (landingGear == true) {
            return "Arriba";
        } else {
            return "Abajo";
        }
    }

    public String getEjectionSystem() {
        if (ejectionSystem == true) {
            return "Armado";
        } else {
            return "Desarmado";
        }
    }

    public String getSeatOccupation() {
        if (ejectionSystem == true) {
            return "Verdadero";
        } else {
            return "Falso";
        }
    }

    @Override
    public String toString() {
        return "\t- - - - Plane - - - -\n" +
                "\n\t flaps -> " + plane.getFlaps() +
                "\n\t landingGear -> " + plane.getLandingGear() +
                "\n\t ejectionSystem -> " + plane.getEjectionSystem() +
                "\n\t seatOccupation -> " + plane.getSeatOccupation();
    }
}
