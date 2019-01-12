package vms.fulldata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vms.fulldata.jpa.MFRecordCurrentJPA;
import vms.fulldata.repo.MalfunctionCurrentRepository;

@SpringBootApplication
public class FillMalfunctionEventDataBase {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(FillSellingDataBase.class);
		MalfunctionCurrentRepository repo = ctx.getBean(MalfunctionCurrentRepository.class);
		MFRecordCurrentJPA jpa1 = new MFRecordCurrentJPA(1, 1);
		repo.save(jpa1);
		ctx.close();

	}

}
