package com.jd.fridge.bean.requestBody;

/* compiled from: TbsSdkJava */
public class GetNutritionDetail {
    private int count;
    private long feed_id;
    private int start_index;

    public long getFeed_id() {
        return this.feed_id;
    }

    public void setFeed_id(long j) {
        this.feed_id = j;
    }

    public int getStart_index() {
        return this.start_index;
    }

    public void setStart_index(int i) {
        this.start_index = i;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }
}
