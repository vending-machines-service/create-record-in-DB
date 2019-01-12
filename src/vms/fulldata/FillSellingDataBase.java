package vms.fulldata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import vms.fulldata.jpa.SensorProductJPA;
import vms.fulldata.repo.StatisticsRepository;

@SpringBootApplication
public class FillSellingDataBase {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(FillSellingDataBase.class);
		StatisticsRepository repo = ctx.getBean(StatisticsRepository.class);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		SensorProductJPA jpa1 = new SensorProductJPA(LocalDate.parse("2018-12-12", format), 1, 1, 10);
		repo.save(jpa1);
		SensorProductJPA jpa2 = new SensorProductJPA(LocalDate.parse("2019-01-12"), 1, 2, 10);
		repo.save(jpa2);
		ctx.close();

	}

}
