



drop database projekt;

create database if not exists projekt;

use projekt;

-- Abteilung(!Anr, Name)
create table abteilung(
    ANr int,
    Name varchar(60) not null,

    primary key(ANr)
);

-- Kunde(!Knr, Name, Vorname, kunde_seit,gebdatum,PLZ, Ort, Str., HNr)
create table kunde(
    KNr INT,
    Name varchar(60) not null,
    Vorname varchar(60) not null,
    kunde_seit date not null,
    gebdatum date not null,
    PLZ varchar(6) not null,
    Ort varchar(60) not null,
    Str varchar(60) not null,
    HNr varchar(5) not null,

    primary key(KNr)
);

-- Mitarbeiter(!MNr,Name,Tel,[anr],position,[VMnr])
create table mitarbeiter(
    MNr int,
    Name varchar(60) not null,
    tel varchar(20) not null,
    ANr int,
    position varchar (30) not null,

    primary key(MNr),
    FOREIGN KEY(ANr) REFERENCES abteilung(ANr)
);

-- Projekt(!PNr, PBez,[knr])
create table projekt(
    PNr int,
    PBez varchar(100),
    KNr int,

    primary key(PNr),
    FOREIGN KEY(KNr) REFERENCES kunde(KNr)
);

-- MitProj([!MNr],[!PNr], wochenstunden)
create table MitProj(
    MNr int,
    PNr int,
    wochenstunden time,

    FOREIGN KEY(MNr) REFERENCES mitarbeiter(MNr),
    FOREIGN KEY(PNr) REFERENCES projekt(PNr)
)