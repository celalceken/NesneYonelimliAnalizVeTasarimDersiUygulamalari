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
-- Name: Kisi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Kisi" (
    "kisiNo" integer NOT NULL,
    ad character varying(25) NOT NULL,
    soyad character varying(25) NOT NULL,
    "kisiTuru" character(1) NOT NULL
);


ALTER TABLE public."Kisi" OWNER TO postgres;

--
-- Name: Kisi_kisiNo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Kisi_kisiNo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Kisi_kisiNo_seq" OWNER TO postgres;

--
-- Name: Kisi_kisiNo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Kisi_kisiNo_seq" OWNED BY public."Kisi"."kisiNo";


--
-- Name: Musteri; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Musteri" (
    "kisiNo" integer NOT NULL,
    "kimlikNo" character(11) NOT NULL,
    ilce integer,
    "kisiTuru" character(1) NOT NULL
);


ALTER TABLE public."Musteri" OWNER TO postgres;

--
-- Name: Musteri_kisiNo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Musteri_kisiNo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Musteri_kisiNo_seq" OWNER TO postgres;

--
-- Name: Musteri_kisiNo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Musteri_kisiNo_seq" OWNED BY public."Musteri"."kisiNo";


--
-- Name: Siparis; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Siparis" (
    "siparisNo" integer NOT NULL,
    "siparisTarihi" date DEFAULT '2019-01-01'::date,
    "toplamTutar" money,
    "musteriNo" integer NOT NULL
);


ALTER TABLE public."Siparis" OWNER TO postgres;

--
-- Name: SiparisKalemi; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."SiparisKalemi" (
    id integer NOT NULL,
    "siparisNo" integer NOT NULL,
    "urunNo" integer NOT NULL,
    "siparisBirimFiyati" integer NOT NULL,
    miktar integer NOT NULL
);


ALTER TABLE public."SiparisKalemi" OWNER TO postgres;

--
-- Name: SiparisKalemi_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."SiparisKalemi_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."SiparisKalemi_id_seq" OWNER TO postgres;

--
-- Name: SiparisKalemi_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."SiparisKalemi_id_seq" OWNED BY public."SiparisKalemi".id;


--
-- Name: Siparis_siparisNo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Siparis_siparisNo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Siparis_siparisNo_seq" OWNER TO postgres;

--
-- Name: Siparis_siparisNo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Siparis_siparisNo_seq" OWNED BY public."Siparis"."siparisNo";


--
-- Name: Urun; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Urun" (
    "urunNo" integer NOT NULL,
    adi character varying(30) NOT NULL,
    "birimFiyati" integer NOT NULL,
    "stokMiktari" integer NOT NULL
);


ALTER TABLE public."Urun" OWNER TO postgres;

--
-- Name: Urun_urunNo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Urun_urunNo_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public."Urun_urunNo_seq" OWNER TO postgres;

--
-- Name: Urun_urunNo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Urun_urunNo_seq" OWNED BY public."Urun"."urunNo";


--
-- Name: Kisi kisiNo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kisi" ALTER COLUMN "kisiNo" SET DEFAULT nextval('public."Kisi_kisiNo_seq"'::regclass);


--
-- Name: Musteri kisiNo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Musteri" ALTER COLUMN "kisiNo" SET DEFAULT nextval('public."Musteri_kisiNo_seq"'::regclass);


--
-- Name: Siparis siparisNo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Siparis" ALTER COLUMN "siparisNo" SET DEFAULT nextval('public."Siparis_siparisNo_seq"'::regclass);


--
-- Name: SiparisKalemi id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SiparisKalemi" ALTER COLUMN id SET DEFAULT nextval('public."SiparisKalemi_id_seq"'::regclass);


--
-- Name: Urun urunNo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Urun" ALTER COLUMN "urunNo" SET DEFAULT nextval('public."Urun_urunNo_seq"'::regclass);


--
-- Data for Name: Kisi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Kisi" VALUES (1, 'Elif', 'Faruk', 'M');


--
-- Data for Name: Musteri; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Musteri" VALUES (1, '123        ', NULL, 'M');


--
-- Data for Name: Siparis; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Siparis" VALUES (2, '2019-01-01', NULL, 1);
INSERT INTO public."Siparis" VALUES (1, '2019-01-01', NULL, 1);
INSERT INTO public."Siparis" VALUES (3, '2019-01-01', NULL, 1);
INSERT INTO public."Siparis" VALUES (4, '2019-01-01', NULL, 1);


--
-- Data for Name: SiparisKalemi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."SiparisKalemi" VALUES (6, 1, 5, 900, 2);
INSERT INTO public."SiparisKalemi" VALUES (7, 1, 3, 200, 2);
INSERT INTO public."SiparisKalemi" VALUES (8, 3, 3, 290, 3);
INSERT INTO public."SiparisKalemi" VALUES (9, 3, 5, 900, 2);
INSERT INTO public."SiparisKalemi" VALUES (10, 4, 4, 500, 3);
INSERT INTO public."SiparisKalemi" VALUES (11, 4, 5, 400, 3);


--
-- Data for Name: Urun; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Urun" VALUES (3, 'HDD', 300, 10);
INSERT INTO public."Urun" VALUES (4, 'RAM', 500, 4);
INSERT INTO public."Urun" VALUES (5, 'CPU', 1000, 10);


--
-- Name: Kisi_kisiNo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Kisi_kisiNo_seq"', 1, true);


--
-- Name: Musteri_kisiNo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Musteri_kisiNo_seq"', 1, true);


--
-- Name: SiparisKalemi_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."SiparisKalemi_id_seq"', 11, true);


--
-- Name: Siparis_siparisNo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Siparis_siparisNo_seq"', 2, true);


--
-- Name: Urun_urunNo_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Urun_urunNo_seq"', 5, true);


--
-- Name: SiparisKalemi SiparisKalemi_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SiparisKalemi"
    ADD CONSTRAINT "SiparisKalemi_pkey" PRIMARY KEY (id);


--
-- Name: SiparisKalemi SiparisUrun; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SiparisKalemi"
    ADD CONSTRAINT "SiparisUrun" UNIQUE ("siparisNo", "urunNo");


--
-- Name: Urun Urun_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Urun"
    ADD CONSTRAINT "Urun_pkey" PRIMARY KEY ("urunNo");


--
-- Name: Kisi kisiPK; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kisi"
    ADD CONSTRAINT "kisiPK" PRIMARY KEY ("kisiNo");


--
-- Name: Musteri musteriPK; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Musteri"
    ADD CONSTRAINT "musteriPK" PRIMARY KEY ("kisiNo");


--
-- Name: Siparis siparisPK; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Siparis"
    ADD CONSTRAINT "siparisPK" PRIMARY KEY ("siparisNo");


--
-- Name: SiparisKalemi lnk_Siparis_SiparisKalemi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SiparisKalemi"
    ADD CONSTRAINT "lnk_Siparis_SiparisKalemi" FOREIGN KEY ("siparisNo") REFERENCES public."Siparis"("siparisNo") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: SiparisKalemi lnk_Urun_SiparisKalemi; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."SiparisKalemi"
    ADD CONSTRAINT "lnk_Urun_SiparisKalemi" FOREIGN KEY ("urunNo") REFERENCES public."Urun"("urunNo") MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: Musteri musteriKisiFK; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Musteri"
    ADD CONSTRAINT "musteriKisiFK" FOREIGN KEY ("kisiNo") REFERENCES public."Kisi"("kisiNo");


--
-- Name: Siparis siparisMusteriFK; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Siparis"
    ADD CONSTRAINT "siparisMusteriFK" FOREIGN KEY ("musteriNo") REFERENCES public."Musteri"("kisiNo");


--
-- PostgreSQL database dump complete
--

