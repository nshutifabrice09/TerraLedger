package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Document;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImplementation implements DocumentService{
    @Override
    public List<Document> getDocuments() {
        return null;
    }

    @Override
    public Document getAllDocumentById(Long id) {
        return null;
    }

    @Override
    public Document saveDocument(Document document) {
        return null;
    }

    @Override
    public Document updateDocument(Long id, Document document) {
        return null;
    }

    @Override
    public void deleteDocumentById(Long id) {

    }
}
