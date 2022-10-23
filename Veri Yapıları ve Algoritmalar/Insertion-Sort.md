# Patika-Insertion-Sort
+ Patika Profil Linkim: [https://app.patika.dev/oemerfaruk](https://app.patika.dev/oemerfaruk)

Patika-Insertion-Sort projesi cevapları.

***
[22,27,16,2,18,6] -> Insertion Sort
1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
    + Bütün liste incelenir ve en küçük olan değer ilk değer ile yer değiştirir.
        + [2,27,16,22,18,6] -> 2 ile 22 yer değiştirdi.
    + İkinci sırada 2'den sonra gelen en küçük sayıyı bulmak için liste tekrar incelenir ve ikinci sırada olan sayı ile yer değiştirir.
        + [2,6,16,22,18,27] -> 6 ile 27 yer değiştirdi.
    + Bu kural izlenerek son sayıya kadar geliyoruz.
        + [2,6,16,22,18,27] -> Üçüncü sıradaki sayı en küçük sayı olduğu için yer değiştirme olmaz.
        + [2,6,16,18,22,27] -> 18 - 22 yer değiştirdi.
        + [2,6,16,18,22,27] -> Beşinci sıradaki sayı en küçük sayı olduğu için yer değiştirme olmaz.
        + [2,6,16,18,22,27] -> Altıncı sıradaki sayı en büyük sayı olduğu için listemiz küçükten büyüğe sıralanmış olur.
2. Big-O gösterimini yazınız.
    + n Elemanlı listemizin en küçük değerini bulmak için n elemanı inceleriz. Her defasında kalan elamanı yani n-1 elemanı inceleriz. Bu işlem devam eder ve n+(n-1)+(n-2).. olarak devam eder. 1'den n'e kadar olan sayıların toplamından (n.(n-1))/2 gelir buradan da Big-O Notation'umuz O(n^2) olur yani O(6^2) -> O(36)'dır.