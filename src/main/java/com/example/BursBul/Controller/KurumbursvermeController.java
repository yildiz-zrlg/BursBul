package com.example.BursBul.Controller;


import com.example.BursBul.Model.Kurum;
import com.example.BursBul.Model.Kurumbursverme;
import com.example.BursBul.Service.KurumbursvermeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kurumbursverme")
public class KurumbursvermeController {
    private KurumbursvermeService kurumbursvermeService;

    public KurumbursvermeController(KurumbursvermeService kurumbursvermeService) {
        this.kurumbursvermeService = kurumbursvermeService;
    }
    @PostMapping
    public Kurumbursverme insert(@RequestBody Kurumbursverme kurumbursverme){
        return kurumbursvermeService.createKurumbursverme(kurumbursverme);
    }
    @GetMapping
    public List<Kurumbursverme> getAllKurumbursverme(){
        return kurumbursvermeService.findAllKurumbursverme();
    }
    @GetMapping("/{id}")
    public Kurumbursverme getKurumbursvermeById(@PathVariable("id") String kurumbursvermeId){
        return kurumbursvermeService.getKurumbursvermeById(kurumbursvermeId);
    }
    @PutMapping("/{id}")
    public Kurumbursverme update(@PathVariable("id") String kurumbursvermeId,@RequestBody Kurumbursverme kurumbursverme){
        return kurumbursvermeService.updateKurumbursverme(kurumbursvermeId,kurumbursverme);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String kurumbursvermeId){
        kurumbursvermeService.deleteKurumbursvermeById(kurumbursvermeId);
    }
}
