PGDMP                         {            inventory_management_db    15.4    15.4 	    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16399    inventory_management_db    DATABASE     �   CREATE DATABASE inventory_management_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
 '   DROP DATABASE inventory_management_db;
                postgres    false            �            1259    16400    product    TABLE     �   CREATE TABLE public.product (
    id bigint NOT NULL,
    current_stock_level integer NOT NULL,
    description character varying(255),
    name character varying(255),
    reorder_point integer NOT NULL,
    total_units_sold integer NOT NULL
);
    DROP TABLE public.product;
       public         heap    postgres    false            �            1259    16407    product_seq    SEQUENCE     u   CREATE SEQUENCE public.product_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.product_seq;
       public          postgres    false            �          0    16400    product 
   TABLE DATA           n   COPY public.product (id, current_stock_level, description, name, reorder_point, total_units_sold) FROM stdin;
    public          postgres    false    214   $	       �           0    0    product_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.product_seq', 151, true);
          public          postgres    false    215            f           2606    16406    product product_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.product
    ADD CONSTRAINT product_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.product DROP CONSTRAINT product_pkey;
       public            postgres    false    214            �   _   x�3�45�t,(�I����\�Ɯ����nE�U�y
���)Ŝn���Fy#N�tPjZQfzjQbIj�BAQ~Jir���SjQQ%Hހ+F��� .�|     