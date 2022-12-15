package com.example.BursBul.Controller;


import com.example.BursBul.Model.Sahis;
import com.example.BursBul.Model.Sahisbursverme;
import com.example.BursBul.Service.SahisbursvermeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sahisbursverme")
@RestController
public class SahisbursvermeController {
    private SahisbursvermeService sahisbursvermeService;

    public SahisbursvermeController(SahisbursvermeService sahisbursvermeService) {
        this.sahisbursvermeService = sahisbursvermeService;
    }
    @PostMapping
    public Sahisbursverme insert(@RequestBody Sahisbursverme sahisbursverme){
        return sahisbursvermeService.createSahisbursverme(sahisbursverme);
    }
    @GetMapping
    public List<Sahisbursverme> getAllSahisbursverme(){
        return sahisbursvermeService.findAllSahisbursverme();
    }
    @GetMapping("/{id}")
    public Sahisbursverme getSahisbursvermeById(@PathVariable("id") String sahisbursvermeId){
        return sahisbursvermeService.getSahisbursvermeById(sahisbursvermeId);
    }
    @PutMapping("/{id}")
    public Sahisbursverme update(@PathVariable("id") String sahisbursvermeId,@RequestBody Sahisbursverme sahisbursverme){
        return sahisbursvermeService.updateSahisbursverme(sahisbursvermeId,sahisbursverme);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String sahisbursvermeId){
        sahisbursvermeService.deleteSahisbursvermeById(sahisbursvermeId);
    }
}
