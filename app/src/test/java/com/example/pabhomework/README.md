# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
Colour used: Color(0xFFE8F0FE)
Padding kept: 24.dp
What changed / what stayed the same: Perubahan nilai padding dari 8 dp ke 48 dp mengubah besarnya jarak ruang kosong antara tepi luar elemen Surface dengan konten di dalam Column. Pada 8 dp, konten berada sangat dekat dengan pinggir layar, sedangkan pada 48 dp konten terdorong jauh lebih masuk ke tengah. Hal yang tetap sama adalah ukuran teks, ukuran gambar, hirarki layout, serta urutan vertikal penyusunan elemen.

## Task 4: Build Error
First error message: 'M' is not a valid file-based resource name character: File-based resource names must contain only lowercase a-z, 0-9, or underscore
Cause: Aturan penamaan sumber daya (resource) pada Android menetapkan bahwa nama file hanya boleh menggunakan huruf kecil (a-z), angka (0-9), dan garis bawah (_). Karakter 'M' (huruf kapital) dan '-' (tanda hubung) melanggar aturan ini.
Why other errors appear: Kegagalan kompilasi file gambar oleh sistem build Android menyebabkan simbol ID pada kelas `R.drawable` tidak dapat dibuat. Akibatnya, berkas Kotlin yang merujuk pada gambar tersebut mengalami kesalahan turunan berupa "Unresolved reference".
Fix: Mengubah nama file gambar kembali menjadi `my_picture.png` (atau nama file yang hanya terdiri dari huruf kecil dan garis bawah).

## Task 5: Explore the Project
(a) MainActivity: path `app/src/main/java/com/example/pabhomework/MainActivity.kt` — Komponen utama yang menjadi titik masuk (entry point) aplikasi Android dan memanggil `setContent` untuk menampilkan Compose UI.
(b) Gradle file: path `app/build.gradle.kts` — Berkas konfigurasi build tingkat modul `app` yang mengatur dependensi pustaka, versi SDK, serta plugin proyek.
(c) Launcher image line: `painter = painterResource(id = R.drawable.ic_launcher_foreground)` — Baris kode di dalam `FirstScreen()` yang mereferensikan gambar vektor peluncur aplikasi default.

## Task 6: Preview vs Run
Pratinjau (Preview) hanya melakukan proses kompilasi dan rendering cepat di dalam lingkungan internal Android Studio untuk visualisasi desain tanpa menghasilkan file APK penuh. Sementara itu, perangkat fisik atau emulator masih menjalankan file APK versi sebelumnya yang terpasang di memori. Agar perubahan terbaru muncul di perangkat, aplikasi harus di-build ulang dan dipasang kembali dengan menekan tombol Run (▶) atau kombinasi tombol `Shift + F10`.

## Task 7: Views vs Compose
1. Pada pendekatan imperatif (Views), pengembang harus mengelola dan memanipulasi elemen UI secara manual dengan mencari ID komponen (`findViewById`) lalu mengubah statusnya satu per satu melalui method setter. Pada pendekatan deklaratif (Compose) seperti fungsi `FirstScreen()`, pengembang hanya perlu mendeskripsikan bagaimana tampilan UI harus terbentuk berdasarkan data (*state*) saat ini, sehingga Compose akan memperbarui tampilan secara otomatis (*recomposition*) saat data berubah.

2.
| Composable | Package | Library layer |
|---|---|---|
| Column | androidx.compose.foundation.layout | Foundation |
| Text | androidx.compose.material3 | Material 3 |
| Image | androidx.compose.foundation | Foundation |