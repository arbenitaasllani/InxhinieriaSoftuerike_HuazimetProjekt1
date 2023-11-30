package com.example.inxhinieriasoftuerike_huazimetprojekt.controller;

import com.example.inxhinieriasoftuerike_huazimetprojekt.model.Borrow;
import com.example.inxhinieriasoftuerike_huazimetprojekt.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrows/")
public class BorrowController {
    private final BorrowService borrowService;

    @Autowired
    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @GetMapping
    public List<Borrow> getAllBorrows() {
        return borrowService.getAllBorrows();
    }

    @PostMapping
    public Borrow saveBorrow(@RequestBody Borrow borrow) {
        return borrowService.saveBorrow(borrow);
    }

    @DeleteMapping("/{id}")
    public void deleteBorrow(@PathVariable Long id) {
        borrowService.deleteBorrow(id);
    }
}
