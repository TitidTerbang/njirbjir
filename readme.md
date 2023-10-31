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

### License
The MIT License (MIT)
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
---