package android.support.v4.app;

import android.os.Bundle;

/* compiled from: TbsSdkJava */
class RemoteInputCompatBase {

    /* compiled from: TbsSdkJava */
    public static abstract class RemoteInput {

        /* compiled from: TbsSdkJava */
        public interface Factory {
            RemoteInput build(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle);

            RemoteInput[] newArray(int i);
        }

        protected abstract boolean getAllowFreeFormInput();

        protected abstract CharSequence[] getChoices();

        protected abstract Bundle getExtras();

        protected abstract CharSequence getLabel();

        protected abstract String getResultKey();
    }

    RemoteInputCompatBase() {
    }
}
