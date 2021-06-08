## Human Resources Management System

The project will be developed in accordance with S.O.L.I.D software principles. In the first run, api test was performed using Swagger and data extraction from the database was checked. Java and Java frameworks (Springboot, Spring JPA/Hibernate) will be used in the backend, React will be used in the frontend. PostgreSQL was chosen as the database.
 
Dependencies: <br>
-Spring Boot DevTools <br>
-Spring Web <br>
-Spring Data JPA <br>
-PostgreSQL Driver <br>
-Lombok

## Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
* Doğrulama geçerli değilse kullanıcı bilgilendirilir.
* Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
* Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.

## Req 2 : İş verenler sisteme kayıt olabilmelidir.

Kabul Kriterleri:

* Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
* Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
* Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
* Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.

## Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.

Kabul Kriterleri:

* Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.

## Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

## Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

## Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)
