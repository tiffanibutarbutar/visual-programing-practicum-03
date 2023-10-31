# P03. Sistem Manajemen Tugas 

Studi Kasus: Sistem Manajemen Tugas untuk Mata Kuliah Pemrograman

Setelah sukses dengan Sistem Manajemen Tugas (SMT), Poppy dan Mabel memutuskan untuk menambahkan fitur dinamic array. Mereka ingin mahasiswa tidak hanya tahu prioritas tugas berdasarkan deadline dan tingkat kesulitan, tetapi juga bisa menyimpan banyak daftar tugas sekaligus.

Program akan terus menerima input dari pengguna. Karena program akan terus menerima input, akan sangat baik jika setiap informasi tugas disimpan dalam sebuah array. Maksimum tugas yang bisa diterima oleh program adalah 10. Program akan berhenti menerima input ketika pengguna memberikan masukan terhadap ***Deskripsi Tugas** adalah ```---``` atau sudah mencapai maksimum.

Ketika program telah selesai menerima input atau sudah mencapai batas, program akan menghasilkan keluaran berupa semua atribut tugas yang diurutkan berdasarkan prioritas, dari yang paling tinggi ke terendah. Oleh karena itu, jangan lupa untuk menghitung prioritas dari setiap tugas.

Cara menghitung prioritas:
prioritas =TingkatKesulitan * (1.0 / hariHinggaDeadline)


## Input - Output Simulation
Dalam simulasi ini, pengguna akan memasukkan semua informasi yang diperlukan tentang tugas, termasuk tingkat kesulitan dan jumlah hari hingga deadline. Setelah itu, sistem akan menampilkan informasi tentang tugas beserta prioritasnya dan rekomendasi tindakan berdasarkan prioritas, dari yang tertinggi ke yang terendah.

### Example 1
**Input**:
```bash

Buat program untuk simulasi ATM sederhana
12S1103
Pemrograman Lanjutan
Dr. Emily Watson
4 November 2023, pukul 15.00 WIB
12S22005_PoppySibuea_PemrogramanLanjutan
5    # Tingkat Kesulitan (1-5)
3    # Hari hingga deadline
Belum Selesai  # Status (Belum Selesai/Sudah Selesai)
Buat program face recognition
12S1104
Kecerdasan buatan
Dr. Samuel 
10 November 2023, pukul 15.00 WIB
12S22005_PoppySibuea_Kecerdasan_buatan
5    # Tingkat Kesulitan (1-5)
1    # Hari hingga deadline
Belum Selesai  # Status (Belum Selesai/Sudah Selesai)
---

```


**Output**:
```bash
Prioritas: 5.00
Buat program face recognition|12S1104|Kecerdasan buatan|Dr. Samuel|10 November 2023, pukul 15.00 WIB|12S22005_PoppySibuea_Kecerdasan_buatan|Belum Selesai|Penting! Anda harus mengerjakan tugas ini segera.
Prioritas: 1.67
Buat program untuk simulasi ATM sederhana|12S1103|Pemrograman Lanjutan|Dr. Emily Watson|4 November 2023, pukul 15.00 WIB|12S22005_PoppySibuea_PemrogramanLanjutan|Belum Selesai|Tugas ini memiliki prioritas menengah.

```


