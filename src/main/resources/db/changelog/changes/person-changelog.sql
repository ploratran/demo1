--liquibase formatted sql

CREATE TABLE IF NOT EXISTS person (
    tax_id SMALLINT PRIMARY KEY NOT NULL,
    first_name VARCHAR(50) NOT NULL ,
    last_name VARCHAR(50) NOT NULL ,
    father_name VARCHAR(50),
    mother_name VARCHAR(50),
    date_of_birth DATE
);
