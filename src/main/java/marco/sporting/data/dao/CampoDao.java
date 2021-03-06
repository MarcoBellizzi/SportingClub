package marco.sporting.data.dao;

import marco.sporting.data.entity.Campo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoDao extends JpaRepository<Campo, Long> {
}
