class TVAdapter implements TV {
    private GeneralTV generalTV;
    public TVAdapter(GeneralTV generalTV) {
        this.generalTV = generalTV;
    }
    @Override
    public boolean isEnabled() {
        System.out.println("Adapter - TV is enabled: " + generalTV.isEnabled());
        return generalTV.isEnabled();
    }
    @Override
    public void enable() {
        System.out.println("Adapter - Enabling TV");
        generalTV.enable();
    }
    @Override
    public void disable() {
        System.out.println("Adapter - Disabling TV");
        generalTV.disable();
    }
    @Override
    public int getVolume() {
        System.out.println("Adapter - Getting volume: " + generalTV.getVolume());
        return generalTV.getVolume();
    }
    @Override
    public void setVolume(int volume) {
        System.out.println("Adapter - Setting volume to: " + volume);
        generalTV.setVolume(volume);
    }
    @Override
    public int getChannel() {
        System.out.println("Adapter - Getting channel: " + generalTV.getChannel());
        return generalTV.getChannel();
    }
    @Override
    public void setChannel(int channel) {
        System.out.println("Adapter - Setting channel to: " + channel);
        generalTV.setChannel(channel);
    }
}
