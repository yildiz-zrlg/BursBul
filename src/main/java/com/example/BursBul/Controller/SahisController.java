package com.example.BursBul.Controller;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Model.Sahis;
import com.example.BursBul.Service.SahisService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sahis")
public class SahisController {
    private SahisService sahisService;

    public SahisController(SahisService sahisService) {
        this.sahisService = sahisService;
    }
    @PostMapping
    public Sahis insert(@RequestBody Sahis sahis){
        return sahisService.createSahis(sahis);
    }
    @GetMapping
    public List<Sahis> getAllSahis(){
        return sahisService.findAllSahis();
    }
    @GetMapping("/{id}")
    public Sahis getSahisById(@PathVariable("id") String sahisId){
        return sahisService.getSahisById(sahisId);
    }
    @PutMapping("/{id}")
    public Sahis update(@PathVariable("id") String sahisId,@RequestBody Sahis sahis){
        return sahisService.updateSahis(sahisId,sahis);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String sahisId){
        sahisService.deleteSahisById(sahisId);
    }
}
