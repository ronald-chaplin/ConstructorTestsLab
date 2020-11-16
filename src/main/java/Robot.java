public class Robot {
    private int arms;
    private String alignment;
    private boolean laserEyes;

    public Robot(){
        this.arms = 2;
        this.alignment = "good";
        this.laserEyes = true;
    }

    public Robot(int arms){
        this.arms = arms;
        this.alignment = "good";
        this.laserEyes = true;
    }

   public Robot(String alignment){
        this.arms = 2;
        this.alignment = alignment;
        this.laserEyes = true;
   }

   public Robot(boolean laserEyes){
       this.arms = 2;
       this.alignment = "good";
       this.laserEyes = laserEyes;
   }

   public Robot(int arms, String alignment, boolean laserEyes){
       this.arms = arms;
       this.alignment = alignment;
       this.laserEyes = laserEyes;
   }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public boolean isLaserEyes() {
        return laserEyes;
    }

    public void setLaserEyes(boolean laserEyes) {
        this.laserEyes = laserEyes;
    }
}
