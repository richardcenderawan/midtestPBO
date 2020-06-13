/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class Midtest {
    
    public static Scanner inputan = new Scanner(System.in);  
    public static ArrayList<MataKuliah> matkul = new ArrayList<MataKuliah>();
    public static ArrayList<khs> khs = new ArrayList<khs>();
    public static ArrayList<khs_detail> khsdetail = new ArrayList<khs_detail>();
    public static ArrayList<mahasiswa> mahasiswa = new ArrayList<mahasiswa>();
    public static ArrayList<term> term = new ArrayList<term>();    
    
    
    public static void main(String[] args) throws Exception{
        
        int pilhanMenu=0;
       
        do{
           
            cetakMenu();
            System.out.print(" Pilihan : ");
            pilhanMenu = inputan.nextInt();
            inputan.nextLine();
            inputan = new Scanner(System.in);  
            
            if(pilhanMenu==1){

                inputDataMahasiswa();
                inputDataTerm();
            
            }else if(pilhanMenu==2){            
                inputDataMatkul();           
            }else if(pilhanMenu==3){       
                inputdatakhs();
                inputdatakhsdetail();
            }else if(pilhanMenu==4){       
                tampilkanDataMahasiswa();
                tampilkanDataTerm();
            }else if(pilhanMenu==5){       
                tampilkanDataMatkul();  
            }else if(pilhanMenu==6){
    
                cetakDetailKHS();
                tampilkanDetailKHS();
                tampilkanIPK();
            }else if(pilhanMenu==7){       
             tampilkanIPKSementara();
            }else if(pilhanMenu==8){       
                     System.exit(0);
            }
            
        }while(pilhanMenu!=0);
        inputan.close();
    }
    
    
     public static void cetakMenu() throws Exception{
        Thread.sleep(1000);
        System.out.println("==================================================");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|          PLEASE WAIT FOR A MOMENT..            |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("==================================================");
        Thread.sleep(3000);
        System.out.println("==================================================");
        System.out.println("|                 Memuat menu...                 |");
        System.out.println("==================================================");
        Thread.sleep(2000);
        System.out.println("==================================================");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|            PROGRAM KHS UPH MEDAN               |");
        System.out.println("|                                                |");
        System.out.println("|        1. Masukkan Data Mahasiswa              |");
        System.out.println("|        2. Masukkan Data Mata Kuliah            |");
        System.out.println("|        3. Masukkan Data KHS                    |");
        System.out.println("|        4. Tampilkan Data Mahasiswa             |");
        System.out.println("|        5. Tampilkan Data Mata Kuliah           |");
        System.out.println("|        6. Cetak Transkrip KHS Mahasiswa        |");
        System.out.println("|        7. Tampilkan IPK Sementara              |");
        System.out.println("|        8. Keluar                               |");
        System.out.println("|                                                |");
        System.out.println("|           Richard Cenderawan (C)2020           |");
        System.out.println("|         PBO (UPH MEDAN , 17 TI 1),inc.         |");
        System.out.println("|              All rights reserved               |");
        System.out.println("|                                                |");
        System.out.println("==================================================");
        
       
    }
    
     public static boolean inputDataMahasiswa() throws Exception{
     
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(2000);
            System.out.println("==================================================");
            System.out.println("==================================================");
            System.out.println("|                FORM MAHASISWA                  |");
            System.out.println("==================================================");
            System.out.print("1. Input StudentID : ");
            char[] studentID = inputan.next().toCharArray();
            System.out.print("2. Input Nama Mahasiswa : ");
            char[] nama = inputan.next().toCharArray(); 
            System.out.print("3. Input Jurusan : ");
            String jurusan = inputan.next();
            System.out.print("4. Input Tahun Masuk : ");
            char[] tahunmasuk = inputan.next().toCharArray();
            return mahasiswa.add(new mahasiswa(studentID , nama , jurusan , tahunmasuk));                                 
    }
     
     public static boolean inputDataTerm() throws Exception{

            System.out.print("5. Input Kode Term : ");
            char[] kode_term = inputan.next().toCharArray();
            System.out.print("6. Input Tahun Ajaran : ");
            char[] tahun_ajaran = inputan.next().toCharArray(); 
            System.out.print("7. Input Semester : ");
            char[] semester = inputan.next().toCharArray(); 
            return term.add(new term(kode_term, tahun_ajaran , semester ));                                
    }
     

     public static boolean inputDataMatkul() throws Exception{
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(2000);
            System.out.println("==================================================");
            System.out.println("==================================================");
            System.out.println("|              FORM MATA KULIAH                  |");
            System.out.println("==================================================");
            System.out.print(" 1. Input Kode Mata Kuliah : ");
            char[] kode_matakuliah = inputan.next().toCharArray();
            System.out.print(" 2. Input Nama Mata Kuliah : ");
            String nama_matakuliah = inputan.next(); 
            System.out.print(" 3. SKS : ");
            int sks = inputan.nextInt();
            System.out.print(" 4. Nilai : ");
            int nilai = inputan.nextInt();
            return matkul.add(new MataKuliah(kode_matakuliah , nama_matakuliah , sks , nilai));                            
    }
    
    public static boolean inputdatakhs() throws Exception{
        char[] studentid;
        do{
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(2000);            
            System.out.print(" Input Student ID : ");
            studentid = inputan.next().toCharArray();
            if(!cekDataMahasiswa((studentid))){
                System.out.println(" Student ID tidak ditemukan !!!");
            }    
        }while(!cekDataMahasiswa(studentid));

        
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(2000);
            System.out.println("==================================================");
            System.out.println("==================================================");
            System.out.println("|                   FORM KHS                     |");
            System.out.println("==================================================");
            System.out.print(" 1. Input Kode KHS : ");
            char[] kode_khs = inputan.next().toCharArray();
            System.out.print(" 2. Input Keterangan : ");
            String keterangan = inputan.next(); 
            System.out.print(" 3. Input Keterangan singkat : ");
            char[] keterangan_singkat =inputan.next().toCharArray();
   
            return khs.add(new khs(kode_khs ,keterangan, keterangan_singkat ));                                
    }    
    
    public static boolean inputdatakhsdetail() throws Exception{

            System.out.print(" 4. Input Kode KHS Detail : ");
            char[] kodekhsdetail = inputan.next().toCharArray();
            return khsdetail.add(new khs_detail(kodekhsdetail));                                
    } 
   
  
                                
       
    
    public static boolean cekDataMahasiswa(char[] studentid){
        for(int i =0;i<mahasiswa.size();i++){
            if(Arrays.equals(mahasiswa.get(i).getstudentID(), studentid)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean cekDataMatkul(char[] kodematkul){
        for(int i =0;i<matkul.size();i++){
            if(Arrays.equals(matkul.get(i).getkode_matakuliah(), kodematkul)){
                return true;
            }
        }
        return false;
    }
    
    public static mahasiswa getDataMahasiswa(char[] studentid){
        for(int i =0;i<mahasiswa.size();i++){
            if(Arrays.equals(mahasiswa.get(i).getstudentID(), studentid)){
                return mahasiswa.get(i);
            }
        }
        return null;
    }
    

    public static void tampilkanDataMahasiswa()throws Exception{
        System.out.println("| Mencari data...................................|");
        Thread.sleep(2000);
        System.out.println("| Memuat Data Mahasiswa..........................|");
        Thread.sleep(2000);
        for(int i =0;i<mahasiswa.size();i++){
            System.out.println("\n Student ID                : "+Arrays.toString(mahasiswa.get(i).getstudentID())+"\n"+
                               " Nama                      : "+Arrays.toString(mahasiswa.get(i).getnama())+"\n"+
                               " Jurusan                   : "+mahasiswa.get(i).getjurusan()+"\n"+
                               " Tahun Masuk               : "+Arrays.toString(mahasiswa.get(i).gettahun_masuk())+"\n");
        }
    }
    
    public static void tampilkanDataTerm()throws Exception{

        for(int i =0;i<term.size();i++){
            System.out.println("\n Kode Term                   : "+ Arrays.toString(term.get(i).getkode_term())+"\n"+
                               " Tahun Ajaran                : "+ Arrays.toString(term.get(i).gettahun_ajaran())+"\n"+
                               " Semester                    : "+ Arrays.toString(term.get(i).getsemester())+"\n");
        }
    }
    public static void tampilkanDataMatkul()throws Exception{
        System.out.println("| Mencari data...................................|");
        Thread.sleep(2000);
        System.out.println("| Memuat Data Mata Kuliah........................|");
        Thread.sleep(2000);
        for(int i =0;i<term.size();i++){
            System.out.println("\n Kode Mata Kuliah             : "+ Arrays.toString(matkul.get(i).getkode_matakuliah())+"\n"+
                               " Nama Mata Kuliah             : "+matkul.get(i).getnama_MataKuliah()+"\n"+
                               " SKS                          : "+matkul.get(i).getsks()+"\n"+
                               " Nilai                        : "+matkul.get(i).getNilai());
                             
        }
    }
    
    public static void cetakDetailKHS()throws Exception{
        
        char[] studentid;
        do{
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(1000);            
            System.out.print(" Input Student ID : ");
            studentid = inputan.next().toCharArray();
            if(!cekDataMahasiswa((studentid))){
                System.out.println(" Student ID tidak ditemukan !!!");
            }    
        }while(!cekDataMahasiswa(studentid));        
        
        System.out.println("| Mencari data...................................|");
        Thread.sleep(2000);
        System.out.println("| Mencetak Data KHS.........................0 %  |");
        Thread.sleep(3000);
        System.out.println("| Mencetak Data KHS........................30 %  |");
        Thread.sleep(1000);
        System.out.println("| Mencetak Data KHS........................50 %  |");
        Thread.sleep(2000);
        System.out.println("| Mencetak Data KHS........................95 %  |");
        Thread.sleep(2000);
        System.out.println("| Mencetak Data KHS...................... 100 %  |"); 
        Thread.sleep(2000);
        System.out.println(""); 
        System.out.println("==================================================");
        System.out.println("|                 KHS MAHASISWA                  |");
        System.out.println("==================================================");   
        for(int i =0;i<mahasiswa.size();i++){
            
            System.out.println("\n Student ID                : "+Arrays.toString(mahasiswa.get(i).getstudentID())+"\n"+
                               " Nama                      : "+Arrays.toString(mahasiswa.get(i).getnama())+"\n"+
                               " Jurusan                   : "+mahasiswa.get(i).getjurusan()+"\n"+
                               " Tahun Masuk               : "+Arrays.toString(mahasiswa.get(i).gettahun_masuk())+"\n");
        }
        for(int i =0;i<khs.size();i++){
            
            System.out.println("\n Kode KHS                       : "+Arrays.toString(khs.get(i).getkode_khs())+"\n"+
                               " Keterangan                     : "+khs.get(i).getketerangan()+"\n"+
                               " Keterangan Singkat             : "+Arrays.toString(khs.get(i).getketerangan_singkat())+
                               "\n\n Data Term                     "+"\n"+khs.get(i).tampilkanDataTerm());
        }
    }    
    
    
    public static void tampilkanDetailKHS()throws Exception{
        for(int i =0;i<khsdetail.size();i++){
            
            System.out.println(" Kode KHS Detail                : "+Arrays.toString(khsdetail.get(i).getkode_khs_detail())+
                               "\n Data Mata Kuliah              \n"+khsdetail.get(i).tampilkanDataMatakuliah());
                              
        }
    }
    
    public static void tampilkanIPK()throws Exception{
        for(int i =0;i<mahasiswa.size();i++){
            
            System.out.println("\n IPK              : "+mahasiswa.get(i).gettotIPK());
                              
        }
    }

    public static void tampilkanIPKSementara()throws Exception{
        
        char[] studentid;
        do{
            Thread.sleep(1000);
            System.out.println("==================================================");
            System.out.println("|                Please wait...                  |");
            System.out.println("==================================================");
            Thread.sleep(1000);            
            System.out.print(" Input Student ID : ");
            studentid = inputan.next().toCharArray();
            if(!cekDataMahasiswa((studentid))){
                System.out.println(" Student ID tidak ditemukan !!!");
            }    
        }while(!cekDataMahasiswa(studentid));
        
        for(int i =0;i<mahasiswa.size();i++){
        System.out.println("==================================================");
        System.out.println("|        IPK Sementara   "+mahasiswa.get(i).gettotIPK()+"                     |");
        System.out.println("==================================================");  
                              
        }
    }

}



