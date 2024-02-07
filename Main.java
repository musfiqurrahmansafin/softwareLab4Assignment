public class Main {
    public static void main(String[] args) {
        GeneralTV generalTV = new GeneralTV();
        SmartTV smartTV = new SmartTV();
        TVAdapter generalTVAdapter = new TVAdapter(generalTV);
        TV generalTVFlyweight = TVFlyweightFactory.getGeneralTV(); // Using Flyweight pattern
        SmartRemote smartRemote = new SmartRemote(smartTV);
        // Use remotes to operate TVs
        GeneralRemote generalRemote = new GeneralRemote(generalTVAdapter);
        generalRemote.togglePower();
        generalRemote.volumeUp();
        generalRemote.channelUp();
        SmartRemote anotherSmartRemote = new SmartRemote(generalTVFlyweight); // Using Flyweight pattern
        anotherSmartRemote.togglePower();
        anotherSmartRemote.showYoutube();
    }
}