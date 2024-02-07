class GeneralRemote implements Remote {
    protected TV tv;
    public GeneralRemote(TV tv) {
        this.tv = tv;
    }
    // Implement Remote methods by delegating to TV
    @Override
    public void togglePower() {
        if (tv.isEnabled()) {
            System.out.println("General Remote - Turning off the TV");
            tv.disable();
        } else {
            System.out.println("General Remote - Turning on the TV");
            tv.enable();
        }
    }
    @Override
    public void volumeUp() {
        int currentVolume = tv.getVolume();
        tv.setVolume(currentVolume + 1);
        System.out.println("General Remote - Volume up: " + tv.getVolume());
    }
    @Override
    public void volumeDown() {
        int currentVolume = tv.getVolume();
        tv.setVolume(currentVolume - 1);
        System.out.println("General Remote - Volume down: " + tv.getVolume());
    }
    @Override
    public void channelUp() {
        int currentChannel = tv.getChannel();
        tv.setChannel(currentChannel + 1);
        System.out.println("General Remote - Channel up: " + tv.getChannel());
    }
    @Override
    public void channelDown() {
        int currentChannel = tv.getChannel();
        tv.setChannel(currentChannel - 1);
        System.out.println("General Remote - Channel down: " + tv.getChannel());
    }
}
