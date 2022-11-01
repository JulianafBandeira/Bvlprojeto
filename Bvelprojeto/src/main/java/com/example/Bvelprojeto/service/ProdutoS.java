package com.example.Bvelprojeto.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.Bvelprojeto.model.ProdutoModel;
import com.example.Bvelprojeto.repository.ProdutoRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ProdutoS {
    @Autowired
    private ProdutoRepository produtoR;
    private com.example.Bvelprojeto.model.ProdutoModel ProdutoModel;
    public List<ProdutoModel> findAll() {
        return produtoR.findAll();
    }
    public ResponseEntity<ProdutoModel> findById(UUID id) {
        Optional<ProdutoModel> prod = produtoR.findById(id);
        if (prod.isPresent()) {
            return new ResponseEntity<ProdutoModel>(prod.get(), HttpStatus.OK);
        }
        return null;
        }
    public ProdutoModel save(ProdutoModel prod) {
        return produtoR.save(prod);
        }
    public ResponseEntity<ProdutoModel> update(ProdutoModel nProd, UUID id) {
        Optional<ProdutoModel>vProd=produtoR.findById(id);
        if (vProd.isPresent()) {
            ProdutoModel prod = vProd.get();
            prod.setNome(nProd.getNome());
            prod.setPreco(nProd.getPreco());
            prod.setQuantidade(nProd.getQuantidade());
            produtoR.save(prod);
            return new ResponseEntity<ProdutoModel>(prod, HttpStatus.OK);
          }
            return null;
          }

        }