DROP DATABASE if exists arbeitsblatt;
CREATE DATABASE IF NOT EXISTS arbeitsblatt;
USE arbeitsblatt;
CREATE TABLE abteilung (
    AbtNr int not null auto_increment,
    AbtName varchar(50) not null,
    AbtLeiterPersNr int not null,
    PRIMARY KEY (AbtNr)
);
CREATE TABLE projekt (
    ProjektNr int not null auto_increment,
    ProjektName varchar(50) not null,
    ProjektleiterPersNr int not null,
    Primary Key (ProjektNr)
);
CREATE TABLE mitarbeiter(
    PersNr int not null auto_increment,
    Name varchar(50) not null,
    Vorname varchar(50) not null,
    Ort varchar(50) not null,
    Beruf varchar(50) not null,
    Gehalt DECIMAL(5, 2) not null,
    Gebdatum date NOT NULL,
    Eintrittsdatum date NOT NULL,
    AbtNr int not null,
    ProjektNr int not null,
    PRIMARY KEY(PersNr),
    FOREIGN KEY(AbtNr) REFERENCES abteilung(AbtNr),
    FOREIGN KEY(ProjektNr) REFERENCES projekt(ProjektNr)
);
INSERT INTO abteilung
VALUES (NULL, 'Mode', '1'),
    (NULL, 'asd', '2'),
    (NULL, 'as', '3'),
    (NULL, 'fag', '4'),
    (NULL, 'asda', '5');
INSERT INTO projekt
VALUES (NULL, 'Mode', '1'),
    (NULL, 'asd', '2'),
    (NULL, 'as', '3'),
    (NULL, 'fag', '4'),
    (NULL, 'asda', '5');
INSERT INTO mitarbeiter
VALUES (
        NULL,
        'Mode',
        'asd',
        'test',
        'Techniker',
        '100.20',
        '2000-01-01',
        '2018-05-01',
        '1',
        '1'
    ),
    (
        NULL,
        'Mode',
        'asd',
        'test',
        'Techniker',
        '100.20',
        '2000-01-01',
        '2018-05-01',
        '2',
        '2'
    ),
    (
        NULL,
        'Mode',
        'asd',
        'test',
        'Techniker',
        '100.20',
        '2000-01-01',
        '2018-05-01',
        '3',
        '3'
    ),
    (
        NULL,
        'Mode',
        'asd',
        'test',
        'Techniker',
        '100.20',
        '2000-01-01',
        '2018-05-01',
        '4',
        '4'
    ),
    (
        NULL,
        'Mode',
        'asd',
        'test',
        'Techniker',
        '100.20',
        '2000-01-01',
        '2018-05-01',
        '5',
        '5'
    );
UPDATE mitarbeiter
SET Gehalt = Gehalt * 1.1
WHERE Beruf = "Techniker";
ALTER TABLE mitarbeiter
ALTER TABLE mitarbeiter CHANGE Vorname Vorname VARCHAR(80),
    CHANGE Name Name VARCHAR(80);
ALTER TABLE mitarbeiter
ADD Bemerkung VARCHAR(150) NULL
AFTER Eintrittsdatum,
    ADD Ausbildung VARCHAR(150) NULL
AFTER Bemerkung;
ALTER TABLE mitarbeiter DROP Vorname,
    DROP Beruf;