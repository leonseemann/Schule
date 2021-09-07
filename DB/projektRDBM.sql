



DROP DATABASE projekt;

CREATE DATABASE IF NOT EXISTS projekt;

USE projekt;

-- Abteilung(!Anr, Name)
CREATE TABLE abteilung(
    ANr INT,
    Name VARCHAR(60) NOT NULL,

    PRIMARY KEY(ANr)
);

-- Kunde(!Knr, Name, Vorname, kunde_seit,gebdatum,PLZ, Ort, Str., HNr)
CREATE TABLE kunde(
    KNr INT,
    Name VARCHAR(60) NOT NULL,
    Vorname VARCHAR(60) NOT NULL,
    kunde_seit date NOT NULL,
    gebdatum date NOT NULL,
    PLZ VARCHAR(6) NOT NULL,
    Ort VARCHAR(60) NOT NULL,
    Str VARCHAR(60) NOT NULL,
    HNr VARCHAR(5) NOT NULL,

    PRIMARY KEY(KNr)
);

-- Mitarbeiter(!MNr,Name,Tel,[anr],position,[VMnr])
CREATE TABLE mitarbeiter(
    MNr INT,
    Name VARCHAR(60) NOT NULL,
    tel VARCHAR(20) NOT NULL,
    ANr INT,
    position VARCHAR (30) NOT NULL,

    PRIMARY KEY(MNr),
    FOREIGN KEY(ANr) REFERENCES abteilung(ANr)
);

-- Projekt(!PNr, PBez,[knr])
CREATE TABLE projekt(
    PNr INT,
    PBez VARCHAR(100),
    KNr INT,

    PRIMARY KEY(PNr),
    FOREIGN KEY(KNr) REFERENCES kunde(KNr)
);

-- MitProj([!MNr],[!PNr], wochenstunden)
CREATE TABLE MitProj(
    MNr INT,
    PNr INT,
    wochenstunden time,

    FOREIGN KEY(MNr) REFERENCES mitarbeiter(MNr),
    FOREIGN KEY(PNr) REFERENCES projekt(PNr)
)

