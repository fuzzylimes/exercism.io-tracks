class SpaceAge {

    private static double seconds, mercury, venus, mars, jupiter, saturn, uranus, neptune;

    SpaceAge(double seconds) {
        this.seconds = seconds;
        this.mercury = 0.2408467;
        this.venus = 0.61519726;
        this.mars = 1.8808158;
        this.jupiter = 11.862615;
        this.saturn = 29.447498;
        this.uranus = 84.016846;
        this.neptune = 164.79132;
    }

    double getSeconds() {
        double earth = 31557600;
        return seconds/earth;
    }

    double onEarth() {
        return getSeconds();
    }

    double onMercury() {
        return getSeconds() / mercury;
    }

    double onVenus() {
        return getSeconds() / venus;
    }

    double onMars() {
        return getSeconds() / mars;
    }

    double onJupiter() {
        return getSeconds() / jupiter;
    }

    double onSaturn() {
        return getSeconds() / saturn;
    }

    double onUranus() {
        return getSeconds() / uranus;
    }

    double onNeptune() {
        return getSeconds() / neptune;
    }

}
