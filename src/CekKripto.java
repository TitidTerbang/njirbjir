/**
 */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * Aplikasi CekKripto digunakan untuk mengambil data harga kripto dari Coinranking API.
 */
public class CekKripto {
    /**
     * Metode utama yang digunakan untuk mengambil dan menampilkan data harga kripto.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam kasus ini).
     */
    public static void main(String[] args) {
        /*
        usdt = HIVsRcGKkPFtW
        btc = Qwsogvtv82FCd
        eth = razxDUgYGNAdQ
        bnb = WcwrkfNI4FUAe
        */
        String coinId = "razxDUgYGNAdQ";

        // Masukkan API Key Anda dari Coinranking.
        String apiKey = "coinrankinga1218217dade7b854e3b641435196b61f051d74e875d629c";

        // Membuat objek HttpClient untuk membuat permintaan HTTP.
        HttpClient httpClient = HttpClient.newBuilder().build();
        String apiUrl = "https://api.coinranking.com/v2/coin/" + coinId;

        // Membuat permintaan HTTP untuk mendapatkan data kripto.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .header("x-access-token", apiKey)
                .build();

        try {
            // Mengirim permintaan HTTP dan menerima respons.
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                // Jika respons berhasil (kode status 200), proses data JSON.
                String jsonData = response.body();
                System.out.println("Data JSON: " + jsonData);

                // Menentukan indeks awal dan akhir untuk harga kripto.
                int priceStartIndex = jsonData.indexOf("\"price\":\"") + 9;
                int priceEndIndex = jsonData.indexOf("\",\"btcPrice\"");
                String price = jsonData.substring(priceStartIndex, priceEndIndex);

                // Menentukan indeks awal dan akhir untuk nama kripto.
                int nameStartIndex = jsonData.indexOf("\"name\":\"") + 8;
                int nameEndIndex = jsonData.indexOf("\",\"description\"");
                String name = jsonData.substring(nameStartIndex, nameEndIndex);

                // Menampilkan nama kripto dan harga kripto.
                System.out.println("Nama Koin: " + name);
                System.out.println("Harga " + name + ": $ " + price);
            } else {
                System.out.println("Gagal mengambil data kripto.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
