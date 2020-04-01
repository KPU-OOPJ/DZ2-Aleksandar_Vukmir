/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleksandarVukmir;
import java.util.Scanner;
/**
 *
 * @author Korisnik
 */
public class AleksandarVukmir {
    private String s1;
    private String s2;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public void ucitajs1(){ //metoda za unos stringa s1
        System.out.println("Unesite string S1: ");
        Scanner skener = new Scanner(System.in);
        setS1(skener.nextLine()); //ocitavanje korisnikovog unosa sa tastature
        System.out.println("S1 postavljen: \"" + getS1() + "\"");//ispis onoga sto je korisnik uneo pod navodnicima
    }
    public void ucitajs2(){ 
        System.out.println("Unesite string S2: ");
        Scanner skener = new Scanner(System.in);
        setS2(skener.nextLine());
        System.out.println("S2 postavljen: \"" + getS2() + "\"");

    }

    public void ispisiS3(){
        String s3 = s2;//formiranje stringa s3 tako sto mu se prvo zalepi string s2
        for (int i = s1.length()-1 ; i > -1 ; i--){
            s3+=s1.charAt(i);//nakon toga krecuci se unazad kroz string s1 lepimo karaktere na string s3 jedan po jedan.
        }
        System.out.println("Novi string S3 je: \"" + s3 + "\"");
    }
}
