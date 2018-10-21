
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Firman
 */
public class main {

    public static void main(String[] args) {
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        GajiPegawai gp = new GajiPegawai();

        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.print("Nama Karyawan \t: ");
        gp.setNama(scn1.nextLine());
        System.out.print("Alamat \t: ");
        gp.setAlamat(scn2.nextLine());
        System.out.print("Uang Tunjangan \t: Rp. ");
        gp.setUangTunjangan(scn3.nextInt());
        System.out.print("Uang Transport \t: Rp. ");
        gp.setUangTransport(scn3.nextInt());
        System.out.print("Gaji Pokok \t: Rp. ");
        gp.setGajiPokok(scn3.nextInt());
        gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok());
        System.out.println("Total Gaji \t: Rp " + gp.getTotalGaji());

        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(),
                gp.getTotalGaji());

    }
}
