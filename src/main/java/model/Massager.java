package model;

public class Massager {
    private String language;
    private int pageSize;
    private String filter;
    private String singnature;

    public Massager() {
    }

    public Massager(String language, int pageSize, String filter, String singnature) {
        this.language = language;
        this.pageSize = pageSize;
        this.filter = filter;
        this.singnature = singnature;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getSingnature() {
        return singnature;
    }

    public void setSingnature(String singnature) {
        this.singnature = singnature;
    }
}
