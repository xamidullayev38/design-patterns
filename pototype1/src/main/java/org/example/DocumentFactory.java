package org.example;

public class DocumentFactory {
    private Document prototype;

    public DocumentFactory(Document prototype) {
        this.prototype = prototype;
    }

    public Document cloneDocument() {
        return prototype.clone();
    }

    public void setPrototype(Document prototype) {
        this.prototype = prototype;
    }

    public Document getPrototype() {
        return prototype;
    }
}
