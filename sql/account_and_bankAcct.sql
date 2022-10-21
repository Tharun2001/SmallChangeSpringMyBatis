drop table sc_bankaccount;
drop table sc_account;

CREATE TABLE sc_account (
    username varchar(255),
    acctnum varchar(255) NOT NULL PRIMARY KEY,
    accttype varchar(255) NOT NULL
);

CREATE TABLE sc_bankaccount (
    acctnum varchar(255),
    bank_acctnum varchar(255) NOT NULL,
    bank_name varchar(255) NOT NULL,
    balance decimal(20,2),
    PRIMARY KEY(bank_acctnum),
    FOREIGN KEY(acctnum) REFERENCES sc_account(acctnum)
); 


INSERT INTO sc_account(USERNAME, ACCTNUM, ACCTTYPE) VALUES ('aryan@smallchange.com', 'ABC123', 'Brokerage');
INSERT INTO sc_bankaccount(acctnum, bank_acctnum, bank_name, balance) values('ABC123', '608502111', 'XYZ bank', 1050000.0);

COMMIT;