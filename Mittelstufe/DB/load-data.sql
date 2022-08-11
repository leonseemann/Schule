LOAD DATA INFILE 'Personaltabelle.txt'
	IGNORE
	INTO TABLE personaltabelle
    FIELDS
        TERMINATED BY "#"
        OPTIONALLY ENCLOSED BY "/"
        LINES TERMINATED BY "\n"
        IGNORE 1 LINES 