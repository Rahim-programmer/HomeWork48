package server;

public enum ContentType {
    TEXT_PLAIN("text/plain; charset=utf-8"),
    TEXT_HTML("text/html; charset=utf-8"),
    TEXT_CSS("text/css"),
    IMAGE_JPEG("image/jpeg");


    private final String descr;

    ContentType(String descr) {
        this.descr =  descr;
    }

    @Override
    public String toString() {
        return descr;
    }
}
