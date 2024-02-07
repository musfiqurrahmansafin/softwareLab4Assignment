class TVFlyweightFactory {
    private static final TV generalTV = new GeneralTV();
    public static TV getGeneralTV() {
        System.out.println("Flyweight Factory - Returning shared General TV instance");
        return generalTV;
    }
}
