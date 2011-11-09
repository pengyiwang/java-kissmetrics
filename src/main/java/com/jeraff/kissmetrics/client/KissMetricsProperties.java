package com.jeraff.kissmetrics.client;

public class KissMetricsProperties {
    private static final String ENCODING = "UTF-8";

    private StringBuilder sb = new StringBuilder();

    private void _put(String key, Object value) {
        sb.append(key).append("=").append(value.toString()).append("&");
    }

    public KissMetricsProperties put(String key, String value) {
        _put(key, value);
        return this;
    }

    public KissMetricsProperties put(String key, int value) {
        _put(key, value);
        return this;
    }

    public KissMetricsProperties put(String key, float value) {
        _put(key, value);
        return this;
    }

    public KissMetricsProperties put(String key, long value) {
        _put(key, value);
        return this;
    }

    public KissMetricsProperties put(String key, boolean value) {
        _put(key, value);
        return this;
    }

    public void clear() {
        sb = new StringBuilder();
    }

    public String getQueryString() {
        return sb.toString();
    }
}