package oysterEnums;


public enum StationZone {
	
	HOLBORN("1"),
	ALDGATE("1"),
    EARLS_COURT("1,2"),
    ARSENAL("2"),
    HAMMERSMITH("2"),
    WIMBLEDON("3");
	
	private String zone;

    private StationZone(String zone)
    {
        this.zone = zone;
    }

    
    public String getZone() {
       return zone;
    }
    }