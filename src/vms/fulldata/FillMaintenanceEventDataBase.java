package vms.fulldata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vms.fulldata.jpa.MTRecordCurrentJPA;
import vms.fulldata.repo.MaintenanceCurrentRepository;


@SpringBootApplication
public class FillMaintenanceEventDataBase {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(FillSellingDataBase.class);
		MaintenanceCurrentRepository repo = ctx.getBean(MaintenanceCurrentRepository.class);
		MTRecordCurrentJPA jpa1 = new MTRecordCurrentJPA(1, 101);
		repo.save(jpa1);
		ctx.close();
	}

}
