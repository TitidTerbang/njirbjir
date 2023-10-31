# Aplikasi Cek Harga Koin Kripto

Aplikasi CekKripto adalah sebuah alat sederhana yang digunakan untuk mengambil data harga kripto (cryptocurrency) dari Coinranking API. Aplikasi ini ditulis dalam bahasa pemrograman Java.

### Cara Menggunakan Aplikasi

1. Pastikan Anda memiliki Java terinstal di komputer Anda.

2. Unduh atau kloning repositori ini ke komputer Anda.

3. Buka proyek dalam lingkungan pengembangan Java seperti IntelliJ IDEA.

4. Buka file `CekKripto.java` dalam proyek.

5. Pastikan Anda memiliki API Key dari Coinranking. Gantilah `apiKey` dengan API Key Anda:
   ```java
   String apiKey = "";
   ```

6. Tentukan ID kripto yang ingin Anda cek (cth: "eth" untuk Ethereum):
   ```java
   String coinId = "";
   ```
    | Nama Koin | Coin id          |
    |-----------|------------------|
    | USDT      | HIVsRcGKkPFtW |
    | BTC       | Qwsogvtv82FCd |
    | ETH       | razxDUgYGNAdQ |
    | BNB       | WcwrkfNI4FUAe |
   Coin id Diambil Dari [Coin Ranking](https://coinranking.com/)

7. Jalankan aplikasi dengan mengklik tombol "Run" dalam lingkungan pengembangan Anda.

8. Aplikasi akan mengambil data harga kripto dari API dan menampilkannya di terminal.

### Catatan

Pastikan Anda memiliki koneksi internet yang aktif saat menjalankan aplikasi ini, karena aplikasi akan mengambil data secara online dari Coinranking.

---