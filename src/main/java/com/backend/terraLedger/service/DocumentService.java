package com.backend.terraLedger.service;

import com.backend.terraLedger.model.Document;

import java.util.List;

public interface DocumentService {
    List<Document> getDocuments();
    Document getAllDocumentById(Long id);
    Document saveDocument(Document document);
    Document updateDocument(Long id, Document document);
    void deleteDocumentById(Long id);
}
