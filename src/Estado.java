public enum Estado {
	AC("N"), AL("NE"), AM("N"), AP("N"), BA("NE"), CE("NE"), DF("C"), ES("SE"), GO("C"), 
	MA("NE"), MG("SE"), MS("C"), MT("C"), PA("N"), PB("NE"), PE("NE"), PI("NE"), PR("S"), 
	RJ("SE"), RN("NE"), RO("N"), RR("N"), RS("S"), SC("S"), SE("NE"), SP("SE"), TO("NE");
	
	private final String region;
	Estado(String region){
        this.region = region;
    }
	
    public String getRegion(){
        return this.region;
    }
}