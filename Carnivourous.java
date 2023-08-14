interface Carnivourous {
    void capturePrey();

    default void taste() {
        System.out.println("Carnivorous");
    }

    public static void smelly() {
        System.out.println("I smell to bugs");
    };
}
