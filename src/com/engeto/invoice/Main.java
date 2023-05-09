package com.engeto.invoice;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        String jmenoPrijmeni = "Přemysl Ježek";  // Jmeno, prijmeni dodavatele
        LocalDate datumNarozeni = LocalDate.of(1978, Month.DECEMBER, 21); // datum narozeni
        int pocetSmluv = 5;                           // pocet uzavrenych smluv
        double prodanaMrkev = 3.6;                  // celková prodaná mrkev
        String sidloProdavajici = "Velka Bites";    // bydliste prodavajiciho
        String registZnacka = "6C7 1234";           // registracni znacka
        double spotrebaAuta = 3.8;                  //  spotreba auta na 100 km/l
        String internetProtocol = "10.90.12.1";      // IP adresa firemniho pocitace

        double prumProdMrkev = prodanaMrkev/pocetSmluv;

        System.out.println("Průměrné množství prodané mrkve v tunách na jednu smlouvu je  "+ prumProdMrkev+ " Tun" );



    }


}