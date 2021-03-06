package com.google.zxing.client.result;

/* compiled from: TbsSdkJava */
public final class ISBNParsedResult extends ParsedResult {
    private final String isbn;

    ISBNParsedResult(String str) {
        super(ParsedResultType.ISBN);
        this.isbn = str;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getDisplayResult() {
        return this.isbn;
    }
}
