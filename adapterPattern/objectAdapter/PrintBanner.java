package adapterPattern.objectAdapter;

public class PrintBanner implements Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }
    
    @Override
    public void printStrong() {
        banner.showWithAster();
    }

    public Banner getBanner() {
        return banner;
    }

    public void setBanner(Banner banner) {
        this.banner = banner;
    }
}