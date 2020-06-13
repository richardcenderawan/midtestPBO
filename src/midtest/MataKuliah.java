/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class MataKuliah {
        private ArrayList <khs_detail> datakhsdetail = Midtest.khsdetail;
        private char[] kode_matakuliah = new char[8];
        private String nama_MataKuliah;
        private int sks , nilai;

        
        public MataKuliah(){}
        
        public MataKuliah (char[] kode_matakuliah , String nama_MataKuliah , int sks , int nilai){
        this.kode_matakuliah = kode_matakuliah;
        this.nama_MataKuliah = nama_MataKuliah;
        this.sks = sks;
        this.nilai = nilai;
        
        }
        
        public char[] getkode_matakuliah(){
            return this.kode_matakuliah;
        }
  
        public void Setkode_matakuliah(char[] kode_matakuliah){
            this.kode_matakuliah = kode_matakuliah;
        }
        
        public String getnama_MataKuliah(){
            return this.nama_MataKuliah;
        }
  
        public void Setnama_MataKuliah(String nama_MataKuliah){
            this.nama_MataKuliah = nama_MataKuliah;
        }
        
        public double getNilai(){
            int bobot = this.nilai;
               if(bobot >= 90 && bobot<=100){
                    return 4;
                }else if(bobot >= 90 && bobot <=100){
                    return 3.7 ;
                }else if(bobot >= 85 && bobot <=90){
                    return 3.3 ;
                }else if(bobot >= 80 && bobot <=84){
                    return 3;
                }else if(bobot >= 75 && bobot <=79){
                    return 2.7 ;
                }else if(bobot >= 65 && bobot <=69){
                    return 2.3 ;
                }else if(bobot >= 60 && bobot <=64){
                    return 2;
                }else if(bobot >= 55 && bobot <=59){
                    return 1.5 ;
                }else if(bobot >= 40 && bobot <=54){
                    return 1;
                }else if(bobot < 40){
                    return 0;
                }
            return 0;
        }
  
        public void SetNilai(int nilai){
            this.nilai = nilai;
        }
                
        public int getsks(){
            return this.sks;
        }
  
        public void Setsks(int sks){
            this.sks = sks;
        }
        
     
            

        

        
  
        
}
