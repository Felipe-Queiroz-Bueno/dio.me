package dio.web.api.controller;

import dio.web.api.model.Gift;
import dio.web.api.repository.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gifts")
public class GiftController {
    @Autowired
    private GiftRepository repository;

    @GetMapping
    public List<Gift> getGifts() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Gift findGiftById(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PostMapping
    public Gift save(@RequestBody Gift gift) {
        return repository.save(gift);
    }

    @PutMapping
    public Gift update(@RequestBody Gift gift) {
        return repository.save(gift);
    }
}