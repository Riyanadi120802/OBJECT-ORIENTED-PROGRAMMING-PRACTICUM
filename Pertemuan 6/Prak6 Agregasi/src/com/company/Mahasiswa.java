package com.company;

public class Mahasiswa {
        private String NIM, Nama;
        public Mahasiswa(String nim, String nama) {
            this.NIM = nim;
            this.Nama = nama;
        }
        public String GetNIM() {
            return (NIM);
        }
        public String GetNama() {
            return (Nama);
        }
}
