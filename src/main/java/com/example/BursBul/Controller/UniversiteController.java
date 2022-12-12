package com.example.BursBul.Controller;


import com.example.BursBul.Model.Universite;
import com.example.BursBul.Service.UniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    private UniversiteService universiteService;

    public UniversiteController(UniversiteService universiteService) {
        this.universiteService = universiteService;
    }
    @PostMapping
    public Universite insert(@RequestBody Universite universite){
        return universiteService.createUniversite(universite);
    }
    @GetMapping
    public List<Universite> getAllUniversite(){
        return universiteService.findAllUniversite();
    }
    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable("id") String universiteId){
        return universiteService.getUniversiteById(universiteId);
    }
    @PutMapping("/{id}")
    public Universite update(@PathVariable("id") String universiteId,@RequestBody Universite universite){
        return universiteService.updateUniversite(universiteId,universite);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String universiteId){
        universiteService.deleteUniversiteById(universiteId);
    }
}
