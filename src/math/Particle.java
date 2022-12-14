package math;

public class Particle {
    private String nameID;
    private double mass;
    private double velocity;
    private double acceleration;
    public Particle(String nameX, double massX, double velocityX, double accelerationX){
        this.nameID = nameX;
        this.mass = massX;
        this.velocity = velocityX;
        this.acceleration = accelerationX;
    }
    public Particle(double massX, double velocityX, double accelerationX){
        this.nameID = "unknown";
        this.mass = massX;
        this.velocity = velocityX;
        this.acceleration = accelerationX;
    }
    public Particle(String nameX, double massX, double accelerationX){
        this.nameID = nameX;
        this.mass = massX;
        this.velocity = 0.0;
        this.acceleration = accelerationX;
    }
    public Particle(String nameX, double massX){
        this.nameID = nameX;
        this.mass = massX;
        this.velocity = 0.0;
        this.acceleration = 0.0;
    }
    public String toString(){
        return this.nameID + ": \nMass: " + this.mass + "\nVelocity: " + this.velocity + "\nAcceleration: " + this.acceleration;
    }
    public double getVelocity(){
        return this.velocity;
    }
    public double getMass(){
        return this.mass;
    }

    public double getAcceleration() {
        return this.acceleration;
    }
    public String getNameID(){
        return this.nameID;
    }
    public void setNameID(String nameX){
        this.nameID = nameX;
    }
    public void setMass(double massX){
        this.mass = massX;
    }
    public void setAcceleration(double accelerationX){
        this.acceleration = accelerationX;
    }
    public void setVelocity(double velocityX){
        this.velocity = velocityX;
    }
}
