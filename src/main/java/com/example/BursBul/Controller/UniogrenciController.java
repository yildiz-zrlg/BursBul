package com.example.BursBul.Controller;

import com.example.BursBul.Model.Uniogrenci;
import com.example.BursBul.Service.UniogrenciService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uniogrenci")
public class UniogrenciController {
    private UniogrenciService uniogrenciService;

    public UniogrenciController(UniogrenciService uniogrenciService) {
        this.uniogrenciService = uniogrenciService;
    }
    @PostMapping
    public Uniogrenci insert(@RequestBody Uniogrenci uniogrenci){
        return  uniogrenciService.createUniogrenci(uniogrenci);
    }
    @GetMapping
    public List<Uniogrenci> getAllUniogrenci(){
        return uniogrenciService.findAllUniogrenci();
    }
    @GetMapping("/{id}")
    public Uniogrenci getUniogrenciById(@PathVariable("id") String uniogrenciId){
        return uniogrenciService.getUniogrenciById(uniogrenciId);
    }
    @PutMapping("/{id}")
    public Uniogrenci update(@PathVariable("id") String uniogrenciId,@RequestBody Uniogrenci uniogrenci){
        return uniogrenciService.updateUniogrenci(uniogrenciId,uniogrenci);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String uniogrenciId){
        uniogrenciService.deleteUniogrenciById(uniogrenciId);
    }
}
