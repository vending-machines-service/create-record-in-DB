package vms.fulldata.jpa;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @ToString @EqualsAndHashCode
@Entity
@Table(name = "current_mulfunction")
public class MTRecordCurrentJPA {
	
	@Id
	String id;
	@Column(name="date_open")
	LocalDate dateOpen;
	@Column(name="machine_id")
	int machineId;
	@Column(name="sensor_id")
	int sensorId;
	@Column(name="user_id")
	int userId;
	


	public MTRecordCurrentJPA(int machineId, int sensorId) {
		super();
		this.id = String.format("%d-%d", machineId, sensorId);
		this.dateOpen = LocalDate.now();
		this.machineId = machineId;
		this.sensorId = sensorId;
		this.userId = 0;
	}
	
//	public RecordCurrentDTO convertJPAtoDTO() {
//		return new RecordCurrentDTO(OperationStatusEnum.MAINTENANCE, id, dateOpen, userId);
//	}

	

}
