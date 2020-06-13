/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest;

import java.util.Arrays;

/**
 * Ujian Mid Test Term -3 , Pelajaran : Pemograman Berorientasi Objek (PBO)
 * @author Richard Cenderawan 03082170009 17TI1
 */
public class term {
    
        private char[] kode_term = new char[5];
        private char[] tahun_ajaran = new char[4];
        private char[] semester = new char[10];

        
        public term(){}
        
        public term (char[] kode_term , char[] tahun_ajaran , char[] semester  ){
        this.kode_term = kode_term;
        this.tahun_ajaran = tahun_ajaran;
        this.semester = semester;
 
        }
        
        public char[] getkode_term(){
            return this.kode_term;
        }
  
        public void Setkode_term(char[] kode_term){
            this.kode_term = kode_term;
        }
        
        public char[] gettahun_ajaran(){
            return this.tahun_ajaran;
        }
  
        public void Settahun_ajaran(char[] tahun_ajaran){
            this.tahun_ajaran = tahun_ajaran;
        }
        
        public char[] getsemester(){
            return this.semester;
        }
  
        public void Setsemester(char[] semester){
            this.semester = semester;
        }
        



        



 






    
}
