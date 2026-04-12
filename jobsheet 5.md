Nama  : L.G Adama Vito
NIM   : 254107020047
Kelas : TI -1E

praktikum 1
<img width="565" height="512" alt="1" src="https://github.com/user-attachments/assets/3605ed8e-ea58-4fc0-b342-d61e6e975bcb" />
<img width="778" height="701" alt="1 2" src="https://github.com/user-attachments/assets/b773b4a5-573b-48b7-a770-66d3f8cff189" />
pertanyaan
1.Bagian if (n==1): Berfungsi sebagai base case (kondisi dasar). Ini adalah titik di mana rekursi berhenti agar tidak terjadi loop tak terbatas. Ketika nilai n sudah mencapai 1, fungsi akan langsung mengembalikan nilai 1.
  Bagian else: Berfungsi sebagai recursion call (pemanggilan rekursif). Di sini, masalah yang besar dipecah menjadi sub-masalah yang lebih kecil dengan memanggil dirinya sendiri (faktorialDC(n-1)) sampai mencapai base case.
2.Ya, sangat memungkinkan. Logika Brute Force yang menggunakan iterasi bisa diganti menggunakan struktur perulangan lain seperti while atau do-while.
3.fakto *= i;: Digunakan dalam metode iteratif (Brute Force). Baris ini mengalikan nilai variabel fakto yang sudah ada dengan nilai loop i saat itu secara langsung di dalam memori yang sama.
  int fakto = n * faktorialDC(n-1);: Digunakan dalam metode rekursif (Divide and Conquer). Baris ini tidak langsung melakukan perkalian akhir, melainkan "menunda" perhitungan dengan memanggil fungsi baru ke dalam stack (tumpukan memori) sampai base case tercapai, baru kemudian hasil perkaliannya dikembalikan ke atas.
4.faktorialBF() (Brute Force): Menggunakan perulangan (looping). Ibarat Anda menghitung manual dari angka 1 dikalikan terus ke atas sampai angka $n$. Sangat efisien dalam penggunaan memori karena prosesnya langsung selesai dalam satu jalur.
  faktorialDC() (Divide and Conquer): Menggunakan rekursif (pemanggilan fungsi sendiri). Masalah besar dipecah menjadi bagian-bagian kecil ($n \times (n-1)$) sampai menyentuh angka 1. Prosesnya "menumpuk" di memori (stack) terlebih dahulu, baru kemudian dihitung mundur saat semua potongan sudah terkumpul.

  praktikum 2
<img width="552" height="489" alt="2" src="https://github.com/user-attachments/assets/5867c80b-9455-4c57-98e6-fd1f6f2366a6" />
<img width="767" height="708" alt="2 2" src="https://github.com/user-attachments/assets/c0662c3f-bdef-4a87-ae51-48afefaba32e" />
pertanyaan 
1.pangkatBF() (Brute Force): Menggunakan pendekatan langsung dan sederhana. Algoritma ini melakukan iterasi (perulangan for) sebanyak $n$ kali untuk mengalikan basis secara terus-menerus. Kompleksitas waktunya adalah linier $O(n)$.
  pangkatDC() (Divide and Conquer): Menggunakan pendekatan rekursif dengan membagi masalah besar menjadi sub-masalah yang lebih kecil. Masalah dibagi menjadi dua bagian ($n/2$), diselesaikan, lalu digabungkan kembali. Pendekatan ini jauh lebih efisien untuk angka yang sangat besar karena mengurangi jumlah operasi perkalian secara signifikan.
2.Ya, sudah. Dalam algoritma Divide and Conquer, tahap combine adalah saat hasil dari sub-masalah digabungkan kembali menggunakan operasi perkalian.
3.Secara teknis, jika method berada di dalam class yang sama dengan atribut nilai dan pangkat, maka parameter tersebut kurang relevan (redundant) karena method bisa langsung mengakses atribut objek menggunakan keyword this.
4.Inisialisasi variabel hasil = 1.
  Inisialisasi variabel hasil = 1.
  Di setiap perulangan, hasil dikalikan dengan basis a.
  Setelah perulangan selesai, kembalikan nilai hasil.
  Analogi: Jika menghitung $2^3$, ia akan menghitung $1 \times 2 \times 2 \times 2$.

praktikum 3
<img width="407" height="407" alt="3" src="https://github.com/user-attachments/assets/f53ec83c-4547-4641-863b-c7735d1b6b26" />
<img width="727" height="529" alt="3 1" src="https://github.com/user-attachments/assets/bd8a06bc-2911-4263-bd7f-9a7539d5ad1b" />
pertanyaan 
1.Variabel mid sangat krusial dalam algoritma Divide and Conquer karena berfungsi sebagai titik pembagi
2.double lsum = totalDC(arr, l, mid);: Berfungsi untuk memecah rentang data bagian kiri secara rekursif hingga mencapai unit terkecil dan menghitung totalnya.
  double rsum = totalDC(arr, mid+1, r);: Berfungsi untuk memecah rentang data bagian kanan secara rekursif hingga mencapai unit terkecil dan menghitung totalnya.
3.anpa penjumlahan ini, kita hanya akan mendapatkan hasil dari potongan-potongan array tanpa pernah tahu total keseluruhannya.
4.Base case adalah kondisi yang menghentikan rekursi agar tidak berjalan selamanya
5.Divide: Membagi array menjadi dua bagian terus-menerus menggunakan titik tengah (mid).
  Conquer: Terus melakukan pembagian secara rekursif sampai setiap bagian hanya berisi satu elemen (base case).
  Combine: Menjumlahkan kembali hasil total dari setiap sub-bagian (kiri + kanan) hingga kembali ke pemanggilan utama, yang menghasilkan total akhir dari seluruh elemen array.

 tugas praktikum
 <img width="432" height="243" alt="4" src="https://github.com/user-attachments/assets/455d015d-c082-48c7-b9e8-1c3caf4122cf" />
  <img width="423" height="456" alt="4 2" src="https://github.com/user-attachments/assets/7ac6f853-959b-4463-8900-b420904b9376" />
<img width="741" height="553" alt="4 3" src="https://github.com/user-attachments/assets/385aa6d8-5a98-41a4-a82e-58616130e6bb" />


