--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: KullaniciHesabi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."KullaniciHesabi" (
    id integer NOT NULL,
    "hesapNumarasi" integer NOT NULL,
    bakiye real NOT NULL,
    "musteriNo" integer NOT NULL,
    sifre integer
);


ALTER TABLE public."KullaniciHesabi" OWNER TO postgres;

--
-- Name: KullaniciHesabi_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."KullaniciHesabi_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."KullaniciHesabi_id_seq" OWNER TO postgres;

--
-- Name: KullaniciHesabi_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."KullaniciHesabi_id_seq" OWNED BY public."KullaniciHesabi".id;


--
-- Name: Musteri; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Musteri" (
    id integer NOT NULL,
    adi character varying(40) NOT NULL,
    soyadi character varying(40) NOT NULL
);


ALTER TABLE public."Musteri" OWNER TO postgres;

--
-- Name: MusteriHesabi; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW public."MusteriHesabi" AS
 SELECT "Musteri".adi,
    "Musteri".soyadi,
    "KullaniciHesabi"."hesapNumarasi",
    "KullaniciHesabi".bakiye,
    "KullaniciHesabi".sifre
   FROM (public."KullaniciHesabi"
     JOIN public."Musteri" ON (("KullaniciHesabi"."musteriNo" = "Musteri".id)));


ALTER TABLE public."MusteriHesabi" OWNER TO postgres;

--
-- Name: Musteri_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Musteri_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Musteri_id_seq" OWNER TO postgres;

--
-- Name: Musteri_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Musteri_id_seq" OWNED BY public."Musteri".id;


--
-- Name: KullaniciHesabi id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciHesabi" ALTER COLUMN id SET DEFAULT nextval('public."KullaniciHesabi_id_seq"'::regclass);


--
-- Name: Musteri id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Musteri" ALTER COLUMN id SET DEFAULT nextval('public."Musteri_id_seq"'::regclass);


--
-- Data for Name: KullaniciHesabi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."KullaniciHesabi" VALUES (1, 1, 200, 1, 1);
INSERT INTO public."KullaniciHesabi" VALUES (2, 2, 400, 2, 2);
INSERT INTO public."KullaniciHesabi" VALUES (3, 3, 54, 3, 3);


--
-- Data for Name: Musteri; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Musteri" VALUES (1, 'Ömer', 'Faruk');
INSERT INTO public."Musteri" VALUES (2, 'Elif', 'Çınar');
INSERT INTO public."Musteri" VALUES (3, 'Mehmet', 'Şahin');


--
-- Name: KullaniciHesabi_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."KullaniciHesabi_id_seq"', 3, true);


--
-- Name: Musteri_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Musteri_id_seq"', 3, true);


--
-- Name: KullaniciHesabi KullaniciHesabi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciHesabi"
    ADD CONSTRAINT "KullaniciHesabi_pkey" PRIMARY KEY (id);


--
-- Name: Musteri Musteri_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Musteri"
    ADD CONSTRAINT "Musteri_pkey" PRIMARY KEY (id);


--
-- Name: KullaniciHesabi lnk_Musteri_KullaniciHesabi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."KullaniciHesabi"
    ADD CONSTRAINT "lnk_Musteri_KullaniciHesabi" FOREIGN KEY ("musteriNo") REFERENCES public."Musteri"(id) MATCH FULL;


--
-- PostgreSQL database dump complete
--

