package com.jd.fridge.widget.loading.a;

import com.a.a.a;
import com.a.a.l;
import com.a.a.l.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TbsSdkJava */
public class x extends u {
    public List<a> a() {
        List<a> arrayList = new ArrayList();
        long[] jArr = new long[]{400, 200, 0, 200, 400};
        for (int i = 0; i < 5; i++) {
            l b = l.b(1.0f, 0.4f, 1.0f);
            b.b(1000);
            b.a(-1);
            b.d(jArr[i]);
            b.a(new b(this) {
                final /* synthetic */ x b;

                public void a(l lVar) {
                    this.b.a[i] = ((Float) lVar.j()).floatValue();
                    this.b.e();
                }
            });
            b.a();
            arrayList.add(b);
        }
        return arrayList;
    }
}
