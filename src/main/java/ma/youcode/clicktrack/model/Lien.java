package ma.youcode.clicktrack.model;
public class Lien {

    private int id;
    private String offre;
    private String urlDestination;
    private long clicks;
    private int publisherId;

    public Lien(int id, String offre, String urlDestination, long clicks, int publisherId) {
        this.id = id;
        this.offre = offre;
        this.urlDestination = urlDestination;
        this.clicks = clicks;
        this.publisherId = publisherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOffre() {
        return offre;
    }

    public void setOffre(String offre) {
        this.offre = offre;
    }

    public String getUrlDestination() {
        return urlDestination;
    }

    public void setUrlDestination(String urlDestination) {
        this.urlDestination = urlDestination;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }
}
