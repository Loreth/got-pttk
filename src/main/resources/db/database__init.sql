CREATE TABLE uzytkownik
(
    id    identity PRIMARY KEY,
    login varchar(30)  NOT NULL UNIQUE,
    haslo varchar(30)  NOT NULL,
    email varchar(255) NOT NULL UNIQUE
);

CREATE TABLE przedmiot
(
    id          identity PRIMARY KEY,
    nazwa       varchar(255) NOT NULL UNIQUE,
    obrazek_url varchar(3000)
);

CREATE TABLE odznaka
(
    id              identity PRIMARY KEY,
    rodzaj          varchar(255) NOT NULL,
    stopien         varchar(255) NOT NULL,
    wymagane_punkty int          NOT NULL,
    UNIQUE (rodzaj, stopien)
);

CREATE TABLE grupa_gorska
(
    id    identity PRIMARY KEY,
    nazwa varchar(255) NOT NULL UNIQUE
);

CREATE TABLE wspolrzedna
(
    id      identity PRIMARY KEY,
    stopnie int    NOT NULL,
    minuty  int    NOT NULL,
    sekundy double NOT NULL
);

CREATE TABLE osoba
(
    id             identity PRIMARY KEY,
    imie           varchar(255) NOT NULL,
    nazwisko       varchar(255) NOT NULL,
    data_urodzenia date,
    wiek           int,
    plec           varchar(1),
    FOREIGN KEY (id) REFERENCES uzytkownik (id)
);

CREATE TABLE pracownik_rw
(
    id bigint PRIMARY KEY,
    FOREIGN KEY (id) REFERENCES osoba (id)
);

CREATE TABLE przodownik
(
    id                bigint PRIMARY KEY,
    numer_legitymacji varchar(255) NOT NULL UNIQUE,
    FOREIGN KEY (id) REFERENCES osoba (id)
);

CREATE TABLE turysta
(
    id                   bigint PRIMARY KEY,
    wylosowany_przedmiot bigint,
    zdobywana_odznaka    bigint,
    FOREIGN KEY (id) REFERENCES osoba (id),
    FOREIGN KEY (wylosowany_przedmiot) REFERENCES przedmiot (id)
);

CREATE TABLE odznaka_turysty
(
    id                          identity PRIMARY KEY,
    wlasciciel                  bigint NOT NULL,
    odznaka                     bigint NOT NULL,
    data_rozpoczecia_zdobywania date,
    data_zdobycia               date,
    przyznana_przez             bigint,
    zweryfikowana_przez         bigint,
    FOREIGN KEY (wlasciciel) REFERENCES turysta (id),
    FOREIGN KEY (odznaka) REFERENCES odznaka (id),
    FOREIGN KEY (przyznana_przez) REFERENCES pracownik_rw (id),
    FOREIGN KEY (zweryfikowana_przez) REFERENCES przodownik (id),
    UNIQUE (wlasciciel, odznaka)
);

ALTER TABLE turysta
    ADD FOREIGN KEY (zdobywana_odznaka) REFERENCES odznaka_turysty (id);

CREATE TABLE wycieczka
(
    id                  identity PRIMARY KEY,
    data_rozpoczecia    datetime,
    data_zakonczenia    datetime,
    potwierdzona        bool DEFAULT FALSE,
    przynalezna_odznaka bigint NOT NULL,
    potwierdzona_przez  bigint,
    FOREIGN KEY (potwierdzona_przez) REFERENCES przodownik (id),
    FOREIGN KEY (przynalezna_odznaka) REFERENCES odznaka_turysty (id)
);


CREATE TABLE teren_gorski
(
    id           identity PRIMARY KEY,
    nazwa        varchar(255) NOT NULL UNIQUE,
    grupa_gorska bigint       NOT NULL,
    FOREIGN KEY (grupa_gorska) REFERENCES grupa_gorska (id)
);

CREATE TABLE uprawnienia
(
    id           identity PRIMARY KEY,
    przodownik   bigint NOT NULL,
    grupa_gorska bigint NOT NULL,
    FOREIGN KEY (przodownik) REFERENCES przodownik (id),
    FOREIGN KEY (grupa_gorska) REFERENCES grupa_gorska (id),
    UNIQUE (przodownik, grupa_gorska)
);

CREATE TABLE punkt
(
    id                     identity PRIMARY KEY,
    nazwa                  varchar(255),
    wysokosc               int,
    szerokosc_geograficzna bigint,
    dlugosc_geograficzna   bigint,
    FOREIGN KEY (szerokosc_geograficzna) REFERENCES wspolrzedna (id),
    FOREIGN KEY (dlugosc_geograficzna) REFERENCES wspolrzedna (id)
);


CREATE TABLE punkt_z_wykazu
(
    id           bigint PRIMARY KEY,
    teren_gorski bigint NOT NULL,
    FOREIGN KEY (id) REFERENCES punkt (id),
    FOREIGN KEY (teren_gorski) REFERENCES teren_gorski (id)
);

CREATE TABLE odcinek_punktowany
(
    id               identity PRIMARY KEY,
    punkt_poczatkowy bigint NOT NULL,
    punkt_koncowy    bigint NOT NULL,
    punktacja        int    NOT NULL,
    odleglosc        int,
    FOREIGN KEY (punkt_poczatkowy) REFERENCES punkt_z_wykazu (id),
    FOREIGN KEY (punkt_koncowy) REFERENCES punkt_z_wykazu (id)
);

CREATE TABLE odcinek_wycieczki
(
    id               identity PRIMARY KEY,
    punkt_poczatkowy bigint NOT NULL,
    punkt_koncowy    bigint NOT NULL,
    punktacja        int,
    punktowany       bool DEFAULT FALSE,
    odleglosc        int,
    wycieczka        bigint NOT NULL,
    FOREIGN KEY (punkt_poczatkowy) REFERENCES punkt (id),
    FOREIGN KEY (punkt_koncowy) REFERENCES punkt (id),
    FOREIGN KEY (wycieczka) REFERENCES wycieczka (id)
);