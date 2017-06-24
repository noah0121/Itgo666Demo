package com.demo;

import com.demo.clien.CountryCodeType;
import com.demo.clien.DealerDetailsType;
import com.demo.clien.Evhc;
import com.demo.clien.EvhcProviderDetailsType;
import com.demo.clien.EvhcSoap;
import com.demo.clien.GetJobsByEvhc;
import com.demo.clien.GetJobsByEvhcResponse;
import com.demo.clien.JobsByEvhcRequestType;
import com.demo.clien.JobsByEvhcResponseType;
import com.demo.clien.VehicleType;

public class Test {
	public static void main(String[] args) {
		Evhc evhc = new Evhc();
		EvhcSoap stub = evhc.getEvhcSoap();
		GetJobsByEvhc parameter = new GetJobsByEvhc();
		JobsByEvhcRequestType jobsByEvhcRequest= new JobsByEvhcRequestType();
		DealerDetailsType ddt = new DealerDetailsType();
		ddt.setManufacturer("VM");
		ddt.setCountryCode(CountryCodeType.CN);
		ddt.setDealerIdentificationCode("CNUevhc");
		ddt.setPassword("CNU8D8M");
		ddt.setLanguageCode("ZH");
		VehicleType tv = new VehicleType();
		tv.setVinMatch("SALGA2EE0DA105481");
		
		EvhcProviderDetailsType epd = new EvhcProviderDetailsType();
		epd.setId(111);
		epd.setPassword("JPmY24UJ");
		
		jobsByEvhcRequest.setDealerDetails(ddt);
		jobsByEvhcRequest.setVehicleMatch(tv);
		jobsByEvhcRequest.setEvhcProviderDetails(epd);
		parameter.setJobsByEvhcRequest(jobsByEvhcRequest);
		GetJobsByEvhcResponse res = stub.getJobsByEvhc(parameter);
		System.out.println("========³É¹¦=========");
		JobsByEvhcResponseType jobRes = res.getJobsByEvhcResponse();
		System.out.println(jobRes.getVehicle().getRegMatch());
	
		
		
	}
}
