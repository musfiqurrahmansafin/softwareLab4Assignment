class GeneralTV implements TV {
    // Implementation of GeneralTV
    private boolean powerOn = false;
    private int volume = 43;
    private int channel = 34;
    @Override
    public boolean isEnabled() {
        System.out.println("TV is enabled: " + powerOn);
        return powerOn;
    }
    @Override
    public void enable() {
        powerOn = true;
        System.out.println("TV has been powered on.");
    }
    @Override
    public void disable() {
        powerOn = false;
        System.out.println("TV has been powered off.");
    }
    @Override
    public int getVolume() {
        System.out.println("Current volume: " + volume);
        return volume;
    }
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume set to: " + volume);
    }
    @Override
    public int getChannel() {
        System.out.println("Current channel: " + channel);
        return channel;
    }
    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel set to: " + channel);
    }
}
