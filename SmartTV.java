class SmartTV implements TV {
    // Implementation of SmartTV
    private boolean powerOn = false;
    private int volume = 13;
    private int channel = 23;
    @Override
    public boolean isEnabled() {
        System.out.println("SmartTV is enabled: " + powerOn);
        return powerOn;
    }
    @Override
    public void enable() {
        powerOn = true;
        System.out.println("SmartTV has been powered on.");
    }
    @Override
    public void disable() {
        powerOn = false;
        System.out.println("SmartTV has been powered off.");
    }
    @Override
    public int getVolume() {
        System.out.println("Current volume of SmartTV: " + volume);
        return volume;
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume of SmartTV set to: " + volume);
    }
    @Override
    public int getChannel() {
        System.out.println("Current channel of SmartTV: " + channel);
        return channel;
    }
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel of SmartTV set to: " + channel);
    }
    public void Youtube() {
        // Implementation of Youtube method
        System.out.println("SmartTV - Playing Youtube");
    }
}
