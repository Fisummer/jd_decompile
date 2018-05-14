package c.a;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: TbsSdkJava */
public class ac implements av<ac, e>, Serializable, Cloneable {
    public static final Map<e, be> c;
    private static final bu d = new bu("Latent");
    private static final bl e = new bl("latency", (byte) 8, (short) 1);
    private static final bl f = new bl("interval", (byte) 10, (short) 2);
    private static final Map<Class<? extends bw>, bx> g = new HashMap();
    public int a;
    public long b;
    private byte j;

    /* compiled from: TbsSdkJava */
    private static class a extends by<ac> {
        private a() {
        }

        public /* synthetic */ void a(bo boVar, av avVar) throws az {
            b(boVar, (ac) avVar);
        }

        public /* synthetic */ void b(bo boVar, av avVar) throws az {
            a(boVar, (ac) avVar);
        }

        public void a(bo boVar, ac acVar) throws az {
            boVar.f();
            while (true) {
                bl h = boVar.h();
                if (h.b == (byte) 0) {
                    boVar.g();
                    if (!acVar.e()) {
                        throw new bp("Required field 'latency' was not found in serialized data! Struct: " + toString());
                    } else if (acVar.i()) {
                        acVar.j();
                        return;
                    } else {
                        throw new bp("Required field 'interval' was not found in serialized data! Struct: " + toString());
                    }
                }
                switch (h.c) {
                    case (short) 1:
                        if (h.b != (byte) 8) {
                            bs.a(boVar, h.b);
                            break;
                        }
                        acVar.a = boVar.s();
                        acVar.a(true);
                        break;
                    case (short) 2:
                        if (h.b != (byte) 10) {
                            bs.a(boVar, h.b);
                            break;
                        }
                        acVar.b = boVar.t();
                        acVar.b(true);
                        break;
                    default:
                        bs.a(boVar, h.b);
                        break;
                }
                boVar.i();
            }
        }

        public void b(bo boVar, ac acVar) throws az {
            acVar.j();
            boVar.a(ac.d);
            boVar.a(ac.e);
            boVar.a(acVar.a);
            boVar.b();
            boVar.a(ac.f);
            boVar.a(acVar.b);
            boVar.b();
            boVar.c();
            boVar.a();
        }
    }

    /* compiled from: TbsSdkJava */
    private static class b implements bx {
        private b() {
        }

        public /* synthetic */ bw b() {
            return a();
        }

        public a a() {
            return new a();
        }
    }

    /* compiled from: TbsSdkJava */
    private static class c extends bz<ac> {
        private c() {
        }

        public void a(bo boVar, ac acVar) throws az {
            bv bvVar = (bv) boVar;
            bvVar.a(acVar.a);
            bvVar.a(acVar.b);
        }

        public void b(bo boVar, ac acVar) throws az {
            bv bvVar = (bv) boVar;
            acVar.a = bvVar.s();
            acVar.a(true);
            acVar.b = bvVar.t();
            acVar.b(true);
        }
    }

    /* compiled from: TbsSdkJava */
    private static class d implements bx {
        private d() {
        }

        public /* synthetic */ bw b() {
            return a();
        }

        public c a() {
            return new c();
        }
    }

    /* compiled from: TbsSdkJava */
    public enum e implements ba {
        LATENCY((short) 1, "latency"),
        INTERVAL((short) 2, "interval");
        
        private static final Map<String, e> c = null;
        private final short d;
        private final String e;

        static {
            c = new HashMap();
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                c.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return LATENCY;
                case 2:
                    return INTERVAL;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a = a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static e a(String str) {
            return (e) c.get(str);
        }

        private e(short s, String str) {
            this.d = s;
            this.e = str;
        }

        public short a() {
            return this.d;
        }

        public String b() {
            return this.e;
        }
    }

    public /* synthetic */ ba b(int i) {
        return c(i);
    }

    public /* synthetic */ av g() {
        return a();
    }

    static {
        g.put(by.class, new b());
        g.put(bz.class, new d());
        Map enumMap = new EnumMap(e.class);
        enumMap.put(e.LATENCY, new be("latency", (byte) 1, new bf((byte) 8)));
        enumMap.put(e.INTERVAL, new be("interval", (byte) 1, new bf((byte) 10)));
        c = Collections.unmodifiableMap(enumMap);
        be.a(ac.class, c);
    }

    public ac() {
        this.j = (byte) 0;
    }

    public ac(int i, long j) {
        this();
        this.a = i;
        a(true);
        this.b = j;
        b(true);
    }

    public ac(ac acVar) {
        this.j = (byte) 0;
        this.j = acVar.j;
        this.a = acVar.a;
        this.b = acVar.b;
    }

    public ac a() {
        return new ac(this);
    }

    public void b() {
        a(false);
        this.a = 0;
        b(false);
        this.b = 0;
    }

    public int c() {
        return this.a;
    }

    public ac a(int i) {
        this.a = i;
        a(true);
        return this;
    }

    public void d() {
        this.j = at.b(this.j, 0);
    }

    public boolean e() {
        return at.a(this.j, 0);
    }

    public void a(boolean z) {
        this.j = at.a(this.j, 0, z);
    }

    public long f() {
        return this.b;
    }

    public ac a(long j) {
        this.b = j;
        b(true);
        return this;
    }

    public void h() {
        this.j = at.b(this.j, 1);
    }

    public boolean i() {
        return at.a(this.j, 1);
    }

    public void b(boolean z) {
        this.j = at.a(this.j, 1, z);
    }

    public e c(int i) {
        return e.a(i);
    }

    public void a(bo boVar) throws az {
        ((bx) g.get(boVar.y())).b().b(boVar, this);
    }

    public void b(bo boVar) throws az {
        ((bx) g.get(boVar.y())).b().a(boVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Latent(");
        stringBuilder.append("latency:");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append("interval:");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void j() throws az {
    }
}
