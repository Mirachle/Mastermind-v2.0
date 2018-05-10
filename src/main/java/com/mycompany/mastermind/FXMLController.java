package com.mycompany.mastermind;


import adatbazis.Lekerdezesek;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FXMLController implements Initializable {
    
    @FXML
    public Button egy;
    @FXML
    private Button ketto;
    @FXML
    private Button harom;
    @FXML
    private Button negy;
    @FXML
    private Button ot;
    @FXML
    private Button hat;
    @FXML
    private Button het;
    @FXML
    private Button nyolc;
    @FXML
    private Button jatek;
    
    @FXML
    private Circle kor1;
    @FXML
    private Circle kor2;
    @FXML
    private Circle kor3;
    @FXML
    private Circle kor4;
    @FXML
    private Circle kor5;
    @FXML
    private Circle kor6;
    @FXML
    private Circle kor7;
    @FXML
    private Circle kor8;
    @FXML
    private Circle kor9;
    @FXML
    private Circle kor10;
    @FXML
    private Circle kor11;
    @FXML
    private Circle kor12;
    @FXML
    private Circle kor13;
    @FXML
    private Circle kor14;
    @FXML
    private Circle kor15;
    @FXML
    private Circle kor16;
    @FXML
    private Circle kor17;
    @FXML
    private Circle kor18;
    @FXML
    private Circle kor19;
    @FXML
    private Circle kor20;
    @FXML
    private Circle kor21;
    @FXML
    private Circle kor22;
    @FXML
    private Circle kor23;
    @FXML
    private Circle kor24;
    @FXML
    private Circle kor25;
    @FXML
    private Circle kor26;
    @FXML
    private Circle kor27;
    @FXML
    private Circle kor28;
    @FXML
    private Circle kor29;
    @FXML
    private Circle kor30;
    @FXML
    private Circle kor31;
    @FXML
    private Circle kor32;
    
    @FXML
    private Circle kisKor1;
    @FXML
    private Circle kisKor2;
    @FXML
    private Circle kisKor3;
    @FXML
    private Circle kisKor4;
    @FXML
    private Circle kisKor5;
    @FXML
    private Circle kisKor6;
    @FXML
    private Circle kisKor7;
    @FXML
    private Circle kisKor8;
    @FXML
    private Circle kisKor9;
    @FXML
    private Circle kisKor10;
    @FXML
    private Circle kisKor11;
    @FXML
    private Circle kisKor12;
    @FXML
    private Circle kisKor13;
    @FXML
    private Circle kisKor14;
    @FXML
    private Circle kisKor15;
    @FXML
    private Circle kisKor16;
    @FXML
    private Circle kisKor17;
    @FXML
    private Circle kisKor18;
    @FXML
    private Circle kisKor19;
    @FXML
    private Circle kisKor20;
    @FXML
    private Circle kisKor21;
    @FXML
    private Circle kisKor22;
    @FXML
    private Circle kisKor23;
    @FXML
    private Circle kisKor24;
    @FXML
    private Circle kisKor25;
    @FXML
    private Circle kisKor26;
    @FXML
    private Circle kisKor27;
    @FXML
    private Circle kisKor28;
    @FXML
    private Circle kisKor29;
    @FXML
    private Circle kisKor30;
    @FXML
    private Circle kisKor31;
    @FXML
    private Circle kisKor32;
    
    
    @FXML
    List<Circle> korok = new ArrayList<>();
    public void addKor(){
    korok.add(kor1);
    korok.add(kor2);
    korok.add(kor3);
    korok.add(kor4);
    korok.add(kor5);
    korok.add(kor6);
    korok.add(kor7);
    korok.add(kor8);
    korok.add(kor9);
    korok.add(kor10);
    korok.add(kor11);
    korok.add(kor12);
    korok.add(kor13);
    korok.add(kor14);
    korok.add(kor15);
    korok.add(kor16);
    korok.add(kor17);
    korok.add(kor18);
    korok.add(kor19);
    korok.add(kor20);
    korok.add(kor21);
    korok.add(kor22);
    korok.add(kor23);
    korok.add(kor24);
    korok.add(kor25);
    korok.add(kor26);
    korok.add(kor27);
    korok.add(kor28);
    korok.add(kor29);
    korok.add(kor30);
    korok.add(kor31);
    korok.add(kor32);
    }
    
    @FXML
    List<Circle> kisKorok = new ArrayList<>();
    public void addKisKor(){
    kisKorok.add(kisKor1);
    kisKorok.add(kisKor2);
    kisKorok.add(kisKor3);
    kisKorok.add(kisKor4);
    kisKorok.add(kisKor5);
    kisKorok.add(kisKor6);
    kisKorok.add(kisKor7);
    kisKorok.add(kisKor8);
    kisKorok.add(kisKor9);
    kisKorok.add(kisKor10);
    kisKorok.add(kisKor11);
    kisKorok.add(kisKor12);
    kisKorok.add(kisKor13);
    kisKorok.add(kisKor14);
    kisKorok.add(kisKor15);
    kisKorok.add(kisKor16);
    kisKorok.add(kisKor17);
    kisKorok.add(kisKor18);
    kisKorok.add(kisKor19);
    kisKorok.add(kisKor20);
    kisKorok.add(kisKor21);
    kisKorok.add(kisKor22);
    kisKorok.add(kisKor23);
    kisKorok.add(kisKor24);
    kisKorok.add(kisKor25);
    kisKorok.add(kisKor26);
    kisKorok.add(kisKor27);
    kisKorok.add(kisKor28);
    kisKorok.add(kisKor29);
    kisKorok.add(kisKor30);
    kisKorok.add(kisKor31);
    kisKorok.add(kisKor32);
    }
    
    RandomEsHasonlit mukodik= new RandomEsHasonlit();
    SajatSzinek szineim= new SajatSzinek();
    Logikak logika = new Logikak();
    int soronkentNKorIndex = 0;
    int nagyKorIndex = 0;
    
    @FXML
    private Label label;
    
    @FXML
    private void gombNyomas(ActionEvent event) {
        
        
        if (szineim.getProbalkozasaim().size() < 4){
            szineim.szintAdHozza(Integer.valueOf( ((Button)event.getSource()).getText()));
        }
        
        switch (szineim.getProbalkozasaim().get(soronkentNKorIndex)) {
            case 1:
                korok.get(nagyKorIndex).setFill(Color.RED);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 2:
                korok.get(nagyKorIndex).setFill(Color.GREEN);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 3:
                korok.get(nagyKorIndex).setFill(Color.BLUE);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 4:
                korok.get(nagyKorIndex).setFill(Color.YELLOW);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 5:
                korok.get(nagyKorIndex).setFill(Color.PURPLE);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 6:
                korok.get(nagyKorIndex).setFill(Color.MAGENTA);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 7:
                korok.get(nagyKorIndex).setFill(Color.AQUAMARINE);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
            case 8:
                korok.get(nagyKorIndex).setFill(Color.BROWN);
                soronkentNKorIndex++;
                nagyKorIndex++;
                break;
        }
        if(soronkentNKorIndex>3){
            jatek();
            soronkentNKorIndex=0;
        
        }
    }
    
    public void jatek(){
        if(szineim.getProbalkozasaim().size() == 4 && logika.getProbalkozasokSzama() < 9){
            mukodik.joSzinJoHelyen(szineim.getProbalkozasaim());
            mukodik.joSzinRosszHelyen(szineim.getProbalkozasaim());
            kiErtekel();
            szineim.probalkozasaimTorlese();
            logika.setProbalkozasokSzama(logika.getProbalkozasokSzama()+1);
            if(logika.jatekVegeVizsgalo(mukodik) && mukodik.getWinner() == 4){
                Lekerdezesek.getAdbeInstance().gyoztemSorBetol();
                label.setText("Győztél!\n Győzelmek: " + Lekerdezesek.getAdbeInstance().szamlalo("gyoztem") + "\nVereségek: " + Lekerdezesek.getAdbeInstance().szamlalo("vesztettem"));
                gombInaktivalo();
            }
            else if(logika.jatekVegeVizsgalo(mukodik) && logika.getProbalkozasokSzama() == 9){
                Lekerdezesek.getAdbeInstance().gyoztemSorBetol();
                label.setText("Győztél!\n Győzelmek: " + Lekerdezesek.getAdbeInstance().szamlalo("gyoztem") + "\nVereségek: " + Lekerdezesek.getAdbeInstance().szamlalo("vesztettem"));
                gombInaktivalo();
            }
        }
    }
    
    @FXML
    private void ujJatek(ActionEvent event){
        soronkentNKorIndex = 0;
        nagyKorIndex = 0;
        logika.ujJatekGenerator();
        for(int k = 0; k < 32; k++){
            kisKorok.get(k).setFill(Color.GREY);
            korok.get(k).setFill(Color.LIGHTGREY);
        }
        gombAktivalo();
        mukodik.szinKodokTorlese();
        mukodik.randomSzinGenerator();
        jatek();
        
    }
    
    public void kiErtekel(){
        for(int szam = 0; szam < 4; szam++){
            if(logika.feketeKKorFelismero(mukodik, szam)){
                kisKorok.get(logika.kisKorIndex).setFill(Color.BLACK);
                logika.kisKorIndex++;
            }
        }
        for(int szam = 0; szam < 4; szam++){
            if(logika.feherKKorFelismero(mukodik, szam)){
                kisKorok.get(logika.kisKorIndex).setFill(Color.WHITE);
                logika.kisKorIndex++;
            }
        }
        logika.indexKiSegito();
    }
    
   
    public void gombInaktivalo(){
        egy.setDisable(true);
        ketto.setDisable(true);
        harom.setDisable(true);
        negy.setDisable(true);
        ot.setDisable(true);
        hat.setDisable(true);
        het.setDisable(true);
        nyolc.setDisable(true);
        jatek.setVisible(true);
        jatek.setDisable(false);
    }
    
    public void gombAktivalo(){
        egy.setDisable(false);
        ketto.setDisable(false);
        harom.setDisable(false);
        negy.setDisable(false);
        ot.setDisable(false);
        hat.setDisable(false);
        het.setDisable(false);
        nyolc.setDisable(false);
        jatek.setVisible(false);
        jatek.setDisable(true);
        label.setText("");
   }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mukodik.randomSzinGenerator();
        addKor();
        addKisKor();
        
    }
    
    
    public void afterInit(){
        Stage st = (Stage)this.egy.getScene().getWindow(); 
        st.resizableProperty().setValue(Boolean.FALSE); 
        st.setOnCloseRequest(e -> { 
            if(Lekerdezesek.em.isOpen()){
               Lekerdezesek.getAdbeInstance().delete();
               Lekerdezesek.getAdbeInstance().kapcsolatZaro();
            }
            Platform.exit(); }); 
    } 

}

/*

Hozzá kéne csatolnom egy adatbázist ~~~~ féliiig
Dokumentálni kéne az egészet
Teszteket írni hozzá és megkérdezni Ballát melyikhez írjak meglyikhez meg ne. <-- progtech
loggerek
package-info -> progkörny követelmény


*/