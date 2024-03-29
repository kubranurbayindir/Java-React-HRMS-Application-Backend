## Human Resources Management System

The project will be developed in accordance with S.O.L.I.D software principles. In the first run, api test was performed using Swagger and data extraction from the database was checked. Java and Java frameworks (Springboot , Spring JPA/Hibernate) will be used in the backend, React will be used in the frontend. PostgreSQL was chosen as the database.
 
Dependencies: <br>
-Spring Boot DevTools <br>
-Spring Web <br>
-Spring Data JPA <br>
-PostgreSQL Driver <br>
-Lombok

![image](https://user-images.githubusercontent.com/83094285/125317638-d4f2e680-e341-11eb-8ba8-3ad08dc8a126.png)

All control commands have more than one work method in this way. 

![image](https://user-images.githubusercontent.com/83094285/125317779-edfb9780-e341-11eb-8364-7c60e517143c.png)

![image](https://user-images.githubusercontent.com/83094285/125318396-7aa65580-e342-11eb-8208-d36a8f586052.png)


### Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
* Doğrulama geçerli değilse kullanıcı bilgilendirilir.
* Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
* Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

### Req 2 : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
* Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

### Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

* Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

### Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

### Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

### Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)

### Req 7 : İş verenler sisteme iş ilanı ekleyebilmelidir.

İş ilanı formunda;
* Seçilebilir listeden (dropdown) genel iş pozisyonu seçilebilmelidir.(Örneğin Java Developer)(Zorunlu)
* İş tanımı girişi yapılabilmelidir. (Örneğin; firmamız için JAVA, C# vb. dillere hakim....)(Zorunlu)
* Şehir bilgisi açılır listeden seçilebilmelidir. (Zorunlu)
* Maaş skalası için min-max girişi yapılabilmelidir. (Opsiyonel)
* Açık pozisyon adedi girişi yapılabilmelidir. (Zorunlu)
* Son başvuru tarihi girişi yapılabilmelidir.

### Req 8 : Sistemdeki tüm aktif iş ilanları listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

### Req 9 : Sistemdeki tüm aktif iş ilanları tarihe göre listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.

### Req 10 : Sistemde bir firmaya ait tüm aktif iş ilanları listelenebilmelidir.

Liste, tablo formunda gelmelidir.
Listede firmadı, genel iş pozisyonu adı, açık pozisyon adedi, yayın tarihi, son başvuru tarihi bilgileri olmalıdır.


