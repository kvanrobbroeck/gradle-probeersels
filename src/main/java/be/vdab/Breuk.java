package be.vdab;

public class Breuk {
    private int teller;
    private int noemer;

    public Breuk(int teller, int noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }

    public int getTeller() {
        return teller;
    }

    public int getNoemer() {
        return noemer;
    }

    public Breuk plus(Breuk that) {
        int nieuweTeller = this.teller * that.noemer + that.teller * this.noemer;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk min(Breuk that) {
        int nieuweTeller = this.teller * that.noemer - that.teller * this.noemer;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk maal(Breuk that) {
        int nieuweTeller = this.teller * that.teller;
        int nieuweNoemer = this.noemer * that.noemer;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    public Breuk deel(Breuk that) {
        int nieuweTeller = this.teller * that.noemer;
        int nieuweNoemer = this.noemer * that.teller;
        return new Breuk(nieuweTeller, nieuweNoemer);
    }

    @Override
    public String toString() {
        return teller + "/" + noemer;
    }

    public Breuk omkeren() {
        return new Breuk(this.noemer, this.teller);
    }
}
