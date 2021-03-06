package cz.xtf;

public enum Product {
	EAP("eap"),
	JWS("webserver"),
	AMQ("amq"),
	JDG("datagrid"),
	JDV("datavirt"),
	BRMS("decisionserver"),
	BPMS("processserver"),
	SSO("sso"),
	SECRETS("secrets"),
	JAVA("openjdk");
	
	private final String templatePath;

	private Product(String templatePath) {
		this.templatePath = templatePath;
	}

	public String getTemplatePath() {
		return templatePath;
	}
}
