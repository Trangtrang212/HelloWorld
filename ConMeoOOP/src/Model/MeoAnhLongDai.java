package Model;

public class MeoAnhLongDai extends Meo{
    private String tiengKeu = "meo anh long dai";

    public MeoAnhLongDai() {
        super.input();
    }

    @Override
    public String getTiengKeu() {
        return tiengKeu;
    }

    @Override
    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public void display() {
        super.display();
        System.out.printf("Meo keu: %s", getTiengKeu());
    }

}
