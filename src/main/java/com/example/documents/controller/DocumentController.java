package com.example.documents.controller;

import com.example.documents.model.Document;
import com.example.documents.servis.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    // Получить все документы
    @GetMapping
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    // Создать новый документ
    @PostMapping
    public Document createDocument(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }

    // Получить документ по ID
    @GetMapping("/{id}")
    public Document getDocumentById(@PathVariable Long id) {
        return documentService.getDocumentById(id).orElse(null);
    }

    // Удалить документ по ID
    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        documentService.deleteDocument(id);
    }
}
