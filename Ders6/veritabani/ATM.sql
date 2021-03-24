--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3
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

--
-- Data for Name: Musteri; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Musteri" VALUES
	(2, 'Elif', 'Çınar'),
	(3, 'Mehmet', 'Yılmaz'),
	(1, 'Ömer', 'Demir');


--
-- Data for Name: KullaniciHesabi; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."KullaniciHesabi" VALUES
	(1, 1, 200, 1, 1),
	(3, 3, 407, 3, 3),
	(2, 2, 300, 2, 2);


--
-- Name: KullaniciHesabi_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."KullaniciHesabi_id_seq"', 3, true);


--
-- Name: Musteri_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Musteri_id_seq"', 3, true);


--
-- PostgreSQL database dump complete
--

