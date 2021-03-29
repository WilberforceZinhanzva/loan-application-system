package zw.co.nimblecode.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.nimblecode.entities.LoanApplication;
import zw.co.nimblecode.enums.LoanApplicationStatus;
import zw.co.nimblecode.models.LoanApplicationModel;
import zw.co.nimblecode.repositories.LoanApplicationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationService {
    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    public LoanApplication newLoanApplication(LoanApplicationModel model){
        return loanApplicationRepository.save(new LoanApplication(model));
    }

    public LoanApplication singleLoanApplication(Integer id){
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(id);
        if(loanApplicationOptional.isPresent())
            return loanApplicationOptional.get();
        else
            return null;

    }

    public List<LoanApplication> allLoanApplications(){
        return loanApplicationRepository.findAll();
    }

    public LoanApplication approveLoan(Integer id){
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(id);
        if(loanApplicationOptional.isPresent()){
            LoanApplication loanApplication = loanApplicationOptional.get();
            loanApplication.setStatus(LoanApplicationStatus.APPROVED.name());
            return loanApplicationRepository.save(loanApplication);

        }else{
            return null;
        }
    }

    public LoanApplication rejectLoan(Integer id){
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(id);
        if(loanApplicationOptional.isPresent()){
            LoanApplication loanApplication = loanApplicationOptional.get();
            loanApplication.setStatus(LoanApplicationStatus.REJECTED.name());
            return loanApplicationRepository.save(loanApplication);
        }else{
            return null;
        }
    }

    public LoanApplication reviewLoan(Integer id){
        Optional<LoanApplication> loanApplicationOptional = loanApplicationRepository.findById(id);
        if(loanApplicationOptional.isPresent()){
            LoanApplication loanApplication = loanApplicationOptional.get();
            loanApplication.setStatus(LoanApplicationStatus.UNDER_CONSIDERATION.name());
            return loanApplicationRepository.save(loanApplication);
        }else{
            return null;
        }

    }
}
