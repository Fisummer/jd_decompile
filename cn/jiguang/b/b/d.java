package cn.jiguang.b.b;

import android.content.Context;
import java.io.File;

final class d extends Thread {
    private static final String z;
    final /* synthetic */ Context a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r0 = "\rL\u001c/NJ\\\u001c.YUZ?4TF";
        r0 = r0.toCharArray();
        r1 = r0.length;
        r2 = 0;
        r3 = 1;
        if (r1 > r3) goto L_0x0027;
    L_0x000b:
        r3 = r0;
        r4 = r2;
        r7 = r1;
        r1 = r0;
        r0 = r7;
    L_0x0010:
        r6 = r1[r2];
        r5 = r4 % 5;
        switch(r5) {
            case 0: goto L_0x0035;
            case 1: goto L_0x0038;
            case 2: goto L_0x003b;
            case 3: goto L_0x003e;
            default: goto L_0x0017;
        };
    L_0x0017:
        r5 = 56;
    L_0x0019:
        r5 = r5 ^ r6;
        r5 = (char) r5;
        r1[r2] = r5;
        r2 = r4 + 1;
        if (r0 != 0) goto L_0x0025;
    L_0x0021:
        r1 = r3;
        r4 = r2;
        r2 = r0;
        goto L_0x0010;
    L_0x0025:
        r1 = r0;
        r0 = r3;
    L_0x0027:
        if (r1 > r2) goto L_0x000b;
    L_0x0029:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1.intern();
        z = r0;
        return;
    L_0x0035:
        r5 = 35;
        goto L_0x0019;
    L_0x0038:
        r5 = 63;
        goto L_0x0019;
    L_0x003b:
        r5 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        goto L_0x0019;
    L_0x003e:
        r5 = 93;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.jiguang.b.b.d.<clinit>():void");
    }

    d(Context context) {
        this.a = context;
    }

    public final void run() {
        File filesDir = this.a.getFilesDir();
        if (filesDir != null) {
            File file = new File(filesDir, z);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }
}
