drop database if exists schockoladenfabrick;

create database if not exists schockoladenfabrick;

use schockoladenfabrick;



create table if not exists produkte(
    pnr int not null,
    bezeichnung varchar(50) not null,
    kakaogehalt varchar(50) not null,
    gebindemasse varchar(50) not null,

    PRIMARY KEY(pnr)
);



create table if not exists tafeln(
    pnr int not null,
    form enum('Rund', 'Eckig') not null,

    FOREIGN KEY(pnr) REFERENCES produkte(pnr)
);



create table if not exists pralinen(
    pnr int not null,
    anzahl int not null,

    foreign key (pnr) REFERENCES produkte(pnr)
);



create table if not exists boxen(
    pnr int not null,
    material enum('Pappe', 'Plastick'),

    FOREIGN KEY(pnr) REFERENCES produkte(pnr)
);



create table if not exists produktionsstaette(
    psnr int not null,
    bezeichnung varchar(50) not null,

    PRIMARY KEY(psnr)
);



create table if not exists chargen(
    cnr int not null,
    herstelldatum date not null,
    chargenmenge int not null,
    pnr int not null,
    psnr int not null,

    PRIMARY KEY(cnr),
    FOREIGN KEY(pnr) REFERENCES produkte(pnr),
    FOREIGN KEY(psnr) REFERENCES produktionsstaette(psnr)

);



create table if not exists mitarbeiter(
    mnr int not null,
    name varchar(50) not null,
    vorname varchar(50) not null,
    anr int not null,

    PRIMARY KEY(mnr)
);



create table if not exists abteilung(
    anr int not null,
    bezeichnung varchar(50) not null,
    psnr int not null,
    mnr int not null,

    PRIMARY KEY(anr),
    FOREIGN KEY(psnr) REFERENCES produktionsstaette(psnr),
    FOREIGN KEY(mnr) REFERENCES mitarbeiter(mnr)
);

ALTER TABLE mitarbeiter ADD(
    FOREIGN KEY(anr) REFERENCES abteilung(anr)
);