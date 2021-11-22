CREATE TABLE geraete(
    gnr int,
    gtyp varchar(60),
    modell varchar(60),
    hersteller varchar(60),
    beschreibung varchar(120),
    garantie datetime,
    primary key (gnr)
);
CREATE TABLE rechner(
    rnr int,
    rname varchar(60),
    prozessor varchar(60),
    grafikkarte varchar(60),
    arbeitsspeicher varchar(60),
    beschreibung varchar(120),
    kaufdatum datetime,
    primary key (rnr)
);
CREATE TABLE zuordung(
    rnr int,
    gnr int,
    FOREIGN KEY (rnr) REFERENCES rechner(rnr),
    FOREIGN KEY (gnr) REFERENCES geraete(gnr)
);
-- LOAD DATA
LOAD DATA INFILE 'geraete.txt' IGNORE INTO TABLE geraete FIELDS TERMINATED BY "#" OPTIONALLY ENCLOSED BY "\"" LINES TERMINATED BY "\n" IGNORE 1 LINES;
LOAD DATA INFILE 'rechner.txt' IGNORE INTO TABLE rechner FIELDS TERMINATED BY "#" OPTIONALLY ENCLOSED BY "\"" LINES TERMINATED BY "\n" IGNORE 1 LINES;
LOAD DATA INFILE 'zuordnung.txt' IGNORE INTO TABLE zuordung FIELDS TERMINATED BY "#" OPTIONALLY ENCLOSED BY "\"" LINES TERMINATED BY "\n" IGNORE 1 LINES;