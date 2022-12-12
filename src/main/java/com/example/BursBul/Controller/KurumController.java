package com.example.BursBul.Controller;


import com.example.BursBul.Model.Kurum;
import com.example.BursBul.Service.KurumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kurum")
public class KurumController {
    private KurumService kurumService;

    public KurumController(KurumService kurumService) {
        this.kurumService = kurumService;
    }
    @PostMapping
    public Kurum insert(@RequestBody Kurum kurum){
        return kurumService.createKurum(kurum);
    }
    @GetMapping
    public List<Kurum> getAllKurum(){
        return kurumService.findAllKurum();
    }
    @GetMapping("/{id}")
    public Kurum getKurumById(@PathVariable("id") String kurumId){
        return kurumService.getKurumById(kurumId);
    }
    @PutMapping("/{id}")
    public Kurum update(@PathVariable("id") String kurumId,@RequestBody Kurum kurum){
        return kurumService.updateKurum(kurumId,kurum);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String kurumId){
        kurumService.deleteKurumById(kurumId);
    }
}
