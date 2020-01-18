INSERT INTO PRZEDMIOT(ID, NAZWA, OBRAZEK_URL)
VALUES (1, 'widelec', 'http://localhost:8080/api/zdjecia-przedmiotow/widelec.png'),
       (2, 'łyżeczka', 'http://localhost:8080/api/zdjecia-przedmiotow/lyzeczka.png'),
       (3, 'chusteczki higieniczne',
        'http://localhost:8080/api/zdjecia-przedmiotow/chusteczki higieniczne.png'),
       (4, 'szyszka', 'http://localhost:8080/api/zdjecia-przedmiotow/szyszka.png'),
       (5, 'zakrętka od butelki',
        'http://localhost:8080/api/zdjecia-przedmiotow/zakretka od butelki.png'),
       (6, 'scyzoryk', 'http://localhost:8080/api/zdjecia-przedmiotow/scyzoryk.png');

INSERT INTO UZYTKOWNIK(ID, LOGIN, HASLO, EMAIL)
VALUES (1, 'ula', 'Pieski123', 'ula@gmail.com'),
       (2, 'kamil', 'Kotki123', 'kamil@gmail.com'),
       (3, 'przodo', 'GoryGory5', 'przodoo@wp.pl'),
       (4, 'pracownik1', '756Dokumenty', 'pracownik1@gmail.com');

INSERT INTO OSOBA(ID, IMIE, NAZWISKO, DATA_URODZENIA, WIEK, PLEC)
VALUES (1, 'Ula', 'Mazur', '1998-02-10', 21, 'K'),
       (2, 'Kamil', 'Przeniosło', '1997-04-19', 22, 'M'),
       (3, 'Andrzej', 'Taternik', '1975-06-23', 44, 'M'),
       (4, 'Anna', 'Jaśkowiak', '1967-11-04', 52, 'K');

INSERT INTO TURYSTA(ID)
VALUES (1),
       (2);

INSERT INTO PRZODOWNIK(ID, NUMER_LEGITYMACJI)
VALUES (3, '7217');

INSERT INTO PRACOWNIK_RW(ID)
VALUES (4);

INSERT INTO ODZNAKA(ID, RODZAJ, STOPIEN, WYMAGANE_PUNKTY)
VALUES (1, 'W góry', 'brązowy', 15),
       (2, 'W góry', 'srebrny', 30),
       (3, 'W góry', 'złoty', 45),
       (4, 'Popularna', '', 60),
       (5, 'Mała', 'brązowy', 120),
       (6, 'Mała', 'srebrny', 360),
       (7, 'Mała', 'złoty', 720),
       (8, 'Duża', 'brązowy', 0),
       (9, 'Duża', 'srebrny', 100),
       (10, 'Duża', 'złoty', 150),
       (11, 'Za wytrwałość', 'mały', 0), --0 ze wzgledu na skomplikowane zasady zdobywania
       (12, 'Za wytrwałość', 'duży', 0); --0 ze wzgledu na skomplikowane zasady zdobywania

INSERT INTO ODZNAKA_TURYSTY(ID, WLASCICIEL, ODZNAKA, DATA_ROZPOCZECIA_ZDOBYWANIA, DATA_ZDOBYCIA,
                            PRZYZNANA_PRZEZ, ZWERYFIKOWANA_PRZEZ)
VALUES (1, 1, 4, '2019-04-04', null, null, null),
       (2, 2, 4, '2016-02-04', '2016-06-01', 4, 3),
       (3, 2, 5, '2016-06-02', '2016-09-30', 4, 3),
       (4, 2, 6, '2016-10-31', '2017-07-01', 4, 3),
       (5, 2, 7, '2017-07-02', null, null, null);

INSERT INTO GRUPA_GORSKA(ID, NAZWA)
VALUES (1, 'TATRY I PODTATRZE'),
       (2, 'TATRY SŁOWACKIE'),
       (3, 'BESKIDY ZACHODNIE'),
       (4, 'BESKIDY WSCHODNIE'),
       (5, 'GÓRY ŚWIĘTOKRZYSKIE'),
       (6, 'SUDETY'),
       (7, 'Słowacja');

INSERT INTO TEREN_GORSKI(ID, NAZWA, GRUPA_GORSKA)
VALUES (1, 'Tatry Wysokie', 1),
       (2, 'Tatry Zachodnie', 1),
       (3, 'Podtatrze', 1),
       (4, 'Vysoke Tatry - (Tatry Wysokie - Słowacja)', 2),
       (5, 'Beskid Śląski', 3),
       (6, 'Beskid Żywiecki', 3),
       (7, 'Beskid Mały', 3),
       (8, 'Beskid Średni', 3),
       (9, 'Pogórze Ciężkowickie', 4),
       (10, 'Beskid Niski część zachodnia', 4),
       (11, 'Góry Izerskie', 6),
       (12, 'Pogórze Izerskie', 6),
       (13, 'Karkonosze', 6),
       (14, 'Kotlina Jeleniogórska', 6),
       (15, 'Rudawy Janowickie', 6),
       (16, 'Mała Fatra - Vrátna', 7);

INSERT INTO UPRAWNIENIA(PRZODOWNIK, GRUPA_GORSKA)
VALUES (3, 1),
       (3, 2),
       (3, 3),
       (3, 5);

--punkty górskie
INSERT INTO PUNKT(ID, NAZWA, WYSOKOSC)
VALUES (1, 'Rusinowa Polana', 1170),
       (2, 'Gęsia Szyja', 1489),
       (3, 'Rówień Waksmundzka', null),
       (4, 'Schronisko PTTK na Hali Gąsienicowej', 1500),
       (5, 'Schronisko PTTK nad Morskim Okiem', 1410),
       (6, 'Czarny Staw nad Morskim Okiem', 1583),
       (7, 'Dolina za Mnichem', 1785),
       (8, 'Kozi Wierch', 2291),
       (9, 'Świnica', 2301),
       (10, 'Przełęcz Krzyżne', 2114),
       (11, 'Droga "Pod Reglami"', null),
       (12, 'Niżnia Kominiarska Polana ', 1110),
       (13, 'Schronisko PTTK na Polanie Chochołowskiej', 1146),
       (14, 'Trzydniowiański Wierch', 1758),
       (15, 'Grześ', 1653),
       (16, 'Magura Witowska TPG', 1232),
       (17, 'Palenica Kościeliska', 1183),
       (18, 'Butorowy Wierch', 1160),
       (19, 'Gubałówka', 1126),
       (20, 'Dzięgielów - Zamek', 1170),
       (21, 'Jasieniowa', 521),
       (22, 'Schronisko PTTK Tuł', 621),
       (23, 'Rachowiec', 954),
       (24, 'Bór', 704),
       (25, 'Ożna', 952),
       (26, 'Smrek (TPG Stóg Izerski)', 1124),
       (27, 'Polana Izerska', 965),
       (28, 'Łącznik ', 1066),
       (29, 'Stóg Izerski', 1105),
       (30, 'Zajęcznik', 595);

--punkty startowe
INSERT INTO PUNKT(ID, NAZWA)
VALUES (31, 'Dolina Filipka'),
       (32, 'Starorobociańska Dolina'),
       (33, 'Czerniawa Zdrój');

INSERT INTO WSPOLRZEDNA(ID, STOPNIE, MINUTY, SEKUNDY)
VALUES (1, 50, 52, 19.3),
       (2, 15, 21, 5.0);

--punkty wprowadzone przez uzytkownika
INSERT INTO PUNKT(ID, NAZWA, SZEROKOSC_GEOGRAFICZNA, DLUGOSC_GEOGRAFICZNA)
VALUES (34, 'Rozwidlenie dróg', 1, 2);


INSERT INTO PUNKT_Z_WYKAZU(ID, TEREN_GORSKI)
VALUES (1, 1),
       (2, 1),
       (3, 1),
       (4, 1),
       (5, 1),
       (6, 1),
       (7, 1),
       (8, 1),
       (9, 1),
       (10, 1),
       (11, 2),
       (12, 2),
       (13, 2),
       (14, 2),
       (15, 2),
       (16, 3),
       (17, 3),
       (18, 3),
       (19, 3),
       (20, 5),
       (21, 5),
       (22, 5),
       (23, 6),
       (24, 6),
       (25, 6),
       (26, 11),
       (27, 11),
       (28, 11),
       (29, 11),
       (30, 11),
       (31, 1),
       (32, 2),
       (33, 11);

INSERT INTO ODCINEK_PUNKTOWANY(ID, PUNKT_POCZATKOWY, PUNKT_KONCOWY, PUNKTACJA)
VALUES (1, 1, 31, 3),
       (2, 31, 1, 6),
       (3, 2, 31, 1),
       (4, 31, 2, 4),
       (5, 2, 3, 1),
       (6, 3, 2, 2),
       (7, 3, 4, 8),
       (8, 4, 3, 7),
       (9, 32, 13, 2),
       (10, 13, 32, 1),
       (11, 32, 14, 10),
       (12, 14, 32, 3),
       (13, 13, 15, 8),
       (14, 15, 13, 3),
       (15, 28, 26, 3),
       (16, 26, 28, 2),
       (17, 28, 29, 2),
       (18, 29, 28, 2),
       (19, 28, 33, 4),
       (20, 33, 28, 9),
       (21, 26, 33, 5),
       (22, 33, 26, 11),
       (23, 29, 33, 5),
       (24, 33, 29, 11),
       (25, 28, 27, 4),
       (26, 27, 28, 5),
       (27, 29, 27, 4),
       (28, 27, 29, 5);

INSERT INTO WYCIECZKA(ID, DATA_ROZPOCZECIA, DATA_ZAKONCZENIA, POTWIERDZONA, PRZYNALEZNA_ODZNAKA,
                      POTWIERDZONA_PRZEZ)
VALUES (1, '2017-07-13', '2017-07-13', FALSE, 5, null),
       (2, '2016-06-10', '2016-06-10', TRUE, 3, 3),
       (3, '2017-07-15', '2017-07-02', FALSE, 5, null);

INSERT INTO ODCINEK_WYCIECZKI(ID, PUNKT_POCZATKOWY, PUNKT_KONCOWY, PUNKTACJA, PUNKTOWANY,
                              WYCIECZKA)
VALUES (1, 27, 28, 5, TRUE, 1),
       (2, 28, 26, 3, TRUE, 1),
       (3, 26, 33, 5, TRUE, 1),
       (4, 33, 29, 11, TRUE, 2),
       (5, 29, 28, 2, TRUE, 2),
       (6, 28, 27, 4, TRUE, 2),
       (7, 27, 34, 1, FALSE, 2),
       (8, 31, 1, 2, TRUE, 3),
       (9, 1, 2, 4, TRUE, 3),
       (10, 2, 3, 2, TRUE, 3),
       (11, 3, 4, 4, TRUE, 3);


