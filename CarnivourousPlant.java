abstract class CarnivourousPlant {
    private String name;
    private boolean isHungry;

    public CarnivourousPlant(String name) {
        this.name = name;
        this.isHungry = true;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsHungry() {
        return this.isHungry;
    }

    public void setIsHungry(boolean hungry) {
        this.isHungry = hungry;
    }

}
