package zw.co.nimblecode.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.nimblecode.entities.LoanApplication;
import zw.co.nimblecode.models.LoanApplicationModel;
import zw.co.nimblecode.services.LoanApplicationService;

import java.util.List;

@RestController
@RequestMapping(value="/loan")
public class LoanApplicationController {
    @Autowired
    private LoanApplicationService loanApplicationService;


    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<LoanApplication> newLoanApplication(@RequestBody LoanApplicationModel model){
        LoanApplication savedLoanApplication= loanApplicationService.newLoanApplication(model);
        if( savedLoanApplication != null)
            return new ResponseEntity<>(savedLoanApplication,HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<LoanApplication>> allLoanApplications(){
        List<LoanApplication> loanApplications = loanApplicationService.allLoanApplications();
        if(loanApplications != null)
            return new ResponseEntity<>(loanApplications,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.CONFLICT);
    }

    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public ResponseEntity<LoanApplication> singleLoanApplication(@PathVariable("id") Integer id){
        LoanApplication loanApplication = loanApplicationService.singleLoanApplication(id);
        if(loanApplication != null)
            return new ResponseEntity<>(loanApplication,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }



    @RequestMapping(value="/{id}/approve",method=RequestMethod.PUT)
    public ResponseEntity<LoanApplication> approveLoan(@PathVariable("id") Integer id){
        LoanApplication loanApplication = loanApplicationService.approveLoan(id);
        if(loanApplication != null)
            return new ResponseEntity<>(loanApplication,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @RequestMapping(value="/{id}/reject",method=RequestMethod.PUT)
    public ResponseEntity<LoanApplication> rejectLoan(@PathVariable("id") Integer id){
        LoanApplication loanApplication = loanApplicationService.rejectLoan(id);
        if(loanApplication != null)
            return new ResponseEntity<>(loanApplication,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @RequestMapping(value="/{id}/review", method=RequestMethod.PUT)
    public ResponseEntity<LoanApplication> reviewLoan(@PathVariable("id") Integer id){
        LoanApplication loanApplication = loanApplicationService.reviewLoan(id);
        if(loanApplication!=null){
            return new ResponseEntity<>(loanApplication,HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
