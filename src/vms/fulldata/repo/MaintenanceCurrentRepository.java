package vms.fulldata.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vms.fulldata.jpa.MTRecordCurrentJPA;



public interface MaintenanceCurrentRepository extends JpaRepository<MTRecordCurrentJPA, String>{

	List<MTRecordCurrentJPA> findByMachineId(int machineId);
}
