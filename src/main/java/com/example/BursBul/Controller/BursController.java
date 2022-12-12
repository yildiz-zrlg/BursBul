package com.example.BursBul.Controller;

import com.example.BursBul.Model.Burs;
import com.example.BursBul.Service.BursService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/burs")
public class BursController {
    private BursService bursService;

    public BursController(BursService bursService) {
        this.bursService = bursService;
    }
    @PostMapping
    public Burs insert(@RequestBody Burs burs){
        return bursService.createBurs(burs);
    }
    @GetMapping
    public List<Burs> getAllBurs(){
        return bursService.findAllBurs();
    }
    @GetMapping("/{id}")
    public Burs getBursById(@PathVariable("id") String bursId){
        return bursService.getBursById(bursId);
    }
    @PutMapping("/{id}")
    public Burs update(@PathVariable("id") String bursId,@RequestBody Burs burs){
        return bursService.updateBurs(bursId,burs);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String bursId){
        bursService.deleteBursById(bursId);
    }
}
