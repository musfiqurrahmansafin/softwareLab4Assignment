class SmartRemote extends GeneralRemote {
    public SmartRemote(TV tv) {
        super(tv);
    }
    public void showYoutube() {
        if (tv instanceof SmartTV) {
            System.out.println("Smart Remote - Showing Youtube on SmartTV");
            ((SmartTV) tv).Youtube();
        } else {
            System.out.println("Smart Remote - Youtube is not supported on this TV");
        }
    }
}
