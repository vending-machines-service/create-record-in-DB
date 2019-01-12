package vms.fulldata.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vms.fulldata.jpa.MFRecordCurrentJPA;


public interface MalfunctionCurrentRepository extends JpaRepository<MFRecordCurrentJPA, String> {

	List<MFRecordCurrentJPA> findByMachineId(int machineId);

}
