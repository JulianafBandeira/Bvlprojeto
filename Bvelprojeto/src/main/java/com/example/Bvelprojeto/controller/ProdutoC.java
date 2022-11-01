package com.example.Bvelprojeto.controller;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.example.Bvelprojeto.model.ProdutoModel;
import com.example.Bvelprojeto.service.ProdutoS;
@RestController
@RequestMapping("/prodt")
public class ProdutoC {
    @Autowired
    private ProdutoS produtoS;
    @GetMapping
    public List<ProdutoModel> findAll() {
        return produtoS.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> findById(@PathVariable UUID id) {
        return produtoS.findById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> update(@PathVariable UUID id, @RequestBody ProdutoModel pProd) {
        return produtoS.update(pProd, id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoModel save(@RequestBody ProdutoModel produtomdl) {
        return produtoS.save(produtomdl);
    }
}


