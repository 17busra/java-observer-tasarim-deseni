# Java OOP - Observer Tasarım Deseni 📰

Bu proje, davranışsal tasarım desenlerinden (Behavioral Design Patterns) biri olan **Observer (Gözlemci)** deseninin Java ile uygulanmış temel bir örneğidir. Bir haber ajansı (Subject) ile bu ajansa abone olan kullanıcıların (Observer) haberleşme süreci simüle edilmiştir.

**İçerilen OOP ve Tasarım Prensipleri:**
* **Observer (Gözlemci Arayüzü) - `Observer`:** Abonelerin sahip olması gereken ortak dinleme/güncellenme davranışını (`update`) belirten arayüz.
* **Subject (Yayıncı) - `NewsAgency`:** Gözlemcilerin abone olduğu, abonelikten çıktığı (`addObserver`/`removeObserver`) ve bir değişiklik olduğunda tüm listeye aynı anda bildirim gönderen (`notifyObservers`) ana sınıf.
* **Concrete Observer (Somut Gözlemci) - `EmailUser`:** Gelen haber bildirimlerini kendi yapısına göre işleyen (bu örnekte ekrana yazdıran) abone sınıfı.
* **One-to-Many (Bire-Çok) İlişki:** Yayıncı sınıf (`NewsAgency`), kendisini dinleyen sınıfların (`EmailUser`) detaylarını bilmek zorunda kalmadan, arayüz üzerinden gevşek bağlı (loose coupling) bir şekilde iletişim kurar.

**Kullanılan Dil:**
* Java
