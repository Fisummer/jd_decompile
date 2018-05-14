package org.apache.http.conn.ssl;

import javax.net.ssl.SSLException;
import org.apache.http.annotation.Immutable;

@Immutable
/* compiled from: TbsSdkJava */
public class BrowserCompatHostnameVerifier extends AbstractVerifier {
    public final void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
        verify(str, strArr, strArr2, false);
    }

    boolean validCountryWildcard(String str) {
        return true;
    }

    public final String toString() {
        return "BROWSER_COMPATIBLE";
    }
}
