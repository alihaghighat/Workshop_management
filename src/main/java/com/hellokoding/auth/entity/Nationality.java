package com.hellokoding.auth.entity;

public enum Nationality {
	AFGHAN("Afghan"),
	AMERICAN("American"),
	ARGENTINEAN("Argentinean"),
	AUSTRALIAN("Australian"),
	AUSTRIAN("Austrain"),
	AZERBAIJANI("Azerbaijani"),
	BANGLADESHI("Bangladeshi"),
	BELGIAN("Belgian"),
	BRAZILIAN("Branzilian"),
	BRITISH("British"),
	CANADIAN("Canadian"),
	CENTRAL_AFRICAN("Central African"),
	CHILEAN("Chilean"),
	CHINESE("Chinese"),
	COLOMBIAN("Colombian"),
	CZECH("Czech"),
	FRENCH("French"),
	GERMAN("German"),
	GREEK("Greek"),
	ICELANDER("Icelander"),
	INDIAN("Indian"),
	INDONESIAN("indonesian"),
	IRANIAN("Iranian"),
	IRAQI("Iraqi"),
	IRISH("Irish"),
	ITALIAN("Italian"),
	JAPANESE("Japanese"),
	LEBANESE("Lebanese"),
	MEXICAN("Mexican"),
	MOROCCAN("Moroccan"),
	NIGERIAN("Nigerian"),
	NORTH_KOREAN("North Korean"),
	OMANI("Omani"),
	PAKISTANI("Pakistani"),
	POLISH("Polish"),
	QATARI("Qatari"),
	ROMANIAN("Romanian"),
	RUSSIAN("Russian"),
	SAUDI("Saudi"),
	SCOTTISH("Scottish"),
	SERBIAN("Serbian"),
	SLOVAKIAN("Slovakian"),
	SOUTH_AFRICAN("South African"),
	SOUTH_KOREAN("South Korean"),
	SPANISH("Spanish"),
	SWEDISH("Swedish"),
	SWISS("Swiss"),
	TAJIK("Tajic"),
	TURKISH("Turkish"),
	UKRAINIAN("Ukrainian"),
	URUGUAYAN("Uruguayan"),
	UZBEKISTANI("Uzbekistani"),
	VENEZUELAN("Venezuelan"),
	YEMENITE("Yemenite");
	private final String name;       

    private Nationality(String s) {
        name = s;
    }


    public String toString() {
       return this.name;
    }

}
