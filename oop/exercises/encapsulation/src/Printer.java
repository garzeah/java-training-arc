public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            return (tonerLevel + tonerAmount > 100) ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }

    public int printPages(int pages) { // use Math.round instead of pagesToPrint = (pages/2) + (pages%2); for the extra page
        int pagesToPrint = (duplex) ? (Math.round((float) pages / 2)) : pages;
        pagesPrinted += pagesToPrint; // add the pagesToPrint for this job to lifetime printer counter
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}