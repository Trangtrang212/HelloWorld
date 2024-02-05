package Model;

public class MeoAnhLongNgan extends Meo {
    private String tiengKeu = "meo anh long ngan";

    public MeoAnhLongNgan() {
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
