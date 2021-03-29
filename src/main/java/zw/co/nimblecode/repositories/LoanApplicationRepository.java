package zw.co.nimblecode.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.nimblecode.entities.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication,Integer> {
}
