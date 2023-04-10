package org.example.BDG.Enumeration.hm_3;

public class Main {
    enum Planet {
        MERCURY("Mercury", 3.285E23, " дальность " +"58 млн/км"),
        VENUS("Venus", 4.867E24, " дальность "+ "108.9/mln"),
        EARTH("Earth", 5.972E24, " дальность "+"150 mln"),
        MARS("Mars", 6.39E23, " дальность "+"228 mln"),
        JUPITER("Jupiter", 1.898E27, " дальность "+"740-816 mln/km"),
        SATURN("Saturn", 5.683E26, " дальность "+"1.325 mlrd/km"),
        URANUS("Uranus", 8.681E25, " дальность "+"2.748 mlrd/km"),
        NEPTUNE("Neptune", 1.024E26, " дальность "+"4.554 mlrd/km");
        public String name;
        public double mass;
        public String distance;

        Planet(String name, double mass, String distance) {
            this.name = name;
            this.mass = mass;
            this.distance = distance;
        }

        public String getName() {
            return name;
        }
        public double getMass(){
            return mass;
        }
        public String getDistance(){
            return distance;
        }
        public static void main(String[] args) {
            for (Planet planet : Planet.values()) {
                System.out.println(planet.getName() + ": " + planet.getMass() + " kg" + planet.getDistance());
            }
        }
    }
}
