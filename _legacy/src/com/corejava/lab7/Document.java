package com.corejava.lab7;
 
import java.util.Objects;
 
public class Document {
    private int docId;
    private String docName;
    private String docDesc;
 
    public Document(int docId, String docName, String docDesc) {
        this.docId = docId;
        this.docName = docName;
        this.docDesc = docDesc;
    }
 
    public int getDocId() {
        return docId;
    }
 
    public String getDocName() {
        return docName;
    }
 
    public String getDocDesc() {
        return docDesc;
    }
 
    @Override
    public String toString() {
        return "Document [docId=" + docId + ", docName=" + docName + ", docDesc=" + docDesc + "]";
    }
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;
        Document document = (Document) o;
        return docId == document.docId &&
               Objects.equals(docName, document.docName) &&
               Objects.equals(docDesc, document.docDesc);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(docId, docName, docDesc);
    }
}