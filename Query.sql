CREATE DATABASE "retoKruger"
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Ecuador.1252'
    LC_CTYPE = 'Spanish_Ecuador.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE IF NOT EXISTS public.usuarios
(
    cedula character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nombres character varying(15) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(15) COLLATE pg_catalog."default" NOT NULL,
    email character varying(20) COLLATE pg_catalog."default" NOT NULL,
    tipousuario character varying(15) COLLATE pg_catalog."default",
    fechan character varying(15) COLLATE pg_catalog."default",
    direccion character varying(15) COLLATE pg_catalog."default",
    celular character varying(15) COLLATE pg_catalog."default",
    estadovacuna character varying(15) COLLATE pg_catalog."default",
    tipovacuna character varying(15) COLLATE pg_catalog."default",
    fechavacuna character varying(15) COLLATE pg_catalog."default",
    numerodosis character varying(15) COLLATE pg_catalog."default",
    CONSTRAINT usuarios_pkey PRIMARY KEY (cedula)
)
