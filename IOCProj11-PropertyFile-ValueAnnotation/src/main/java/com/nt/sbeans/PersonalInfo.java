package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")

//@PropertySource("com/nt/common/myfile.properties")
public class PersonalInfo
{
	//injection values collection from the properties file
	@Value("${per.name}")
	private String name ;
	@Value("{per.addrs}")
	private String addrs;
	@Value("{per.age}")
	private Integer age;
	
	// injecting the  direct values
	@Value("5000036")
	private long PinCode;
	
	//System property 
	@Value("${os.name}")
	private String osName;
	
	@Value("${os.version}")
	private String osVersion;
	
	//injecting env.. variable value
	@Value("${path}")
	private String pathData;
	
	//toString()
	
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", addrs=" + addrs + ", age=" + age + ", PinCode=" + PinCode + ", osName="
				+ osName + ", osVersion=" + osVersion + ", pathData=" + pathData + "]";
	}
}//class end
