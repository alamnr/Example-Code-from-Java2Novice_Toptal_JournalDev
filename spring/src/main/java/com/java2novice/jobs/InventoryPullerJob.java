package com.java2novice.jobs;

import org.springframework.scheduling.annotation.Scheduled;

public class InventoryPullerJob {
	
	@Scheduled(fixedDelay=5000)
	public void updateEmployeeInventoryFixedDelay(){
		System.out.println(" Started fixed delay job");
		
		// add your  schedule job logic here
	}
	
	@Scheduled(fixedRate=5000)
	public void updateEmployeeInventoryFixedRate(){
		System.out.println(" Started fixed rate job");
		
		// add your  schedule job logic here
	}
	
	@Scheduled(fixedRate=60*60*1000, initialDelay=10*60*1000)
	public void updateEmployeeInventoryFixedRateInitialDelay(){
		System.out.println(" Started fixed rate job with initial delay");
		
		// add your  schedule job logic here
	}
	
	
	@Scheduled(cron="*/2 * * * * MON-FRI")
    public void updateEmployeeInventoryCron(){
        System.out.println("Started cron job");
        /**
         * add your scheduled job logic here
         */
    }


}
