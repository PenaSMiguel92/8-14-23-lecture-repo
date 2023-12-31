abstract class CarnivourousPlant implements Carnivourous {
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

    @Override 
    public abstract void capturePrey();

    public void printStatus() {
        System.out.println("Plant: " + name + ", Hungry: " + isHungry);
    }

}
