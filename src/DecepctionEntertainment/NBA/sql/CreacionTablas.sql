/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  manul
 * Created: 22-abr-2019
 */

CREATE TABLE EQUIPOS (
    ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    NOMBRE VARCHAR(40) NOT NULL,
    FECHA_FUNDACIÓN DATE,
    PRESUPUESTO DECIMAL(10,2),
    CIUDAD VARCHAR(40),
    ESTADIO VARCHAR(50),
    NºCAMPEONATOS SMALLINT,
    DIVISIÓN VARCHAR(20),
    CONFERENCIA VARCHAR(20),
    ESCUDO VARCHAR(50),
    CONSTRAINT ID_EQUIPOS_PK PRIMARY KEY (ID)
);


CREATE TABLE JUGADORES (
    ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,
    NOMBRE VARCHAR(20) NOT NULL,
    APELLIDOS VARCHAR(40) NOT NULL,
    NºCAMISETA SMALLINT,
    POSICIÓN VARCHAR(10),
    PAÍS VARCHAR(20),
    PROMEDIO_PUNTOS_POR_PARTIDO DECIMAL(10,2),
    ALTURA DECIMAL(10,2),
    FECHA_NACIMIENTO DATE,
    SALARIO DECIMAL(10,2),
    EQUIPO INTEGER NOT NULL,
    AÑOS_ACTIVO SMALLINT,
    ANILLOS SMALLINT,
    ALL_STAR BOOLEAN,
    NºALL_STARS SMALLINT,
    MVP SMALLINT,
    FOTO VARCHAR(30),
    CONSTRAINT ID_JUGADORES_PK PRIMARY KEY (ID),
    CONSTRAINT E_JUGADORES_FK FOREIGN KEY (EQUIPO) REFERENCES EQUIPOS (ID)
); 